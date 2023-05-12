package musteritakip;
import java.util.*;
public class musteritakip {

	public static void main(String[] args) {
		bagliliste liste=new bagliliste();
		Scanner sec =new Scanner(System.in);
		int secim;
		do {
			System.out.println("1 ekle");
			System.out.println("2 sil");
			System.out.println("3 ara");
			System.out.println("4 yazdir");
			System.out.println("0 çıkış");
			secim=sec.nextInt();
			
			
			switch(secim) {
				case 1: liste.ekle();
						break;
				case 2: liste.sil();
						break;
				case 3: liste.musteriara();
						break;
				case 4: liste.yazdir();
						break;
				case 5: System.out.println("Hatali secim 0*5 arası seçin : ");
						break;
			}
		}
		while(secim!=0);
		
		
	}

}
