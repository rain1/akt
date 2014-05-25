import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import com.sun.jna.Native;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinBase.SYSTEMTIME;
import com.sun.jna.platform.win32.WinBase.SYSTEM_INFO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.akt";
        //if ( args.length>0 ) inputFile = "input.akt";
        //File f = new File(filePathString);

        Kernel32 INSTANCE = (Kernel32) Native
                .loadLibrary("Kernel32", Kernel32.class);

        Object a= '\n';
        System.out.println("ptsi"+ a.getClass());
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        MRMLexer lexer = new MRMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MRMParser parser = new MRMParser(tokens);
        ParseTree tree = parser.programm(); // parse
        System.out.println(tree.toStringTree(parser));
        EvalVisitor eval = new EvalVisitor();
        eval.setGlobal("u",2.79);
        eval.visit(tree);
        System.out.println("asdf"+ eval.getGlobalDouble("n"));
    }
}
