import java.util.Map;

public class ExpressaoImplicacao extends ExpressaoBinaria{
	
	@Override
	public String toString(){
		return "(" + this.getExpressao1() + " --> " + this.getExpressao2()+ ")";
	}
	
	@Override
	public boolean eval (Map<String,Boolean > valoresVariaveis) {
		if (getExpressao1().eval(valoresVariaveis)){
		return getExpressao2().eval(valoresVariaveis);	
		}
		return true;
	}
	
	ExpressaoImplicacao(ExpressaoLogica exp1,ExpressaoLogica exp2 ){
		super(exp1, exp2);
	}
	
}
