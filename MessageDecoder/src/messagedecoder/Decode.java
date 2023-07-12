package messagedecoder;
import java.util.Scanner;
public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		MessageDecoder decoder = new MessageDecoder();
		System.out.printf("%d\n",decoder.decodeCharacter(ch));
		System.out.printf("%d",decoder.decodeCharacter('A'));
	}

}
