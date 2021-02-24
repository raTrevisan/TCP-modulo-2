
public abstract class ExpressaoBinaria implements ExpressaoLogica{
private ExpressaoLogica e1;
private ExpressaoLogica e2;
	
public ExpressaoLogica getExpressao1() {
	return e1;
}

public ExpressaoLogica getExpressao2() {
	return e2;
}

ExpressaoBinaria(ExpressaoLogica exp1, ExpressaoLogica exp2){
	this.e1 = exp1;
	this.e2 = exp2;
}

}
