import java.util.Map;

public class ExpressaoOr extends ExpressaoBinaria{
	
	@Override
	public String toString(){
		return "(" + this.getExpressao1() + " Or " + this.getExpressao2()+ ")";
	}
	
	@Override
	public boolean eval (Map<String,Boolean > valoresVariaveis) {
		return getExpressao1().eval(valoresVariaveis) | getExpressao2().eval(valoresVariaveis);

	}
	
	ExpressaoOr(ExpressaoLogica exp1,ExpressaoLogica exp2 ){
		super(exp1, exp2);
	}
}
