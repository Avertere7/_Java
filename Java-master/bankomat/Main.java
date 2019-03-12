package bankomat;

public class Main {

	public static void main(String[] args) 
	{
		Bankomat bankomat = new Bankomat(1000.00);
		Klient k = new Klient("Sebastian","Tarnosch",1234);
		Klient k2 = new Klient("Adam","Kowalski",1357);
		System.out.println("Witamy Szmallenium!");
		System.out.println("Proszê wprowadziæ kartê");
		bankomat.wprowadzKarte(k);
		bankomat.wprowadzPin(k,bankomat);
		bankomat.wprowadzKarte(k);
		bankomat.wprowadzPin(k,bankomat);
		bankomat.wprowadzKarte(k2);
		bankomat.wprowadzPin(k2, bankomat);


	}

}
