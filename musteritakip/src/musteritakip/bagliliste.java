package musteritakip;
import java.util.*;

public class bagliliste {
	Node head=null;
	Node tail=null;
	
	int id;
	String ad;
	String soyad;
	String tel;
	String adres;
	String urun;
	Scanner input=new Scanner(System.in);
	Scanner sinput=new Scanner(System.in);
	
	void ekle() {
		System.out.println("müsterinin bilgilerini giriniz");
		System.out.print("numarası:   ");
		id=input.nextInt();
		System.out.print("ad      :   ");
		ad=sinput.nextLine();
		System.out.print("soyad   :   ");
		soyad=sinput.nextLine();
		System.out.print("telefon :   ");
		tel=sinput.nextLine();
		System.out.print("adres   :   ");
		adres=sinput.nextLine();
		System.out.print("urun    :   ");
		urun=sinput.nextLine();
	
		Node eleman=new Node(id, ad, soyad, tel, adres, urun);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
			System.out.println("liste oluştutuldu ilk müşteri kayıt edildi..");
		}
		else {
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
			System.out.println("\n"+id+"numaralı müşteri kayıt edildi..");
		}
		
	}
	
	void sil() {
	
		if(head==null) {
			System.out.println("liste boş");
		}
		
		else if(head.next==null && head.id==id) { //listede tek eleman varsa
			head=null;
			tail=null;
			System.out.println(id+"numaralı müşteri kayıt silindi..");
		}
		else {
			System.out.println(" silinecek müsterinin numarasını giriniz :   ");
			id=input.nextInt();
			head=head.next;
			
			System.out.println(id+"numaralı müşteri kayıt silindi..");
		}
		
	}
	
	
	void musteriara() {
		
		if(head==null) {
			System.out.println("liste boş");
		}
		else { 
		System.out.println("Aradığınız müşteri numarası :  ");
		id=input.nextInt();
		
		Node temp=head;
		
			while(temp!=null) {
				if(temp.id==id) {
					System.out.println("numarası:   "+temp.id);
					System.out.println("ad      :   " +temp.ad);
					System.out.println("soyad   :   " +temp.soyad);
					System.out.println("telefon :   " +temp.tel);
					System.out.println("adres   :   "+temp.adres);
					System.out.println("urun    :   "+temp.urun); 
					}
				temp=temp.next;
			}
		}
	}
	
	
	
	void yazdir() {
		if(head==null) {
			System.out.println("liste boş");
		}
		else {
			System.out.println("Numara\tAd\tSoyad\tTelefon\tAdres\tÜrün\t");
			Node temp=head;
			
			while(temp!=null) {
				
				System.out.println(temp.id+"\t"+temp.ad+"\t"+temp.soyad+"\t"+temp.tel+"\t"+temp.adres+"\t"+temp.urun);			
				temp=temp.next;
			}
		}
	}
	
	
	
	
	
	 

}
