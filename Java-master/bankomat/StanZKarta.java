package bankomat;

import java.util.Scanner;

public class StanZKarta implements BankomatStan //kiedy karta jest wprowadzona
{

	@Override
	public void wprowadzKarte(Klient klient) 
	{
		System.out.println("Nie mo¿na wprowadziæ karty, karta jest w bankomacie"); // nie mozna wprowadzic kart
		
	}

	@Override
	public void pobierzKarte() 
	{
		System.out.println("Karta zosta³a wyporwadzona...");//mozna pobrac karte
		System.out.println("Dziekujemy za skorzystanie z naszych us³ug. Mi³ego dnia :)");
		System.out.println("***********************");
	}

	@Override
	public void wprowadzPin(Klient klient,Bankomat bankomat) 
	{
		
		if(klient.isZablokowany())//kiedy karta jest zablokowana
		{
			System.out.println("Karta zablokowana");
			bankomat.pobierzKarte();
		}
		else if(bankomat.isZablokowany() || bankomat.getSejf()==0) //kiedy bankomat jest zablokowany lub nie ma srodkow 
		{
			System.out.println("Bankomat chwilowo zablokowany, przepraszamy za utrudnienia");
			bankomat.pobierzKarte();
		}
		else
		{
			System.out.println("Wprowadz kod PIN:");
			Scanner n = new Scanner(System.in);
			while(klient.getPIN()!=n.nextInt())//wykonuj dopoki pin jest zly
			{
				if(klient.getProby()==2)
				{
					klient.zablokuj(klient);
					bankomat.pobierzKarte();
					break;
				}
				else
				{
					klient.setProby(klient.getProby()+1);
					System.out.println("Z³y kod, pozosta³y "+(3-klient.getProby())+" proby");
				}
			}
			if(!klient.isZablokowany())
			{
				klient.setProby(0);
				System.out.println("Podaj kwote do wyplacenia");
				int x=n.nextInt();
				if(x>bankomat.getSejf())
				{
					System.out.println("Brak wystarczajacych srodkow w sejfie, mozna wyplacic: "+bankomat.getSejf());
					System.out.println("Potwierdz(T/N)Odmow");
					bankomat.setZablokowany(true);
					String y=n.next();
					
					if(y.equals("t") || y.equals("T"))
					{
						System.out.println("Wyplata srodkow...");
						bankomat.setSejf(0);
						bankomat.pobierzKarte();
						
					}else if(y=="n" || y=="N")
					{
						bankomat.pobierzKarte();
						
						
					}
					
				}
				else
				{
					System.out.println("Wyplata srodkow...");
					bankomat.setSejf(bankomat.getSejf()-x);
					bankomat.pobierzKarte();
				}
				
			}
		}
		
	}

}
