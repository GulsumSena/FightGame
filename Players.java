package fight;

import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		DovusOyun game1=new DovusOyun("POLAT","MEMATİ");
		DovusOyun game2=new DovusOyun("ÇAKIR","POLAT");
		DovusOyun game3=new DovusOyun("GÜLLÜ ERHAN","POLAT");
		DovusOyun game4=new DovusOyun("MEMATİ","ÇAKIR");
		
		System.out.println("Lütfen tarafları seçiniz: ");
		System.out.println("[1]POLAT vs. MEMATİ");
		System.out.println("[2]ÇAKIR vs. POLAT");
		System.out.println("[3]GÜLLÜ ERHAN vs. POLAT");
		System.out.println("[4]MEMATİ vs. ÇAKIR");
		
		int oyuncuSecim=scn.nextInt();
		
			if(oyuncuSecim>4||oyuncuSecim<1) {
				System.out.println("Öyle bir karşılaşma yok.");
			}else if(oyuncuSecim==1) {
				System.out.println(game1.info());
				game1.saldir();
				
			}else if(oyuncuSecim==2) {
				System.out.println(game2.info());
				game2.saldir();
				
			}else if(oyuncuSecim==3) {
				System.out.println(game3.info());
				game3.saldir();
				
			}else if(oyuncuSecim==4) {
				System.out.println(game4.info());
				game4.saldir();
				
			}
		}

}
