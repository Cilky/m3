package game;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import engine.Application;
import engine.Screen;
import engine.ui.UIRectangle;
import engine.ui.UIShape;
import engine.ui.Text;
import starter.Vec2f;
import starter.Vec2i;


/**
 * Default launch screen for Tou
 * @author yidanzeng
 *
 */
public class StartScreen extends Screen {

	/**
	 * Instantiates the StartScreen
	 * @param game
	 */
	public StartScreen(Application game) {
		super(game);
		setup();
	}
	
	/** 
	 * Initiates all the screen elements
	 */
	@Override
	public void setup() {
		//background
		UIShape background = new UIRectangle(new Color(181, 214, 255), new Vec2f(0,0), null, new Vec2i(windowSize.x, windowSize.y));
		content.add(background);
		
		//text TODO: fix the height thing for text
		Text debug = new Text("Debug", new Color(215, 229, 245), new Vec2f(windowSize.x/2 - 100, windowSize.y/4 * 2 - 100), background, new Vec2i(200,100));
		debug.setBackground(new Color(86, 142, 210));
		debug.type = "debugger";
		debug.setClickable();
		debug.setFontSize(10);
		debug.setFamily("Andale Mono");
		
		content.add((UIShape)debug);
		
		Text start = new Text("Game", new Color(215, 229, 245), new Vec2f(windowSize.x/2 - 100, windowSize.y/4 * 3 - 100), background, new Vec2i(200,100));
		start.setBackground(new Color(86, 142, 210));
		start.type = "game";
		start.setClickable();
		start.setFontSize(10);
		start.setFamily("Andale Mono");
		
		content.add((UIShape)start);
	
	}


	/**
	 * If the start button is pressed, a new GameScreen is created and initialized
	 */
	
	@Override
	public void onMouseClicked(MouseEvent e) {
		for(UIShape s : content) {
			if(s.clickable) {
				Vec2i mouse = new Vec2i(e.getX(), e.getY());
				
				if(s.isWithin(mouse) && s.type.equals("debugger")) {
					DebugScreen debug = new DebugScreen(game);
					game.setScreen(debug);
				} else if(s.isWithin(mouse) && s.type.equals("game")) {
					MScreen gameScreen = new MScreen(game);
					game.setScreen(gameScreen);
				}
			}
		}
	}

	@Override
	public void onTick(long nanosSincePreviousTick) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onKeyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onKeyPressed(KeyEvent e) {
	}

	@Override
	public void onKeyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
