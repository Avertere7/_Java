package bankomat;

public class StanBezKarty implements BankomatStan //kiedy nie ma karty
{

	@Override
	public void wprowadzKarte(Klient klient) 
	{
		System.out.println("Wprowadzono karte..."); //mozna wprowadzic karte
		System.out.println("Witaj "+klient.getImie()+" "+klient.getNazwisko());
		
	}

	@Override
	public void pobierzKarte() 
	{
		System.out.println("Bankomat nie aktywny, wprowadz karte"); // nie mozna pobrac karty
		
	}

	@Override
	public void wprowadzPin(Klient klient,Bankomat bankomat) 
	{
		System.out.println("Bankomat nie aktywny, wprowadz karte"); // nie mozna wprowadzic pinu
		
	}
	

}
