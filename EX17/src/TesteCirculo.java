public class TesteCirculo {
	public static void main(String[] args) {
		Circulo[] ArrayUm = new Circulo[5];
		ArrayUm[0] = new Circulo(1,1,5);
		ArrayUm[1] = new Circulo(1,2,4);
		ArrayUm[2] = new Circulo(1,3,3);
		ArrayUm[3] = new Circulo(4,1,2);
		ArrayUm[4] = new Circulo(6,9,1);
		
		for(int i = 0 ; i < 5 ;i ++) {
		System.out.println("Circulo n "+i+" X,Y,R : " + ArrayUm[i].centro.getx()+ " " +ArrayUm[i].centro.gety()+" " +ArrayUm[i].getRaio());
		}
	
		Circulo[] ArrayDois = new Circulo[5];
		ArrayDois = ArrayUm;
		for(int i = 0 ; i < 5 ;i ++) {
			System.out.println("Array n1 Circulo n "+i+" X,Y,R : " + ArrayUm[i].centro.getx()+ " " +ArrayUm[i].centro.gety()+" " +ArrayUm[i].getRaio());
			System.out.println("Array n2 Circulo n "+i+" X,Y,R : " + ArrayDois[i].centro.getx()+ " " +ArrayDois[i].centro.gety()+" " +ArrayDois[i].getRaio());
		}
		
		Circulo[] ArrayTres = new Circulo[5];
		for(int i = 0 ; i < 5 ;i ++) {
			ArrayTres[i] = ArrayUm[i];
			ArrayUm[i].setRaio(10);
			}
		
		for(int i = 0 ; i < 5 ;i ++) {
			System.out.println("Array n1 Circulo n "+i+" X,Y,R : " + ArrayUm[i].centro.getx()+ " " +ArrayUm[i].centro.gety()+" " +ArrayUm[i].getRaio());
			System.out.println("Array n2 Circulo n "+i+" X,Y,R : " + ArrayDois[i].centro.getx()+ " " +ArrayDois[i].centro.gety()+" " +ArrayDois[i].getRaio());
			System.out.println("Array n3 Circulo n "+i+" X,Y,R : " + ArrayTres[i].centro.getx()+ " " +ArrayTres[i].centro.gety()+" " +ArrayTres[i].getRaio());
		}		
	}
}