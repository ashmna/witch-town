package org.proffart.game.witch;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import org.proffart.game.witch.building.House;

public class WitchTown extends Game {
	private Stage stage;
	
	@Override
	public void create () {
		ScreenViewport screenViewport = new ScreenViewport();
		stage = new Stage(screenViewport);

		addActors();
	}

	@Override
	public void dispose() {
		stage.dispose();
		super.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	private void addActors() {
		House house = new House();

		stage.addActor(house);
	}
}
