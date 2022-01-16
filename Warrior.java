package �m��1;



public class Warrior extends Role implements LifeRecoverable,MagicRecoverable{
	public Warrior(String Name,int Life,int Magic) {
		super(Name,Life,Magic);
	}
	public void NewMoon(Role R) {
		
			if(getMagic()<10) {
			System.out.printf("�����L��\n"+R+"\n");
			}
			else {
				setMagic(getMagic()-10);
				if(R instanceof Warrior) {
					R.setLife(R.getLife()-25);
					}
				else {
					R.setLife(R.getLife()-40);
				}
				System.out.printf(R.getName()+"�Q����\n"+R+"\n");
			
			if(R.getLife()<=0) {
				System.out.printf(R.getName()+"�Q����\n");
				System.exit(0);
				}
			}		
		
	}
	@Override
	public double recoverLife() {
		return getLife()+LIFERATE;
	}
	@Override
	public double recoverMagic() {
		return getMagic()+MAGICRATE;
	}
	
	@Override
	public String toString() {
		return (getName()+" Life: "+getLife()+" Magic: "+getMagic());
	}
	
	
	
}