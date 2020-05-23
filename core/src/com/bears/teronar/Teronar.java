package com.bears.teronar;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.HashMap;

public class Teronar extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	private HashMap<String, Texture> loaded;
	public int centerX;
	public int centerY;
	public int screenSizeX;
	public int screenSizeY;

	public void create() {
		batch = new SpriteBatch();
		loaded = new HashMap<>();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		screenSizeX = 800; screenSizeY = 480;
		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); //important!
	}

	public void dispose() {
	}

	public Texture getTexture(String path) {
		if (loaded.containsKey(path)) {
			return loaded.get(path);
		} else {
			Texture texture = new Texture(path);
			loaded.put(path, texture);
			return texture;
		}
	}
}
