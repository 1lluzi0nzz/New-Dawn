package prereqpackage;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javax.swing.JOptionPane;

public class Engine extends StateBasedGame{

	public static final String gname = "New Dawn - Team Aerosentient";
	public static String userName;
	public static final int mainMenu = 0;
	public static final int urbanMap = 1;
	public static final int squadSelection = 2;
	public static final int credits = 3;
	public static final int lore = 4;
	public static final int snowMap = 5;
	public static final int jungleMap = 6;
	public static final int testMap = 10;
	public static final int campaignSelect = 11;
	public static final int options = 12;
	public static final int asplvl1 = 13;
	
	public Engine(String gname){
		super(gname);
		this.addState(new MainMenu(mainMenu));
		this.addState(new UrbanMap(urbanMap));
		this.addState(new SquadSelection(squadSelection));
		this.addState(new Credits(credits));
		this.addState(new Lore(lore));
		this.addState(new SnowMap(snowMap));
		this.addState(new JungleMap(jungleMap));
		this.addState(new TestMap(testMap));
		this.addState(new CampaignSelect(campaignSelect));
		this.addState(new Options(options));
		this.addState(new AspLvl1(asplvl1));
	}
	public void initStatesList(GameContainer gc ) throws SlickException{
		this.getState(mainMenu).init(gc, this);
		this.getState(urbanMap).init(gc,this);
		this.getState(squadSelection).init(gc, this);
		this.getState(credits).init(gc, this);
		this.getState(lore).init(gc, this);
		this.getState(snowMap).init(gc,this);
		this.getState(jungleMap).init(gc,this);
		this.getState(testMap).init(gc, this);;
		this.getState(campaignSelect).init(gc, this);
		this.getState(options).init(gc, this);
		this.getState(asplvl1).init(gc, this);
		
		this.enterState(mainMenu);
	}
	
	public static void main(String[] args){
		AppGameContainer agc = null;
		String un = JOptionPane.showInputDialog("Hello, what is your name commander?", ".");
		userName = un;
		try{
			agc = new AppGameContainer(new Engine(gname));
			agc.setDisplayMode(1280, 720, false);
			agc.setIcon("res/FOXDIE.png");
			agc.start();
		}catch(SlickException e){
			e.printStackTrace();	
		}
		
	}

}
