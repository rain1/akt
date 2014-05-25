import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinBase.SYSTEMTIME;
import com.sun.jna.platform.win32.WinBase.SYSTEM_INFO;


import java.io.IOException;

public class Main {

    static EvalVisitor eval = new EvalVisitor();

    public static void sisestus(EvalVisitor e, String s){
        ANTLRInputStream input = new ANTLRInputStream(s);
        MRMLexer lexer = new MRMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MRMParser parser = new MRMParser(tokens);
        ParseTree tree = parser.programm(); // parse
        //System.out.println(tree.toStringTree(parser));
        e.visit(tree);
    }

    public static void addArg(String key, Double value){
        eval.setGlobal(key, value);
    }

    public static void main(String[] args) throws IOException {
        addArg("a", 2.0);
        addArg("b", 4.0);
        sisestus(eval, "print(3+a-b);");
        sisestus(eval,"u=atoi(charAt(\"Hello\",1));");
        sisestus(eval, "print(u+3.14);");
    }
}
