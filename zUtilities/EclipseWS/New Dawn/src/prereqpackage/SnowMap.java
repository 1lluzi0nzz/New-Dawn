package prereqpackage;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class SnowMap extends BasicGameState{


	
public SnowMap(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
				
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		Image bg = new Image("res/Menus/SnowMap.jpg");
		g.drawImage(bg, 0, 0);
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input i = gc.getInput();
		
	}
	public int getID(){
		return 5;
	}
}