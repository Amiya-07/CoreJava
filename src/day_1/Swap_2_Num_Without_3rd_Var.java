package day_1;

public class Swap_2_Num_Without_3rd_Var
{
  public static void main(String[] s) 
  {
	  int x=Integer.parseInt(s[0]);
	  int y=Integer.parseInt(s[1]);
	  x=x+y;
	  y=x-y;
	  x=x-y;
	  System.out.println("After Swapping x = "+x);
	  System.out.println("After Swapping y = "+y);
  }
}
