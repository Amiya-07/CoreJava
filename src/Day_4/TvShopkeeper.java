package Day_4;

public class TvShopkeeper {

	public static void main(String[] args)
	{
		double pp=32500;
		double profit=(pp*(0.27));
		double sp1=profit+pp;
		double vat=(sp1*(0.127));
		double sc = (sp1*(0.0387));
		double  sp= sp1+vat+sc;
		System.out.println("The selling price of TV is : "+sp);
		System.out.println("profit with vat and service charge "+(sp-pp));
	}

}
