package com.mygdx.game.gameObjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Legendary on 21.05.2016.
 */
public class Mario {

    private Vector2 position;
    private Vector2 velocity;

    private int width;
    private int height;

    public Mario(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
    }

    public void update(float delta) {

    }

    public void onClick(){
        velocity.y = -140;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

}
