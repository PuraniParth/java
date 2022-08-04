import java.util.Scanner;
class scoreDemo
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int runperover[][]=new int[3][6];
		for (int i=0;i<3;i++1) 
		{
			for (int j=0;j<6;j++)
			{
				System.out.println("enetr run taken"+"in over number"+(i+1)+"and ball over"+(j+1)+"=");
				runperover[i][j] =s.nextInt();		
			}	
		}
		int totalrun=0;
		for (int i=0;i<3;i++1) 
		{
			for (int j=0;j<6;j++){
				totalrun + = runperover [i][j];
			}
		}
	}
}