public class Player {
	private String playerName;
	private int playerLevel;
	private int playerBaseHP;
	private int playerBaseAtk;
	private int playerBaseDef;
	
	private int playerHP;

	public Player(String playerName, int playerBaseHP, int playerBaseAtk, int playerBaseDef) {
		super();
		this.playerName = playerName;
		this.playerLevel = 1;
		this.playerBaseHP = playerBaseHP;
		this.playerBaseAtk = playerBaseAtk;
		this.playerBaseDef = playerBaseDef;
		this.playerHP = this.playerBaseHP;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getPlayerBaseHP() {
		return playerBaseHP;
	}

	public void setPlayerBaseHP(int playerBaseHP) {
		this.playerBaseHP = playerBaseHP;
	}

	public int getPlayerBaseAtk() {
		return playerBaseAtk;
	}

	public void setPlayerBaseAtk(int playerBaseAtk) {
		this.playerBaseAtk = playerBaseAtk;
	}

	public int getPlayerBaseDef() {
		return playerBaseDef;
	}

	public void setPlayerBaseDef(int playerBaseDef) {
		this.playerBaseDef = playerBaseDef;
	}
	
	public int getPlayerHP() {
		return playerHP;
	}

	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}

	public boolean isDead() {
		if(this.playerHP <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void attack(Player enemy) {	
		if(!enemy.isDead()) {
			int defDmgReduction = (enemy.playerBaseDef) / (enemy.playerBaseDef + 5 * this.playerLevel + 500);
			int defMultiplier = 1 - defDmgReduction;
			int damage = this.playerBaseAtk * defMultiplier;
			
			System.out.println(this.playerName + " has dealt " + damage + " damage to " + enemy.playerName + ".\n");
			
			enemy.playerHP -= damage;
			
			if(enemy.isDead()) {
				System.out.println("Enemy has been slain!\n");
			} else {
				System.out.println("Enemy has " + enemy.playerHP + " HP left.\n");
			}
			
		} else {
			System.out.println("Stop! They're already dead!\n");
		}
	}
}
