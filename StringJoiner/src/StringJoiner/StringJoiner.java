package StringJoiner;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
        String str2=sc.next();
        System.out.println(joinStrings(str1,str2));
		System.out.println(joinStrings("Hello, ", "World!"));
	}
	public static String joinStrings(String str1, String str2)
	{
	 return str1+str2;	
	}
}
