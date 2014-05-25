import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vesal on 10.04.14.
 */
public class EvalVisitor extends MRMBaseVisitor<Integer> {
    private Map<String, Integer> map;

    public EvalVisitor() {
        map = new HashMap<String, Integer>();
    }

    @Override
    public Integer visitFunktsiooniValjakutse(@NotNull MRMParser.FunktsiooniValjakutseContext ctx) {
        String fun = ctx.Nimi().getText();
        if (fun.equalsIgnoreCase("print")) {
            int value = visit(ctx.avaldis(0));
            System.out.println(value);
        }
        return super.visitFunktsiooniValjakutse(ctx);
    }

    // SEDA TULEKS HILJEM KUSTUTADA
    @Override
    public Integer visitLause(@NotNull MRMParser.LauseContext ctx) {
        try {
            return super.visitLause(ctx);
        } catch (Exception e) {
            System.out.println("VIGA: " + ctx.getText());
            return null;
        }
    }

    @Override
    public Integer visitMuutujaDeklaratsioon(@NotNull MRMParser.MuutujaDeklaratsioonContext ctx) {
        String muutuja = ctx.Nimi().getText();
        int value = 0;
        if (ctx.avaldis() != null)
            value = visit(ctx.avaldis());
        map.put(muutuja, value);
        return null;
    }

    public Integer visitArvLit(@NotNull MRMParser.ArvLitContext ctx){
        return  Integer.parseInt(ctx.Arvuliteraal().getText());
    }

    @Override
    public Integer visitNimiLit(@NotNull MRMParser.NimiLitContext ctx) {
        return map.get(ctx.Nimi().getText());
    }

    @Override
    public Integer visitLiitmineLahutamine(@NotNull MRMParser.LiitmineLahutamineContext ctx) {
        int vasak = visit(ctx.avaldis4());
        int parem = visit(ctx.avaldis3());
        if (ctx.getChild(1).getText().equals("+")){
            return vasak+parem;
        }
        return vasak-parem;
    }

    @Override
    public Integer visitParens(@NotNull MRMParser.ParensContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Integer visitKorrutamineJagamine(@NotNull MRMParser.KorrutamineJagamineContext ctx) {
        int vasak = visit(ctx.avaldis3());
        int parem = visit(ctx.avaldis2());
        if (ctx.getChild(1).getText().equals("*")){
            return vasak*parem;
        }
        return vasak/parem;
    }
}
