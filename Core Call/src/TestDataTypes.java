import java.util.Scanner;

public class TestDataTypes {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);// object
		System.out.println("ENter your numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();;
		c=a-b;
		System.out.println("sub="+c);  // zero
	}
}
