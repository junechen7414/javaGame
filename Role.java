package �m��1;

import java.security.SecureRandom;

public abstract class Role {
	private String Name;
	private	 int Life;
	private  int Magic;
	public Role() {}   //�w�]�غc�l
	public void setName(String N) {
		this.Name=N;
	}
	public void setLife(int L) {
		this.Life=L;
	}
	public void setMagic(int M) {
		this.Magic=M;
	}
	public String getName() {
		return this.Name;
	}
	public int getLife() {
		return this.Life;
	}
	public int getMagic() {
		return this.Magic;
	}
	public Role(String Name,int Life,int Magic) {
		this.Name=Name;
		this.Life=Life;
		this.Magic=Magic;
	}
	public void NewMoon(Role R) {
		//this and that		
	}
	public void SmallFire(Role R) {
		//blablabla
	}
	
	public void DrinkDrug(Drug D) {
		SecureRandom rand=new SecureRandom();
		int randint=rand.nextInt(10);
		if(D instanceof RedDrug) {
			if(randint==0){
				if(D instanceof RedDrug) {
				D.setAdd(120);
				setLife(getLife()+D.getAdd());
				System.out.printf("�ܤj���Ĥ�\n");
				}
				else {
					D.setAdd(100);
					setMagic(getMagic()+D.getAdd());
					System.out.printf("�ܤj���Ĥ�\n");
				}
				D.setSize("�j");	
				
			}
			if(randint>0&&randint<3) {
				D.setAdd(80);
				D.setSize("��");
				setLife(getLife()+D.getAdd());
				System.out.printf("�ܤ����Ĥ�\n");
				}
			if(randint>2&&randint<7) {
				D.setAdd(50);
				D.setSize("�p");
				setLife(getLife()+D.getAdd());
				System.out.printf("�ܤp���Ĥ�\n");
				}
			if(randint>6) {
				System.out.printf("�ܤ�����Ĥ�\n");
				return;
				}
		}
		else {
			if(randint==0){
				D.setAdd(100);
				D.setSize("�j");
				
			
			}
			if(randint>0&&randint<3) {
				D.setAdd(60);
				D.setSize("��");
				setMagic(getMagic()+D.getAdd());
				System.out.printf("�ܤ����Ĥ�\n");
				}
			if(randint>2&&randint<7) {
				D.setAdd(30);
				setMagic(getMagic()+D.getAdd());
				D.setSize("�p");
				System.out.printf("�ܤp���Ĥ�\n");
			}
			if(randint>6) {
				System.out.printf("�ܤ������Ĥ�\n");
				return;
				}
		}
		
	}
	
}
