import java.util.Scanner;


public class DecimaltoBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String a=" ";
		System.out.println("Onluk tabanda bir sayi giriniz:");
		int sayi=input.nextInt();
		for(;;){
			a=sayi%2+a;
			sayi=sayi/2;
			if (sayi==1) {
				break;
			}
		}System.out.println("1"+a);
	}
}
