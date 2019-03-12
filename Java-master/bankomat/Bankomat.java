package bankomat;

public class Bankomat implements BankomatStan 
{

	private BankomatStan StanBankomat;
	private double Sejf;
	private boolean zablokowany;

	public boolean isZablokowany() {
		return zablokowany;
	}

	public void setZablokowany(boolean zablokowany) {
		this.zablokowany = zablokowany;
	}

	public double getSejf() {
		return Sejf;
	}

	public void setSejf(double sejf) {
		Sejf = sejf;
	}

	public Bankomat(double Sejf)
	{
		StanBankomat= new StanBezKarty(); //konstruktor
		this.zablokowany=false;
		this.Sejf=Sejf;
	}
	
	public BankomatStan getStanBankomat() 
	{
		return StanBankomat;
	}

	public void setStanBankomat(BankomatStan stanBankomat) 
	{
		this.StanBankomat = stanBankomat;
	}


	@Override
	public void wprowadzKarte(Klient klient) 
	{
		StanBankomat.wprowadzKarte(klient); //wprowadzono karte wiec zmieniamy stan na wprowadzono karte
		
		if(StanBankomat instanceof StanBezKarty)//jezeli stan jest bez karty to..
		{
			BankomatStan StanZKarta = new StanZKarta(); // tworzymy objekt z karta
			setStanBankomat(StanZKarta); // zmieniamy Stan na z karta
			
		}
	}

	@Override
	public void pobierzKarte() 
	{
		StanBankomat.pobierzKarte();// pobrano karte wiec zmieniamy stan na bankomat bez karty
		
		if(StanBankomat instanceof StanZKarta) // jezeli stan jest z karta to zmien na bez karty
		{
			BankomatStan StanBezKarty= new StanBezKarty();
			setStanBankomat(StanBezKarty);
			
		}
		
	}

	@Override
	public void wprowadzPin(Klient klient,Bankomat bankomat)
	{
		StanBankomat.wprowadzPin(klient,bankomat); 
		
	}
	
}
