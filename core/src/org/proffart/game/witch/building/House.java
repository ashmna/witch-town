package org.proffart.game.witch.building;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import org.proffart.game.witch.TextureStore;

/**
 * team ProffArt
 * author Ashot Mnatsakanyan
 * date 6/4/16
 * time 12:31 PM
 */
public class House extends Actor {

    private short level = 1;
    private short type = 1;

    private Sprite sprite = new Sprite(
            TextureStore.HOUSES,
            (level - 1) * TextureStore.HOUSE_WIDTH,
            (type - 1) * TextureStore.HOUSE_HEIGHT,
            TextureStore.HOUSE_WIDTH,
            TextureStore.HOUSE_HEIGHT
    );


    public House() {
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
        // super.draw(batch, parentAlpha);
    }
}
