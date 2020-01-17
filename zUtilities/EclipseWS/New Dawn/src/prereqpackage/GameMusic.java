package prereqpackage;

import java.util.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class GameMusic {
	
	public static Music mainMenuMusic;
	public static Music creditsMusic;
	public static Music loreMusic;
	public static Music urbanMusic;
	public static Music snowMusic;
	public static Music jungleMusic;
	

	
	public void playmainMenuMusic(boolean loop) throws SlickException{
		Music mainMenuMusic = new Music("snd/Music/mgsdp.ogg");
		mainMenuMusic.play(1f, .08f);
		if(loop == true){
			mainMenuMusic.loop(1f, .08f);
		}
	}
	public void playcreditsMusic(boolean loop) throws SlickException{
		Music creditsMusic = new Music("snd/Music/creditsOS.ogg");
		creditsMusic.play(1f, .4f);
		if(loop == true){
			creditsMusic.loop(1f, .4f);
		}
	}
	public void playloreMusic(boolean loop) throws SlickException{
		Music loreMusic = new Music("snd/Music/MgsSLED.ogg");
		loreMusic.play(1f, .3f);
		if(loop == true){
			loreMusic.loop(1f, .3f);
		}
	}
	public void playUrbanMusic(boolean loop) throws SlickException{
		Music urbanMusic = new Music("snd/Music/Urban.ogg");
		urbanMusic.play(1f, .3f);
		if(loop == true){
			urbanMusic.loop(1f, .3f);
		}
	}
	public void playSnowMusic(boolean loop) throws SlickException{
		Music snowMusic = new Music("snd/Music/Snow.ogg");
		snowMusic.play(1f, .3f);
		if(loop == true){
			snowMusic.loop(1f, .3f);
		}
	}
	public void playJungleMusic(boolean loop) throws SlickException{
		Music jungleMusic = new Music("snd/Music/Jungle.ogg");
		jungleMusic.play(1f, .3f);
		if(loop == true){
			jungleMusic.loop(1f, .3f);
		}
	}
}
