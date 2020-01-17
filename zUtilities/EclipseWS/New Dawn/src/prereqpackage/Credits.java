package prereqpackage;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Credits extends BasicGameState{
	
	GameMusic gm = new GameMusic();

public Credits(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{

		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		
		Image bg = new Image("res/Menus/Credits.png");
		g.drawImage(bg, 0, 0);
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input i = gc.getInput();
		
		
		if(i.isKeyDown(i.KEY_ESCAPE)){
			sbg.enterState(0);
			gm.playmainMenuMusic(true);

		}
	}
	public int getID(){
		return 3;
	}
}
