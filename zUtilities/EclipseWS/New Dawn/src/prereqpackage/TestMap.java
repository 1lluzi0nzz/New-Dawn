package prereqpackage;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class TestMap extends BasicGameState{

	public String mseX = "0";
	public String mseY = "0";
	GameMusic gm = new GameMusic();

	Unit b1;
	Unit b2;
	Unit r1;
	Unit r2;
	int turnCount;
	
	
	int b1x =177;
	
	
public TestMap(int state){
	
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{		
		turnCount = 0;
		initialize();
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		Image bg = new Image("res/Test/TestMap.png");
		g.drawImage(bg, 0, 0);
		g.setColor(Color.red);
		g.drawString("DEBUGGING", 1134, 20);
		g.drawString("COORDINATES", 1134, 56);
		g.drawString("X "+mseX, 1134, 74);
		g.drawString("Y "+mseY, 1134, 90);
		
		g.drawString("Pressing I will\n increment the\n turn counter", 1114, 120);
		
		
		//Build all the Units
		g.drawImage(b1.status,b1x,85);
		g.drawImage(b2.status,441,85);
		g.drawImage(r1.status,85,454);
		g.drawImage(r2.status,440,454);
		
		
		
		//SET UP PDA
		g.setColor(Color.black);
		g.drawString(Engine.userName, 750, 15);
		g.drawString(""+turnCount, 975, 15);
		
		g.setColor(Color.blue);	
		g.drawString("Commander "+Engine.userName+"'s Force", 744, 60);
		
		g.drawString(b1.getName(), 744, 120);
		g.drawString(b2.getName(), 744, 190);
		g.drawString(""+b1.health, 975, 120);
		g.drawString(""+b2.health, 975, 190);
		
		
		g.setColor(Color.red);
		g.drawString("Enemy Force", 744, 384);
		
		g.drawString(r1.getName(), 744, 450);
		g.drawString(r2.getName(), 744, 532);
		g.drawString(""+r1.health, 975, 450);
		g.drawString(""+r2.health, 975, 532);
		
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input i = gc.getInput();
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		mseX = ""+mouseX;
		mseY = ""+mouseY;


		if(i.isKeyPressed(i.KEY_I)){
			turnCount++;
			r1.health = r1.health - 34;
			String extension = "";
			if(r1.health > 0){
				extension = r1.name+ " is hurt";
				r1.name = extension;
				if(r1.name.contains("hurt")){
					r1.name = r1.name.substring(0, 13);
				}
			}
			if(r1.health <= 0){
				extension = r1.name+ " is dead";
				if(r1.name.contains("hurt") || r1.name.contains("dead")){
					r1.name = r1.name +" is dead";
					r1.name = r1.name.substring(0, 13);
				}
			}
		}
		if(i.isKeyDown(i.KEY_W)){
			b1x += 1;
			
		}
		if(i.isKeyDown(i.KEY_S)){
			b1x -= 1;
		}
		if(i.isKeyDown(i.KEY_G)){
			r1.setHealth(66);
		}
		if(i.isKeyDown(i.KEY_ESCAPE)){
			sbg.enterState(0);
			gm.playmainMenuMusic(true);
		}
	}
	
	private void initialize() throws SlickException{
		Image b1s = new Image("res/Test/B1.png");
		Image b2s = new Image("res/Test/B2.png");
		Image r1s = new Image("res/Test/R1.png");
		Image r2s = new Image("res/Test/R2.png");
		
		b1 = new Unit(b1s, "Blue 1", 15, 125, false, 0);
		b2 = new Unit(b2s, "Blue 2", 17, 125, false, 0);
		r1 = new Unit(r1s, "Red 1", 24, 100, false, 0);
		r2 = new Unit(r2s, "Red 2", 26, 100, false, 0);
		
	}
	public int getID(){
		return 10;
	}
}