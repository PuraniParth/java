import java.util.Scanner;
	public class SwapNo{
		int a,b;
		public void swappingno(SwapNo stn){
			int temp;
			temp=stn.a;
			stn.a=stn.b;
			stn.b=temp;
		}
		public static void main(String[] args) {
			SwapNo sw=new SwapNo();
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the no:");
			sw.a=sc.nextInt();
			System.out.print("enter the no:");
			sw.b=sc.nextInt();
			sw.swappingno(sw);
			System.out.println("a="+sw.a);
			System.out.println("b="+sw.b);			
		}
	}		

