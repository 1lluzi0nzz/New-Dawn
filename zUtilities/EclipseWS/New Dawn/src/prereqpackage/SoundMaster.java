package prereqpackage;

import java.util.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class SoundMaster {
	
	
	//ASPIRATION ENEMY VOICES
	public void playAspEnemyVoice(int s, boolean loop) throws SlickException{
		Sound ae1 = new Sound("snd/Voice/AspEnemy/EnemyIdentified.ogg");
		Sound ae2 = new Sound("snd/Voice/AspEnemy/Grenade.ogg");
		Sound ae3 = new Sound("snd/Voice/AspEnemy/HesThere.ogg");
		Sound ae4 = new Sound("snd/Voice/AspEnemy/IGotOne.ogg");
		Sound ae5 = new Sound("snd/Voice/AspEnemy/ImHurt.ogg");
		Sound ae6 = new Sound("snd/Voice/AspEnemy/IncomingProjectile.ogg");
		Sound ae7 = new Sound("snd/Voice/AspEnemy/injured.ogg");
		Sound ae8 = new Sound("snd/Voice/AspEnemy/Moving.ogg");
		Sound ae9 = new Sound("snd/Voice/AspEnemy/OnMyWay.ogg");
		switch(s){
		case 1:
			ae1.play();
			if(loop == true){ae1.loop();}
			
		case 2:
			ae2.play();
			if(loop == true){ae2.loop();}
			break;
		case 3:
			ae3.play();
			if(loop == true){ae3.loop();}
			break;
		case 4:
			ae4.play();
			if(loop == true){ae4.loop();}
			break;
		case 5:
			ae5.play();
			if(loop == true){ae5.loop();}
			break;
		case 6:
			ae6.play();
			if(loop == true){ae6.loop();}
			break;
		case 7:
			ae7.play();
			if(loop == true){ae7.loop();}
			break;
		case 8:
			ae8.play();
			if(loop == true){ae8.loop();}
			break;
		case 9:
			ae9.play();
			if(loop == true){ae9.loop();}
			break;
		}
		// -- END --
	}


	
	
	
}
