package prereqpackage;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class CampaignSelect extends BasicGameState {

	public String mseX = "0";
	public String mseY = "0";
	GameMusic gm = new GameMusic();
	
	public String hoverStatus = "";
	
	public CampaignSelect(int state){
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		Image bg = new Image("res/Menus/campaignSelect.png");
		g.drawImage(bg, 0, 0);

		g.setColor(Color.yellow);
		g.drawString(mseX, 10, 90);
		g.drawString(mseY, 10, 110);
		g.drawString(hoverStatus, 10, 130);
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		Input i = gc.getInput();
		gc.setShowFPS(false);
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
		
		if((mouseX >= 0)&&(mouseX < 425)){
			hoverStatus = "Aspiration Story";
			if(i.isMousePressed(0)){
			gm.playUrbanMusic(true);
			sbg.enterState(13);
		}}
		if((mouseX >= 425)&&(mouseX < 853)){
			hoverStatus = "Singularity Story";
			if(i.isMousePressed(0)){
				sbg.enterState(0);
		}}
		if(mouseX >= 853){
			hoverStatus = "Providence Story";
			if(i.isMousePressed(0)){
				sbg.enterState(1);
		}}
		if(i.isKeyDown(i.KEY_A)){
			gm.playUrbanMusic(true);
			sbg.enterState(13);
		}
		if(i.isKeyDown(i.KEY_S)){
			sbg.enterState(0);
		}
		if(i.isKeyDown(i.KEY_D)){
			sbg.enterState(1);
		}
		if(i.isKeyDown(i.KEY_ESCAPE)){
			sbg.enterState(0);
		}

	}
	public int getID() {
		return 11;
	}
}