package prereqpackage;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class UrbanMap extends BasicGameState{


	
public UrbanMap(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
				
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		Image bg = new Image("res/Menus/UrbanMap.jpg");
		g.drawImage(bg, 0, 0);
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input i = gc.getInput();
		
	}
	public int getID(){
		return 1;
	}
}