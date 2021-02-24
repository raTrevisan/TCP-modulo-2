
public abstract class ExpressaoUnaria implements ExpressaoLogica{
private ExpressaoLogica e1;

public ExpressaoLogica getUnaria() {
	return e1;
	}

ExpressaoUnaria(ExpressaoLogica exp){
	e1=exp;
	}

}
