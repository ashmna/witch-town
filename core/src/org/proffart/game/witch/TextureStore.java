package org.proffart.game.witch;


import com.badlogic.gdx.graphics.Texture;

public class TextureStore {

    public static final Texture HOUSES = new Texture("houses.png");
    public static final int HOUSE_WIDTH = 150;
    public static final int HOUSE_HEIGHT = 225;

    static {
        HOUSES.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
    }
}
