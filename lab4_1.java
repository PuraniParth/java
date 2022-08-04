import java.util.Scanner;

 class stack{	
	Scanner sc=new Scanner(System.in);
	int top=-1;	
	int n=5;
	int s[] =new int[n];

  void push(){
	if (top==n-1) {
		System.out.println("stack overflow");
	}
	else{
		System.out.println("enter your No:");
		int i=sc.nextInt();
		
		top=top+1;
		s[top]=i;
		System.out.println("inserted!");
	}
  }

  void pop(){
  	if (top<=-1) {
  		System.out.println("stack overflow!");
  	}
  	else {
  		top--;
  		System.out.println("deleted");
  	}
  }

  void display(){
  	System.out.println("elements are:");
  		for (int j=top;j>=0 ;j-- ) {
  			System.out.println(s[j]);
  		}
  }
  void peep(){
 	System.out.println("enter the ith element");
 	int i=sc.nextInt();

  	if (top-i+1<=-1) {
  		System.out.println("ith element not available");

  	}
  	else{
  		System.out.println(s[top-i+1]);
  	}
  }

  void change(){
  	System.out.println("enter the ith element");
  	int i=sc.nextInt();

  	System.out.println("enter the new value");
  	int num=sc.nextInt();

  	if (top-i+1<=-1) {
  		System.out.println("ith element not available");
  	}
  	else{
  		s[top-i+1]=num;
  		System.out.println("changed!");
  	}
  }
}

public class lab4_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack sk=new stack();

		while(true){
		System.out.print("Enter 1 For Push\n"+" ");
		System.out.print("Enter 2 For pop\n"+" ");
		System.out.print("Enter 3 For display\n"+" ");
		System.out.print("Enter 4 For Peep\n"+" ");
		System.out.print("Enter 5 For change\n"+" ");

		int q=sc.nextInt();

		if (q==1) {
			sk.push();
		}
		else if (q==2) {
			sk.pop();
		}
		else if (q==3) {
			sk.display();
		}
		else if (q==4) {
			sk.peep();
		}
		else if (q==5) {
			sk.change();
		}
	}
  }
}