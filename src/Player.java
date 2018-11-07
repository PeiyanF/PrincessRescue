
public class Player extends Character {
	private static int HP_BONUS = 3;
	private static int ATK_BONUS = 1;
	private static int EXP_BONUS = 3;
	
	public Player(int h, int a, int m, int e) {
		super(0, 0, h, a, m, e);
		this.uncoverTile("images/player.png");
		// TODO Auto-generated constructor stub
	}

	public void move(int dx, int dy) {
		this.changeX(dx);
		this.changeY(dy);
		this.changeMvpt(-1);
	}
	
	public boolean win(Character npc) {
		int playerHP = this.getHP();
		int npcHP = npc.getHP();
		
		while (playerHP > 0 && npcHP > 0) {
			playerHP =- npc.getAtk();
			npcHP =- this.getAtk();
		}
		
		if (playerHP <= 0) {
			return (false);
		}
		
		else {
			return (true);
		}
	}
	
	public void fight(Character npc) {
		if (win(npc)) {
			this.changeHP(HP_BONUS);
			this.changeAtk(ATK_BONUS);
			this.changeExp(EXP_BONUS);
			this.changeMvpt(npc.getMvpt());
		}
		
		else {
			this.changeHP(-npc.getAtk());
			this.changeMvpt(-1);
		}
	}
	
}
