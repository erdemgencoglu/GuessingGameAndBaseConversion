import java.util.Scanner;

public class GuesingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("1 ile 100 arasinda bir sayi tut");
		int altsınır=1 ,ustsınır=100;
		for (;;) {
			int tahmin=(altsınır+ustsınır)/2;
			System.out.printf("Tuttuğunuz sayi =%d (0:Doğru 1:Sayım daha düşük 2:Sayım daha yüksek):",tahmin);
			int girdi=input.nextInt();	
			if (girdi==0) {
				System.exit(0);
			}else if(girdi==1){
				ustsınır=tahmin;
			}else if(girdi==2){
				altsınır=tahmin;
			}
		}
		
	}

}

