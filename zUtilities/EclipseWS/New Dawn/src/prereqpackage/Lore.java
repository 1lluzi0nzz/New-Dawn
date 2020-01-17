package prereqpackage;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Lore extends BasicGameState{

	GameMusic gm = new GameMusic();
	
	public String mseX = "0";
	public String mseY = "0";
	public String currentBio = "";
	
	
	public Lore(int state){
		
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
		
	}
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		Image bg = new Image("res/Menus/Lore Concept.jpeg");
		
		g.drawImage(bg, 0, 0);
		g.setColor(Color.yellow);
		g.drawString(mseX, 240, 20);
		g.drawString(mseY, 240, 35);
		g.drawString(currentBio, 380, 212);
	
	}
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input i = gc.getInput();
		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		
		mseX = "X "+mouseX;
		mseY = "Y "+mouseY;
	
		//Exit Button	
		if((mouseX >= 43  && mouseX <= 164) && (mouseY >= 642 && mouseY <= 688)){
			if(i.isMouseButtonDown(0)){
				sbg.enterState(0);
				gm.playmainMenuMusic(true);
			}
		}
		
		
		//Aspiration
		if((mouseX >= 300  && mouseX <= 407) && (mouseY > 650 && mouseY < 700)){
			currentBio = "    Personal of The Aspiration have sought to protect the remainder of mankind."
					+ "\nThey believe that the spirit of human beings is good, and not easily broken.  "
					+ "\nThe Aspiration posseses a wide range of military hardware, but they prefer to "
					+ "\nuse equipment that has been proven on the battlefield.  A true soldier of the "
					+ "\naspiration will trust his carbine more than a glowing laser rifle.  They prefer "
					+ "\nto keep a large army for single defense locations and offensives while using "
					+ "\nsmall trained espionage teams in order to reduce the effectiveness of enemy units."
					+ "\nSince this implementation greater soldiers have risen up and more civilian"
					+ "\nlives have been saved.  On top of the Singularity expansion, the Aspiration also"
					+ "\nfaces a great threat from the providence as numerous scientists and soldiers have"
					+ "\nturned up missing, some even in broad daylight.";
		}
		//Singularity
		if((mouseX >= 625  && mouseX <= 750) && (mouseY > 650 && mouseY < 700)){
			currentBio = "    The Singularity was formed by a group of immensely wealthy billionares."
					+ "\nThe original intention of the group was to control the interests of the"
					+ "\ngroup and ensure the domestication of multiple governments.The focus of"
					+ "\nthe faction shifted when it was attacked by the self-righteous aspiration."
					+ "\nNow they have waged full on war against any person or group that allies or"
					+ "\nhelps the aspiration.They are known for their ruthlessness and ability to"
					+ "\nsacrifice anything and everything for the cause. The common foot soldier is"
					+ "\ntrained to expect death and is treated as a coward if it is not recieved. "
					+ "\nThey will stop at nothing to ensure they're grasp on the governments of the"
					+ "\nworld remains intact.";
		}
		//Providence
		if((mouseX >= 990  && mouseX <= 1100) && (mouseY > 650 && mouseY < 700)){
			currentBio = "    The Providence is well known for their objective clarity.  The improvement"
					+ "\nof mankind by maintaining the control of our technology. Providence Tech "
					+ "\nis usually mysterious and can perform tasks that are still thought to be"
					+ "\nimpossible.  To do this they will stop at nothing to secure valuable "
					+ "\nassets from other factions.  This includes using advanced encription to"
					+ "\nsteal money and resources as well as trained abducters and assassins to"
					+ "\nsteal mankinds greatest. Despite being an advanced and research focused"
					+ "\ngroup, many sources say that there might be some sort of political unrest within.";
		}
		//Chars
		
		//Fetcher
		if((mouseX >= 0  && mouseX <= 210) && (mouseY > 580 && mouseY < 620)){
			currentBio = "    Mr. Fetcher was welcomed to the Aspiration with open arms.  He previously led a "
					+ "\nfulfilling civilian life a chief firfighter.  Fetcher is a natural leader, well "
					+ "\nknown for taking care of his teamates and thinking through problems completely "
					+ "\nbefore making a calculated decision.  A city wide fire in Boston during the year"
					+ "\n 2023 had numerous fire teams scrambled to deal with the situation.  Fetcher "
					+ "\nfocused on saving lives while the other teams would focus on containment.  "
					+ "\nThe first apartment complex cleared was perfect. Nobody from his team of 14 people"
					+ "\nwere injured and many injured civilians, as well as pets were saved.  The second"
					+ "\ncomplex went nearly as good aside from watching a few people not make it or lose"
					+ "\nconsciousness.  Fetcher noticed that his team would be fatigued, normally he would"
					+ "\ncall for assistance as additional assets would be needed to continue, however the"
					+ "\nnext complex on the line was his own.  He had a wife and son locked somewhere in "
					+ "\nan already collapsing building, on the 4th story.  He recklessly ordered his team"
					+ "\nto clear the first 4 floors and leave him to get his family out.  By the time he"
					+ "\nswung open the door to his room a wave of fire jumped out at him.  He entered and"
					+ "\nsaw his wife trying to scale out of the window to another building.  Realizing "
					+ "\nthat the building would soon collapse he ran after them and called out, but a "
					+ "\nmetal beam came down between the two and collapsed the floor.  Fetcher was pulled"
					+ "\nout of the rubble two hours later by his Aspiration teams mechanic Travis Taylor."
					+ "\nThe individuals responsible for causing the fire were never identified.  Vowing"
					+ "\nto find the person or group responsible for his families death he leads an advanced"
					+ "\nteam for the Aspiration to prevent innocent death at all costs.";
		}
		//Taylor
		if((mouseX >= 0  && mouseX <= 210) && (mouseY > 530 && mouseY < 580)){
			currentBio = "    Travis had always had a gift for building. He Graduated from Princeton at the"
					+ "\nyoung age of 15 with a degree in engineering.  He spent much of his career "
					+ "\ndeveloping what would later be known as the 6 marvels of the modern era.  "
					+ "\nMassive buildings and skyscrapers that were pronounced scientifically "
					+ "\nimpossible, yet they stood before the world, winning Travis worldwide "
					+ "\nrecognition.  His fall from grace began with a disaster.  He had begun"
					+ "\nwork on what would have been his 7th marvel; a railway that stretched "
					+ "\nover the atlantic.  While under construction a critical piece went missing.  "
					+ "\nUninformed of the fault in construction Travis allowed the train to leave "
					+ "\nfor europe, amongst the train were several dignitaries and Travis's daughter.  "
					+ "\nThe train went barreling off of the rails leading to the deaths of those aboard.  "
					+ "\nStricken with guilt and anger for the loss of his daughter Travis gave up his "
					+ "\nposition as master engineer and joined the aspiration in a hope to correct his "
					+ "\nmistakes.";
		}
		
		//Tyrion
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 468 && mouseY <= 530)){
			currentBio = "Maurice Tyrion was born in South Compton.  From a young age he was influenced"
					+ "\nby gangs and crimes.  During his time in gangs he always liked using his revolver."
					+ "\nBy 23 he had been in jail twice.  The first time was for slamming a man's face into"
					+ "\nthe concrete to stop a murder, but he was wrongfully convicted. The second time was "
					+ "\nfor going berserk on a rapist in an alley. He had always wanted to get away from "
					+ "\ngangs and crime. Then the Aspiration found him.  The Aspiration recruited him for "
					+ "\nhis ability to control situations and eliminate his targets with ease.";
		}
		//Anderson
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 406 && mouseY <= 468)){
			currentBio = "    Kelly exclusively comes from a military family.  Her mother was an ex-KGB "
					+ "\nagent that specialized in interogation.  Kelly's father is a 5 star general "
					+ "\nfor the aspiration.  A once renowned man who led the defense and reconstruction"
					+ "\nin Boston after the fire in 2023.  She always wanted to be a teacher but her dad "
					+ "\ninsisted on bringing her into the military as soon as possible saying that a "
					+ "\nteacher would be boring.  At the age of 20 she was brought in to the Aspirations "
					+ "\nspecial training unit, a unit designed to enhance a soldiers survivability "
					+ "\ntechniques in numerous scenarios.  Close Quarters Combat was the main appeal of "
					+ "\nthe training.    Nobody else in the unit could lay a finger on her without being "
					+ "\nthrown across the room.  Her father noticed trouble hitting targets with a long "
					+ "\nrange rifle and insisted she try a new type of ammunition.  These types of bullets "
					+ "\nare experimental and are designed to travel at least 3 times as fast as even high \n"
					+ "speed ammo, while still taking a chunk out of the person.  After using these newer "
					+ "\nbullets she will not dare fire a rifle without them loaded in it.  Despite having "
					+ "\nfew hours of actual combat experience, she knows her way around the battlefield "
					+ "\nand is determined to follow in her fathers footsteps.";
		}
		//Yvette
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 343 && mouseY <= 406)){
			currentBio = "    At a young age Natalia was taken from her family by the Russian government. "
					+ "\nThe government officials placed her within a specialized training facility. "
					+ "\nThe intention was to train the children to perform combat at an exceptional "
					+ "\nlevel. She underwent her first official mission at the age of 14, a success. "
					+ "\nHer reputation afterwards was impeccible. She was assigned the assassination "
					+ "\nof Maurice Tyrion. As she took aim, through a high powered rifle, the man "
					+ "\nslowly looked at her and waved, her cover had been blown. Narrowly escaping "
					+ "\ndeath, Natalia went into hiding. She was shaken up by the experience and "
					+ "\nunable to trust her fellow comrades. Consumed by anger from her failure she "
					+ "\nwandered void of purpose. Hearing of Maurice alligning with the Aspiration, "
					+ "\nshe decided what to do. Her new goal would be to finish the mission and take him out.";
		}
		//Creed
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 271 && mouseY <= 343)){
			currentBio = "    Born within a small town of the war torn state of yugoslavia. Throughout his "
					+ "\nchild years his home town was many times raided and citizens slaughtered by "
					+ "\nwarring european countries during the aftermath of the world war.  During one"
					+ "\n such raid his father was killed protecting his mother from an unknown assailant. "
					+ "\nThe attacker fled but not before starting a fire that would take his mothers life "
					+ "\nand put his sister (the only other sibling he had) in the hospital, she died of "
					+ "\nher wounds two weeks later.  Torn by rage and frustration for his failing country, "
					+ "\nMarkus left his home and travelled the world. Acquirring many skills and becoming "
					+ "\nenveloped with insanity. He now works for the singularity killing any who cross his "
					+ "\npath with an almost frightening lust for blood. He one day hopes to return to his "
					+ "\nhome country and use hostile force to control it with utmost power.";
		}
		//Gates
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 194 && mouseY <= 271)){
			currentBio = "    Norman was born into the wealth of a long line of billionares. From the moment he "
					+ "\nwas born he owned anything and everything he wanted and needed.  Despite his "
					+ "\nimmense wealth throughtout his teen years he felt like a part of him was missing. "
					+ "\nTorn he spent many years travelling trying to find a calling.  His wake up call to "
					+ "\nhis true passion occured when an asian man wouldnt sell him a valuable heirloom. "
					+ "\nFurious, he took action and stole the object. Never having felt more alive he took "
					+ "\nto a life as a thief.  Over years of practice his skills became feared across the "
					+ "\nworld. Able to steal diamonds and ancient artifacts without a sound.  The story of "
					+ "\nhow he came to support the singularity is one of betrayal.  He was hired by an "
					+ "\naspiration operative to steal a mysterious object aboard a government cargo plane.  "
					+ "\nOnce aboard the plane he learned the truth. The aspiration had sold out Norman in "
					+ "\nexchange for the object.   The plane being a decoy was set to explode with Norman "
					+ "\naboard.  Norman not one to go down without a fight escaped his captors and was able "
					+ "\nto escape the plane moments before an explosion that sent many of the objects hurling "
					+ "\ntowards earth.  One such object was an expensive car with car sized parachute attached. "
					+ "\nNorman narrowly escaped death by plunging towards the car and using said parachute.  "
					+ "\nHe now harbors an immense hatred towards the aspiration and will do whatever it takes "
					+ "\nto topple their administration.";
		}
		//Walstone
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 130 && mouseY <= 194)){
			currentBio = "    Quiet from birth. They usually are. From time to time there comes a man the likes \n"
					+ "of which the world has good memory of, the sort of man who puts action before words, \n"
					+ "and others before himself. From an early age the titan of a man that he would become \n"
					+ "began to sculpt himself, starting as a farm hand in Kentucky his life was sweet and \n"
					+ "simple, a good kid if there ever was one. His career began in the late summers of \n"
					+ "2010, when he agreed to join the military. Signed on, and with many years ahead of \n"
					+ "him he spent his time working, and working hard to become the best at his job. His \njob? "
					+ "Keep people alive. Dean himself had no prior medical experience, neither did\n he care to "
					+ "learn. He knew that at times there would be people who would need a \nhelping hand, "
					+ "and that the hand that helps would need to be able to take the strain.";
		}
		//Wulf
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 56 && mouseY <= 130)){
			currentBio = "    Richard Wulf is a renowned physicist, a subject highly sought after by the \n"
					+ "Providence faction.  Officials from the providence often seek technology that \n"
					+ "pushes humanity forward, even if it isn't exactly  the prettiest way of doing so.  \n"
					+ "Fortunately pushing humanity forward by any means neccesary is the exact ideology \n"
					+ "Wulf goes by. He believes that humanity in itself is a cruel race, only capable of \n"
					+ "destroying things. Due to a car accident he lost most functionality in his right leg \n"
					+ "and refused to have it amputated. The Providence learned of his condition and \n"
					+ "confronted him while he was still in his hospital bed. The figure claimed that the \n"
					+ "Providence possessed technology that could fully repair is leg and enhance physical \n"
					+ "performance 10 times beyond that of the worlds finest soldiers. He agreed to visit \n"
					+ "the lab where they demanded he take a qualifications test for the faction in which \n"
					+ "he surpassed their expectations, having his leg repaired, he now seeks to learn as \n"
					+ "much as he can, and use that knowledge to better future generations.";
		}
		//Kimishima
		if((mouseX >= 0  && mouseX <= 210) && (mouseY >= 0 && mouseY <= 56)){
			currentBio = "    Dr. Naomi Kimishima is legendary amongst surgeons.  Before unwillingly joining "
					+ "\nthe Providence, she had previously practiced medicine.  She was fascinated with "
					+ "\ncardiac surgery such that she would not miss an opportunity to operate on another "
					+ "\npersons heart. She rarely moved about without at least carrying minimal surgery "
					+ "\nsupplies as they made her feel safe and 'clothed.' In the year 2024 a man collapsed "
					+ "\non the streets of Beijing where she was enjoying the view from a nearby garden. Some "
					+ "\nsort of 6th sense triggered and she rushed to the scene.  Paramedics could not reach "
					+ "\nthe location in time.  With the passion of saving lives, she cut into the mans chest "
					+ "\nwhile he was unconscious and excised a malignant tumor that had metastasized.  Upon "
					+ "\ncompletion of the surgery she fled the scene and went into hiding.  She was never \n"
					+ "seen in public again.  Some say they saw an entirely grey figure put her to sleep "
					+ "\nin an alleyway and take her into the distance, while the more widely accepted "
					+ "\nbelief is that she fainted after the surgery and collapsed.  Shortly after she "
					+ "\nsupposedly collapsed a man took her to a hospital where she was presumed dead.  "
					+ "\nWeilding new cutting edge surgical equipment along with high tech weapons given "
					+ "\nby the Providence, she pursues the new goal of establishing an equilibrium of peace "
					+ "\namongst this now hostile Earth.";
		}				
	}
	public int getID(){
		return 4;
	}
}