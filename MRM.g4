grammar MRM; //reflection 7. kodutoo

programm
    :   lause (lause)*
    ;

lause
    :   ifLause
    |   avaldis ';'
    |   funktsioon
    |   returnLause ';'
    |   muutujaDeklaratsioon ';'
    |   '{' lause (';' lause)* '}'
    ;

muutujaDeklaratsioon: Nimi '=' avaldis ;


ifLause
    :   'if' avaldis 'do'  lause (lause)* 'end'
    ;

funktsioon
    :   'function' Nimi '(' (Nimi (',' Nimi)*)? ')'  lause (lause)* 'end'
    ;

avaldis
    :   avaldis5
    ;

returnLause: 'return' avaldis ;

avaldis5
    :   avaldis4
            ('>'|'<'|'>='|'<='|'=='|'!=') avaldis4      # Vordlemine
    |   avaldis4                                        # TriviaalneAvaldis5
    ;

avaldis4
    :   avaldis4 ('+'|'-') avaldis3                  # LiitmineLahutamine
    |   avaldis3                                        # TriviaalneAvaldis4
    ;

avaldis3
    :   avaldis3 ('*'|'/') avaldis2                  # KorrutamineJagamine
    |   avaldis2                                        # TriviaalneAvaldis3
    ;

avaldis2
    :   '-' avaldis2                                    # UnaarneMiinus
    |   avaldis1                                        # TriviaalneAvaldis2
    ;

avaldis1
    :   Nimi '(' (avaldis (',' avaldis)*)? ')'          # FunktsiooniValjakutse
    |   avaldis0                                        # TriviaalneAvaldis1
    ;

avaldis0
    :   Nimi                                            # NimiLit
    |   Arvuliteraal                                    # ArvLit
    |   Soneliteraal                                    # SoneLit
    |   '(' avaldis ')'                                 # Parens
    ;


Nimi
    :   [a-zA-Z][a-zA-Z0-9_]*
    ;

Arvuliteraal
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;

Soneliteraal
    :   '"' ~["\n\r]* '"' // Tildega saab väljendada eitust.
    ;                     // Siin ~["\n\r] tähistab suvalist tähte
                          // mis pole jutumärk ega reavahetuse sümbol.

Kommentaar
    :   '/*' .*? '*/' -> skip
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;