package com.mygdx.game.MBHelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.gameObjects.Mario;

import static java.lang.String.valueOf;

/**
 * Created by archie on 22.05.16.
 */
public class InputHandler implements InputProcessor {

    private Mario myMario;

    public InputHandler(Mario mario) {
        myMario = mario;
    }

    @Override
    public boolean keyDown(int keycode) {
        Gdx.app.log("Нажата клавиша", valueOf(keycode));
        /*if (keycode == 22) {
            myMario.runRight();
        }*/
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
