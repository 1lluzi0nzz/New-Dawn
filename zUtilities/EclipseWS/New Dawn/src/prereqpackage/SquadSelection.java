package prereqpackage;

import java.util.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class SquadSelection extends BasicGameState{
	
	public String mseX = "0";
	public String mseY = "0";


	
	
public SquadSelection(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{

	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		Image bg1 = new Image("res/Menus/SSTemplate.jpg");
		g.drawImage(bg1, 0, 0);
		g.drawString("", 0, 0);
		
		g.setColor(Color.green);
		g.drawString(mseX, 15, 20);
		g.drawString(mseY, 15, 35);
		
		/**Coordinates to top right of frames
		*
		* 1  @ 260 x 630
		* 2  @ 470 x 630
		* 3  @ 670 x 630
		* 4  @ 870 x 630
		* 5  @ 1075 x 630
		* 6  @ 260 x 305
		* 7  @ 470 x 305
		* 8  @ 670 x 305
		* 9  @ 870 x 305
		* 10 @ 1070 x 305
		*/
		
		//Render the Character Names TEMPORARY
		g.setColor(Color.blue);
		g.drawString("Aaron Fetcher", 270, 630);
		g.drawString("Travis Taylor", 500, 630);
		g.drawString("Maurice Tyrion", 700, 630);
		g.drawString("Kelly Anderson", 900, 630);
		
		g.setColor(Color.red);
		g.drawString("Natalia Yvette", 1100, 630);
		g.drawString("Markus Creed", 270, 305);
		g.drawString("Norman Gates", 500, 305);
		g.drawString("Dean Walstone", 700, 305);
		
		g.setColor(Color.yellow);
		g.drawString("Richard Wulf", 900, 305);
		g.drawString("Naomi Kimishima", 1100, 305);
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input i = gc.getInput();
		
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
		
		if(i.isKeyDown(i.KEY_ESCAPE)){
			sbg.enterState(0);
			
		}
		if(i.isMouseButtonDown(0)){
	
		}
	}
	
	public int getID(){
		return 2;
	}
}
