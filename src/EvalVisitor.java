import com.sun.beans.editors.IntegerEditor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vesal on 10.04.14.
 */
public class EvalVisitor extends MRMBaseVisitor<Object> {
    private Map<String, Object> map;

    public void setGlobal(String name, Object value){
        map.put(name,value);
    }

    public Object getGlobal(String name){
        return map.get(name);
    }

    public int getGlobalInt(String name){
        Double ret =  (Double)map.get(name);
        return  ret.intValue();
    }

    public double getGlobalDouble(String name){
        return  (Double)map.get(name);
    }

    public char getGlobalChar(String name){
        return  (Character)map.get(name);
    }

    public String getGlobalString(String name){
        return  (String)map.get(name);
    }

    public EvalVisitor() {
        map = new HashMap<String, Object>();
    }

    @Override
    public Object visitFunktsiooniValjakutse(@NotNull MRMParser.FunktsiooniValjakutseContext ctx) {
        String fun = ctx.Nimi().getText();
        if (fun.equalsIgnoreCase("print")) {
            Object value = visit(ctx.avaldis(0));
            System.out.println(value);
        }else if (fun.equalsIgnoreCase("add")){
            return (Double)visit(ctx.avaldis(0))+(Double)visit(ctx.avaldis(1));
        }
        else if (fun.equalsIgnoreCase("charAt")){
            String str = (String)visit(ctx.avaldis(0));
            Double dpos =  (Double)visit(ctx.avaldis(1));
            int pos = dpos.intValue();
            return  String.valueOf(str.charAt(pos));
        }else if (fun.equalsIgnoreCase("atoi")){
            String schr = (String)visit(ctx.avaldis(0));
            char chr = schr.charAt(0);
            int id = (int)chr;
            double did = (double)id;
            return (Double) did;
        }
        return super.visitFunktsiooniValjakutse(ctx);
    }

    // SEDA TULEKS HILJEM KUSTUTADA
    @Override
    public Object visitLause(@NotNull MRMParser.LauseContext ctx) {
        try {
            return super.visitLause(ctx);
        } catch (Exception e) {
            System.out.println("VIGA: " + ctx.getText());
            return null;
        }
    }

    @Override
    public Object visitMuutujaDeklaratsioon(@NotNull MRMParser.MuutujaDeklaratsioonContext ctx) {
        String muutuja = ctx.Nimi().getText();
        Object value = 0;
        if (ctx.avaldis() != null)
            value = visit(ctx.avaldis());
        map.put(muutuja, value);
        return null;
    }

    public Object visitArvLit(@NotNull MRMParser.ArvLitContext ctx){
        return  Double.parseDouble(ctx.Arvuliteraal().getText());
    }

    @Override
    public Object visitSoneLit(@NotNull MRMParser.SoneLitContext ctx) {
        return ctx.Soneliteraal().getText();
    }

    @Override
    public Object visitNimiLit(@NotNull MRMParser.NimiLitContext ctx) {
        return map.get(ctx.Nimi().getText());
    }

    @Override
    public Object visitLiitmineLahutamine(@NotNull MRMParser.LiitmineLahutamineContext ctx) {
        Object vasak = visit(ctx.avaldis4());
        Object parem = visit(ctx.avaldis3());
        if (ctx.getChild(1).getText().equals("+")){
            return (Double)vasak+(Double)parem;
        }
        return (Double)vasak-(Double)parem;
    }

    @Override
    public Object visitParens(@NotNull MRMParser.ParensContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Object visitKorrutamineJagamine(@NotNull MRMParser.KorrutamineJagamineContext ctx) {
        Object vasak = visit(ctx.avaldis3());
        Object parem = visit(ctx.avaldis2());
        if (ctx.getChild(1).getText().equals("*")){
            return (Double)vasak*(Double)parem;
        }
        return (Double)vasak/(Double)parem;
    }
}
