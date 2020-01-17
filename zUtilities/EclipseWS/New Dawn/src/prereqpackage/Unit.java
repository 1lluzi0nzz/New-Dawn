package prereqpackage;

import org.newdawn.slick.*;

public class Unit {
	
	public Image status;
	public String name;
	public int damage;
	public int health;
	public boolean abilityUsed;
	private int critChance;
	
	public static Image enemyDead;
	public static Image enemyHealthy;
	

	//CONSTRUCTOR
	public Unit(Image status, String name, int damage,  int health,
			boolean abilityUsed, int critChance)throws SlickException{
		
		this.status = status;
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.abilityUsed = false;
		this.critChance = critChance;
		
	}
	
	public void killUnit() throws SlickException{
		Image enemyDead = new Image("res/charAssets/AspEnemy/enemyDead.png");
		this.status = enemyDead;
		this.name = this.name+" has Flatlined";
		this.damage = 0;
		this.health = 0;
	}
	public void reviveEnemy() throws SlickException{
		Image enemyHealthy = new Image("res/charAssets/AspEnemy/enemyHealthy.png");
		this.status = enemyHealthy;
		this.name = this.name.substring(0, 9);
		this.health = 65;
	}
	
	
	
	
	
	//Setters and Accessors
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setHealth(int i) {
		this.health = i;
	}
	public int getHealth(){
		return this.health;
	}
	public void setDamage(int i){
		this.damage = i;
	}
	public int getDamage(){
		return this.damage;
	}
	public void setAbility(boolean b){
		this.abilityUsed = b;
	}
	public boolean getAbility(){
		return this.abilityUsed;
	}
	public void setCritChance(int i){
		this.critChance = i;
	}
	public int getCritChance(){
		return this.critChance;
	}
	public void setStatus(Image i){
		this.status = i;
	}
	public String getStatus(){
		return this.status.toString();
	}
	public String toString(){
		return this.name;
		
	}
}