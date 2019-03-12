package bankomat;

public interface BankomatStan  //interfejs
{
	public void wprowadzKarte(Klient klient);
	
	public void pobierzKarte();
	
	public void wprowadzPin(Klient klient,Bankomat bankomat);
}
