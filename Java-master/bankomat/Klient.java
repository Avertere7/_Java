package bankomat;



public class Klient {
	
	private String Imie;
	private String Nazwisko;
	private int PIN;
	private double Stan;
	private int proby;
	private boolean zablokowany;
	
	
	
	public String getImie() {
		return Imie;
	}

	public String getNazwisko() {
		return Nazwisko;
	}


	public boolean isZablokowany() {
		return zablokowany;
	}

	public int getPIN() {
		return PIN;
	}
	public double getStan() {
		return Stan;
	}
	public void setStan(double stan) {
		Stan = stan;
	}
	public int getProby() {
		return proby;
	}
	public void setProby(int proby) {
		this.proby = proby;
	}
	
	public Klient(String Imie, String Nazwisko, int PIN)
	{
		this.Imie=Imie;
		this.Nazwisko=Nazwisko;
		this.PIN=PIN;
		this.proby=0;
		
	}

	public void zablokuj(Klient klient)
	{
		System.out.println("Karta zosta³a zablokowana");
		klient.zablokowany=true;
	}
	

}
