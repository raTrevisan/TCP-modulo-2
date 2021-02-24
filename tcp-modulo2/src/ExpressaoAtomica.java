import java.util.Map;

public class ExpressaoAtomica implements ExpressaoLogica{

	private String var;
	
	public String getAtom() {
		return var;
	}
	
	@Override
	public String toString(){
		return var;
	}
	@Override
	public boolean eval (Map<String,Boolean > valoresVariaveis) {
		return valoresVariaveis.get(var);
	}
	
	ExpressaoAtomica(String atom){
		var = atom;
	}
}
