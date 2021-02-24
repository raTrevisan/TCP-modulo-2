import java.util.HashMap;
import java.util.Map;
public class TestaExpressaoLogica {

	public static void main(String[] args) {

		ExpressaoLogica a = new ExpressaoAtomica("A");
		ExpressaoLogica b = new ExpressaoAtomica("B");
		ExpressaoLogica c = new ExpressaoAtomica("C");
		ExpressaoLogica d = new ExpressaoAtomica("D");

		//esquerda da implicacao
		ExpressaoLogica a_ou_b = new ExpressaoOr(a,b);
		ExpressaoLogica a_e_c = new ExpressaoAnd(a,c);
		ExpressaoLogica esq = new ExpressaoImplicacao(a_ou_b,a_e_c);
		
		//direita da implicacao
		ExpressaoLogica nb = new ExpressaoNot(b);
		ExpressaoLogica nb_e_c = new ExpressaoAnd(nb,c);
		ExpressaoLogica a_e_d = new ExpressaoAnd(a,d);
		ExpressaoLogica dir = new ExpressaoOr(nb_e_c,a_e_d);
		
		ExpressaoImplicacao res = new ExpressaoImplicacao(esq,dir);
		System.out.println(res.toString());
		
		Map<String,Boolean> valoresVariaveis = new HashMap<>();
		valoresVariaveis.put("A", false);	
		valoresVariaveis.put("B", true); 	
		valoresVariaveis.put("C", true);	
		valoresVariaveis.put("D", false);
	
		System.out.println(res.eval(valoresVariaveis));

	}

}