package fight;

import java.util.Random;
import java.util.Scanner;

public class DovusOyun {

	private String nameMe;
	private String nameRakip;
	private int attackMe;
	private int attackRakip;
	private int defenseMe;
	private int defenseRakip;
	private static int saglikMe=100;
	private static int saglikRakip=100;

	public DovusOyun(String nameMe, String nameDusman) {
		this.nameMe=nameMe;
		this.nameRakip=nameDusman;
	}
	
	
	public String getNameMe() {
		return nameMe;
	}

	public String getNameRakip() {
		return nameRakip;
	}

	public int getAttackMe() {
		return attackMe;
	}

	public int getAttackRakip() {
		return attackRakip;
	}

	public int getDefenseMe() {
		return defenseMe;
	}

	public int getDefenseRakip() {
		return defenseRakip;
	}

	public static int getSaglikMe() {
		return saglikMe;
	}

	public static int getSaglikRakip() {
		return saglikRakip;
	}


	public void saldir() {
		Random rnd=new Random();
		Scanner input=new Scanner(System.in);
		
		System.out.println(nameMe+" oyuncusu için seçim yapacaksınız.");
		System.out.println();
		
		while(1==1) {
			System.out.println();
			System.out.println("Hamle Hakkı "+nameMe+" oyuncusunun."+"\n[1]SALDIR"+"\n[2]PES");
			int hamle=input.nextInt();
			
		if(hamle==1||hamle==2) {				
			if(hamle==1) {
				if(this.saglikMe>0) {
					this.attackMe=rnd.nextInt(50)+1;
					System.out.println(nameMe+" saldırı yaptı: "+this.attackMe);
					
					this.defenseRakip=rnd.nextInt(this.attackMe)+1;
					System.out.println(nameRakip+" savunma yaptı: "+this.defenseRakip);
		
					this.saglikRakip-=(this.attackMe-this.defenseRakip);
					System.out.println(nameRakip+" kalan canı: "+this.saglikRakip);
				
						if(this.saglikRakip>0) {
							System.out.println();
							System.out.println("Hamle hakkı "+nameRakip+" oyuncusunun:");
							this.attackRakip=rnd.nextInt(50)+1;
							System.out.println(nameRakip+" saldırı yaptı: "+this.attackRakip);
					
							this.defenseMe=rnd.nextInt(this.attackRakip)+1;
							System.out.println(nameMe+" savunma yaptı: "+this.defenseMe);
					
							this.saglikMe-=(this.attackRakip-this.defenseMe);
							System.out.println(nameMe+" kalan canı: "+this.saglikMe);
								if(this.saglikMe<0) {
									System.out.println(nameRakip+" KAZANDI");
									break;
								}
					
						}else if(this.saglikRakip<0) {
							System.out.println(nameMe+". KAZANDI! ");
							break;
						}
			
				}else if(this.saglikMe<0) {
					System.out.println();
					System.out.println(nameMe+ "KAYBETTİ.");
					break;
				}
				
			}else if(hamle==2) {
				System.out.println(nameMe+" PES ETTİ.");
				break;
			}
		}else {
			System.out.println("Öyle bir hamle yok.");
			break;
		}
	}
	}
	
	public String info() {
		System.out.println();
		return nameMe+" ve "+nameRakip+" karşılaşıyor.";
	}
}
