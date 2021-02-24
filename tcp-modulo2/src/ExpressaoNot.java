import java.util.Map;

public class ExpressaoNot extends ExpressaoUnaria{
	
	@Override
	public String toString(){
		return ("(not " + this.getUnaria() + ")");
	}
	@Override
	public boolean eval (Map<String,Boolean > valoresVariaveis) {
		return !this.getUnaria().eval(valoresVariaveis);
	}
	
	ExpressaoNot(ExpressaoLogica exp){
		super(exp);
	}
}
