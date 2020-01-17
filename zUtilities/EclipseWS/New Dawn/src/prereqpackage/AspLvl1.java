package prereqpackage;

import java.util.ArrayList;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.openal.AudioImpl;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class AspLvl1 extends BasicGameState {

	public String mseX = "0";
	public String mseY = "0";
	GameMusic gm = new GameMusic();
	SoundMaster sm = new SoundMaster();
	
	Unit enemy1;
	Unit enemy2;
	Unit enemy3;
	Unit aaron;
	Unit travis;
	Unit maurice;
	
	Unit unitSelected;
	String select;
	String objComplete = "";
	
	int turnCount = 0;
	
	public int aaronX = 144;
	public int aaronY = 648;
	
	public int travisX = 288;
	public int travisY = 648;
	
	public int mauriceX = 430;
	public int mauriceY = 648;
	
	public int enemy1X = 0;
	public int enemy1Y = 220;
	
	public int enemy2X = 288;
	public int enemy2Y = 220;
	
	public int enemy3X = 642;
	public int enemy3Y = 220;
	
	
	public AspLvl1(int state){
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		initialize();
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		Image map = new Image("res/Level Assets/Story/asplvl1.png");
		g.drawImage(map, 0, 0);
		
		g.setColor(Color.yellow);
		g.drawString(mseX, 10, 90);
		g.drawString(mseY, 10, 110);
		
		bufferCharactersPDA(g);
		g.drawString(""+aaronX+", "+aaronY, 10, 130);
		
		if(selectUnit().equals(null)){
			g.setColor(Color.red);
			g.drawString(select, 930, 655);
		}else{
			if((select.contains("Travis"))||(select.contains("Aaron"))||(select.contains("Tyrion"))) {
				g.setColor(Color.cyan);
			}
			if(select.contains("Hostile")) {
				g.setColor(Color.red);
			}
			if(select.contains("No Unit Selected")) {
				g.setColor(Color.green);
			}
			g.drawString(select, 930, 655);
		}
		g.setColor(Color.orange);
		g.drawString(objComplete,930, 677);
		
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		Input i = gc.getInput();
		gc.setShowFPS(false);
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
		
		
		if(i.isKeyPressed(i.KEY_W)){
			aaronY-=72;
			sm.playAspEnemyVoice(8, false);
		}
		if(i.isKeyPressed(i.KEY_A)){
			aaronX-=72;
			sm.playAspEnemyVoice(9, false);
		}
		if(i.isKeyPressed(i.KEY_S)){
			aaronY+=72;
			sm.playAspEnemyVoice(8, false);
		}
		if(i.isKeyPressed(i.KEY_D)){
			aaronX+=72;
			sm.playAspEnemyVoice(9, false);
		}
		if(aaronX == 576 && aaronY == 0){
			objComplete = "Anderson Rescued!";
		}else{
			objComplete = "Rescue Anderson.";
		}
		/**
		if(i.isKeyPressed(i.KEY_I)){
			aaron.health++;
			aaron.killUnit();
			sm.playAspEnemyVoice(4, false);
		}
		if(i.isKeyPressed(i.KEY_J)){
			travis.health++;
			travis.killUnit();
			sm.playAspEnemyVoice(5, false);
		}
		if(i.isKeyPressed(i.KEY_K)){
			enemy1.killUnit();
			sm.playAspEnemyVoice(7, false);
		}
		if(i.isKeyPressed(i.KEY_O)){
			maurice.health++;
			enemy1.reviveEnemy();
			sm.playAspEnemyVoice(3, false);
		}
		*/
		if(i.isKeyDown(i.KEY_ESCAPE)){
			sbg.enterState(0);
			gm.playmainMenuMusic(true);
		}
	}
	private void initialize() throws SlickException{
		
		Image aaronHealthy = new Image("res/charAssets/Aaron Fetcher/aaronHealthy.png");
		Image aaronHurt = new Image("res/charAssets/Aaron Fetcher/aaronHealthy.png");
		Image aaronCritical = new Image("res/charAssets/Aaron Fetcher/aaronHealthy.png");
		Image aaronDead = new Image("res/charAssets/Aaron Fetcher/aaronHealthy.png");
		
		Image travisHealthy = new Image("res/charAssets/Travis Taylor/travisHealthy.png");
		Image travisHurt = new Image("res/charAssets/Travis Taylor/travisHealthy.png");
		Image travisCritical = new Image("res/charAssets/Travis Taylor/travisHealthy.png");
		Image travisDead = new Image("res/charAssets/Travis Taylor/travisHealthy.png");
		
		Image mauriceHealthy = new Image("res/charAssets/Maurice Tyrion/mauriceHealthy.png");
		Image mauriceHurt = new Image("res/charAssets/Maurice Tyrion/mauriceHealthy.png");
		Image mauriceCritical = new Image("res/charAssets/Maurice Tyrion/mauriceHealthy.png");
		Image mauriceDead = new Image("res/charAssets/Maurice Tyrion/mauriceHealthy.png");
		
		Image enemyHealthy = new Image("res/charAssets/AspEnemy/enemyHealthy.png");
		Image enemyHurt = new Image("res/charAssets/AspEnemy/enemyHurt.png");
		Image enemyIncapacitated = new Image("res/charAssets/AspEnemy/enemyHurt.png");
		Image enemyDead = new Image("res/charAssets/AspEnemy/enemyDead.png");
		
		enemyHealthy.rotate(180);
		
		aaron = new Unit(aaronHealthy, "Aaron Fetcher", 20, 100, false, 0);
		travis = new Unit(travisHealthy, "Travis Taylor", 35, 100, false, 0);
		maurice = new Unit(mauriceHealthy, "Maurice Tyrion", 26, 100, false, 0);
		
		enemy1 = new Unit(enemyHealthy, "Hostile 1", 15, 75, false, 0);
		enemy2 = new Unit(enemyHealthy, "Hostile 2", 17, 100, false, 0);
		enemy3 = new Unit(enemyHealthy, "Hostile 3", 24, 75, false, 0);

	}
	private void bufferCharactersPDA(Graphics g){
		
		
		g.drawImage(aaron.status, aaronX, aaronY);
		g.drawImage(travis.status, travisX, travisY);
		g.drawImage(maurice.status, mauriceX, mauriceY);
		
		g.drawImage(enemy1.status, enemy1X, enemy1Y);
		g.drawImage(enemy2.status, enemy2X, enemy2Y);
		g.drawImage(enemy3.status, enemy3X, enemy3Y);
		
		
		g.setColor(Color.green);
		g.drawString("AOS_"+Engine.userName, 945, 16);
		g.drawString("TURN: "+turnCount, 1155, 16);
		
		g.setColor(Color.yellow);
		g.drawString("Secure Miss Anderson.", 930, 640);
		
		g.setColor(Color.blue);
		g.drawString("Your Team Status", 965, 68);
		g.drawString(aaron.name, 945, 128);
		g.drawString(travis.name, 945, 188);
		g.drawString(maurice.name, 945, 244);
		
		g.drawString(""+aaron.health, 1230, 128);
		g.drawString(""+travis.health, 1230, 188);
		g.drawString(""+maurice.health, 1230, 244);
		
		g.setColor(Color.red);
		g.drawString("Enemy Team Status", 965, 368);
		g.drawString(enemy1.name, 945, 424);
		g.drawString(enemy2.name, 945, 485);
		g.drawString(enemy3.name, 945, 540);
		
		g.drawString(""+enemy1.health, 1230, 424);
		g.drawString(""+enemy2.health, 1230, 485);
		g.drawString(""+enemy3.health, 1230, 540);
	}
	private void takePlayerTurn(Unit u){
		
	}
	//                                                aaronY = 648, yBot = 0, yTop = aaronY 
	private Unit selectUnit(){                   
		if((Mouse.getX() >= aaronX && Mouse.getX() <= aaronX+aaron.status.getWidth())&&((Mouse.getY() <= 720 -aaronY && Mouse.getY() >= 720 -aaronY - aaron.status.getHeight() ))){
			select = aaron.toString() +"";
			return aaron;
		}
		if((Mouse.getX() >= travisX && Mouse.getX() <= travisX+travis.status.getWidth())&&((Mouse.getY() <= 720 -travisY && Mouse.getY() >= 720 -travisY - travis.status.getHeight()))){
			select = travis.toString()+"";
			return travis;
		}
		if((Mouse.getX() >= mauriceX && Mouse.getX() <= mauriceX+maurice.status.getWidth())&&((Mouse.getY() <= 720 -mauriceY && Mouse.getY() >= 720 -mauriceY - maurice.status.getHeight()))){
			select = maurice.toString()+"";
			return maurice;
		}
		if((Mouse.getX() >= enemy1X && Mouse.getX() <= enemy1X+enemy1.status.getWidth())&&((Mouse.getY() <= 720 -enemy1Y && Mouse.getY() >= 720 -enemy1Y - enemy1.status.getHeight()))){
			select = enemy1.toString()+"";
			return enemy1;
		}
		if((Mouse.getX() >= enemy2X && Mouse.getX() <= enemy2X+enemy2.status.getWidth())&&((Mouse.getY() <= 720 -enemy2Y && Mouse.getY() >= 720 -enemy2Y - enemy2.status.getHeight()))){
			select = enemy2.toString() +"";
			return enemy2;
		}
		if((Mouse.getX() >= enemy3X && Mouse.getX() <= enemy3X+enemy3.status.getWidth())&&((Mouse.getY() <= 720 -enemy3Y && Mouse.getY() >= 720 -enemy3Y - enemy3.status.getHeight()))){
			select = enemy3.toString()+"";
			return enemy3;
		}
		else{
			select = "No Unit Selected";
			return aaron;
		}
	}
	
	private void aiTurn(){
		
	}
	
	public int getID() {
		return 13;
	}
}
