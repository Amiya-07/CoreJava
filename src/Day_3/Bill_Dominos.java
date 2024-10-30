package Day_3;

public class Bill_Dominos {

	public static void main(String[] args)
	{
		int crp=60;
		int vpp=25;
		int crq=Integer.parseInt(args[0]);
		int vpq=Integer.parseInt(args[1]);
		int sp=(crp*crq)+(vpp*vpq)-50;
		int fp=(crp*crq)+(vpp*vpq);
		System.out.println("\t\t\tDOMINOS\t\t\t");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("ITEM\t\t\tPRICE\t\tQUANTITY\tPRICE\t\t");
		System.out.println("Chiken Roll\t\t"+crp+"\t\t"+crq+"\t\t"+(crp*crq));
		System.out.println("Veg Pattice\t\t"+vpp+"\t\t"+vpq+"\t\t"+(vpp*vpq));
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("TOTAL AMOUNT\t\t\t\t\t\t"+"Rs "+fp);
		System.out.println("SPECIAL DISCOUNT\t\t\t\t\tRs "+"50");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("TOTAL BILL\t\t\t\t\t\t"+"Rs "+sp);
		System.out.println("\n\n\t\t\tTHANK YOU\t\t\t");
		
	}

}
