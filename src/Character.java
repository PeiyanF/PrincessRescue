
public class Character extends Tile {

	private int hp;
	private int atk;
	private int mvPt;
	private int exp;
	
	public Character(int x, int y, int h, int a, int m, int e) {
		super(x, y);
		hp = h;
		atk = a;
		mvPt = m;
		exp = e;
	}
	
	public int getHP() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getMvpt() {
		return mvPt;
	}
	
	public int getExp() {
		return exp;
	}

	protected void changeHP(int dHP) {
		hp =+ dHP;
	}
	
	protected void changeAtk(int dAtk) {
		atk =+ dAtk;
	}
	
	protected void changeMvpt(int dMv) {
		mvPt =+ dMv;
	}
	
	protected void changeExp(int dExp) {
		exp =+ dExp;
	}

	public boolean isAlive() {
		if (hp <= 0) {
			return (false);
		}
		else {
			return (true);
		}
	}
}
