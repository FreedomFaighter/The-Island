package com.joshostler.theisland;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.*;

import com.joshostler.theisland.graphics.GameWindow;
import com.joshostler.theisland.graphics.GameWindowCallback;
import com.joshostler.theisland.graphics.ResourceHandler;
import com.joshostler.theisland.graphics.tile.TileStone;

public class TheIsland implements Runnable, GameWindowCallback {
	
	private static String title = "The Island";
	
	private GameWindowCallback callback;
	private GameWindow window;
	
	private static int width = 300;
	private static int height = width / 16 * 9;
	private static int scale = 3;
	
	TileStone tile;
	
	/*
	 * 0 = Menu
	 * 1 = Game
	 */
	private int screenType = 1;
	
	public TheIsland(){
		try {
			startGame();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	private void startGame() throws LWJGLException {
		
		window = ResourceHandler.get().getGameWindow();
		window.setResolution(width*scale, height*scale);
		window.setGameWindowCallback(this);
		window.setTitle(title);
		
		window.startRendering();
<<<<<<< HEAD
		
		window.setResolution(width, height);
		window.setGameWindowCallback(this);
		window.setTitle(title);
		
		// Load Entities
		entities.clear();
		
		tile = new TileStone(0,0);
		tiles.add(tile);
	
		run();
=======
>>>>>>> 7b9aa33 (Serious map generation working, implemented Perlin noise generation with basic dirt and stone. Need to add Water, sand, grass, and snow to further test the generation code.)
	}
	
	public synchronized void stop() {
		try {
		ResourceHandler.get().getGameWindow().destroy();
		callback.windowClosed();
		} catch (IllegalStateException e) {
			System.out.println(e);
		}
		System.exit(1);
	}

	@Override
	public void initialise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frameRendering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
