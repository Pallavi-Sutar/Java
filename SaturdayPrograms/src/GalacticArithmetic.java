import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
long num1=scan.nextLong();
long num2=scan.nextLong();
long num3=galacticAddition(num1,num2);
System.out.println(num3);
	}
public static long galacticAddition(long num1,long num2)
{
	return num1+num2;
}
	
}
