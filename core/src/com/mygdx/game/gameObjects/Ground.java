package com.mygdx.game.gameObjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by archie on 24.05.16.
 */
public class Ground {


    private Vector2 position;

    private int width;
    private int height;

    public Ground(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
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
