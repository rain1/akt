import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "input.akt";
        //if ( args.length>0 ) inputFile = "input.akt";
        //File f = new File(filePathString);
        //System.out.println("ptsi"+ (new File(inputFile)).exists());
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        MRMLexer lexer = new MRMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MRMParser parser = new MRMParser(tokens);
        ParseTree tree = parser.programm(); // parse
        System.out.println(tree.toStringTree(parser));
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
