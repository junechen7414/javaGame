package �m��1;
import java.security.SecureRandom;

public class Play {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Role[] R=new Role[6];		
		RedDrug red=new RedDrug();
		BlueDrug blue=new BlueDrug();
		R[0]=new Warrior("�Ԥh1",400,100);
		R[1]=new Warrior("�Ԥh2",400,100);
		R[2]=new Warrior("�Ԥh3",400,100);
		R[3]=new Mage("�k�v1",280,200);
		R[4]=new Mage("�k�v2",280,200);
		R[5]=new Mage("�k�v3",280,200);		
		
		
		SecureRandom rand=new SecureRandom();		
		
		
		while(true) {
			int a=rand.nextInt(6);
			int b=rand.nextInt(6);
			
			if(a==b) {
				continue;
			}
			if(R[a] instanceof Warrior) {
				((Warrior)R[a]).NewMoon(R[b]);				
			}
			else {
				((Mage)R[a]).SmallFire(R[b]);
			}
			
			if(R[b].getLife()<40) {
				R[b].DrinkDrug(red);
			}
			if(R[b].getMagic()<30) {
				R[a].DrinkDrug(blue);
			}
		}
	}
}
