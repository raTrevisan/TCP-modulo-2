import java.util.Map;
public class ExpressaoAnd extends ExpressaoBinaria{
	
	@Override
	public String toString(){
		return "(" + this.getExpressao1() + " and " + this.getExpressao2()+ ")";
	}
	
	@Override
	public boolean eval (Map<String,Boolean > valoresVariaveis) {
		return getExpressao1().eval(valoresVariaveis) & getExpressao2().eval(valoresVariaveis);

	}
	
	ExpressaoAnd(ExpressaoLogica exp1,ExpressaoLogica exp2 ){
		super(exp1, exp2);
	}
}
