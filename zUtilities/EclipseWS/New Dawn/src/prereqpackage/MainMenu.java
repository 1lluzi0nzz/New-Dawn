package prereqpackage;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

import java.awt.Font;

import javax.swing.*;

public class MainMenu extends BasicGameState{
	
	public String mseX = "0";
	public String mseY = "0";
	
	GameMusic gm = new GameMusic();

	
	public MainMenu(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{

		gm.playmainMenuMusic(true);
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{

		Image bg = new Image("res/Menus/MainMenu.png");
		
		
		
		g.drawImage(bg, 0, 0);
		
		//Setting menu Strings and Names
		g.setColor(Color.black);
		if(Engine.userName.length() > 15){
			Engine.userName = Engine.userName.substring(0, 14);
		}
		if(Engine.userName.equals("")){
			Engine.userName = "Commander";
		}
		g.drawString("Hello "+Engine.userName, 10, 140);
		
		//Getting mouse coordinates
		g.setColor(Color.red);
		g.drawString(mseX, 10, 90);
		g.drawString(mseY, 10, 110);		
		
		g.setColor(Color.red);
		g.drawString("New Dawn by Team Aerosentient", 0, 700);
		g.drawString("Press F to go to Full Screen", 0, 684);
		renderButtons(g);
		
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
		
		Input i = gc.getInput();
		gc.setShowFPS(false);
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
		
		
		//Campaign
		if((mouseX >= 112  && mouseX <= 260) && (mouseY >= 388 && mouseY <= 435)){
			if(i.isMousePressed(0)){
				sbg.enterState(11);
			}
		}
		//Skirmish
		if((mouseX >= 280  && mouseX <= 430) && (mouseY >= 383 && mouseY <= 436)){
			if(i.isMouseButtonDown(0)){
				sbg.enterState(2);
			}
		}
		//Multiplayer
		if((mouseX >= 452  && mouseX <= 606) && (mouseY >= 388 && mouseY <= 436)){
			if(i.isMouseButtonDown(0)){
				sbg.enterState(2);
			}
		}
		//Lore
		if((mouseX >= 188  && mouseX <= 336) && (mouseY >= 304 && mouseY <= 353)){
			if(i.isMouseButtonDown(0)){
				sbg.enterState(4);
				gm.playloreMusic(true);
			}
		}
		//Credits
		if((mouseX >= 380  && mouseX <= 532) && (mouseY >= 304 && mouseY <= 352)){
			if(i.isMouseButtonDown(0)){
				gm.playcreditsMusic(true);
				sbg.enterState(3);
			}
		}
		//Test Class
		if(i.isKeyDown(i.KEY_T)){
			gm.playSnowMusic(true);
			JOptionPane.showMessageDialog(null, "Welcome to the Test Map "+Engine.userName, "Greetings", JOptionPane.PLAIN_MESSAGE);
			sbg.enterState(10);
		}
		//HQ
		if(i.isKeyPressed(i.KEY_F)){
			gc.setFullscreen(true);
			gc.setVSync(true);
			gc.setVerbose(true);
			gc.setSmoothDeltas(true);
		}
		if(gc.isFullscreen() && i.isKeyDown(i.KEY_F)){
			gc.setFullscreen(false);
		}
		
		//Exit
		if((mouseX >= 76  && mouseX <= 180) && (mouseY >= 669 && mouseY <= 702)){
			if(i.isMouseButtonDown(0)){
				gc.exit();
			}	
		}	
	
	}	
	private void renderButtons(Graphics g) throws SlickException{
		Image caButton = new Image("res/Menus/Main/Camp2.png");
		Image crButton = new Image("res/Menus/Main/Cred2.png");
		Image exButton = new Image("res/Menus/Main/Exit2.png");
		Image loButton = new Image("res/Menus/Main/Lore2.png");
		Image muButton = new Image("res/Menus/Main/Multi2.png");
		Image skButton = new Image("res/Menus/Main/Skirm2.png");
		
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		
		if((mouseX >= 112  && mouseX <= 260) && (mouseY >= 388 && mouseY <= 435)){
			g.drawImage(caButton, 111, 283);
		}
		if((mouseX >= 380  && mouseX <= 532) && (mouseY >= 304 && mouseY <= 352)){
			g.drawImage(crButton, 381, 365);
		}
		if((mouseX >= 76  && mouseX <= 180) && (mouseY >= 669 && mouseY <= 702)){
			g.drawImage(exButton, 77, 17);
		}
		if((mouseX >= 188  && mouseX <= 336) && (mouseY >= 304 && mouseY <= 353)){
			g.drawImage(loButton, 187, 365);
		}
		if((mouseX >= 452  && mouseX <= 606) && (mouseY >= 388 && mouseY <= 436)){
			g.drawImage(muButton, 451, 284);
		}
		if((mouseX >= 280  && mouseX <= 430) && (mouseY >= 383 && mouseY <= 436)){
			g.drawImage(skButton, 280, 283);
		}
	}
	public int getID(){
		return 0;
	}
}
