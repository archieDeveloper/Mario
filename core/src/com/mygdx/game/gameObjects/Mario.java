package com.mygdx.game.gameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.MBHelpers.AssetLoader;

import java.util.List;

/**
 * Created by Legendary on 21.05.2016.
 */
public class Mario extends Actor {

    TextureRegion region;

    List<Ground> grounds;

    Vector2 velocity;
    Vector2 gravity;

    Rectangle bounds;
    ShapeRenderer renderer;

    public Mario(int x, int y, int width, int height, List<Ground> grounds) {
        this.grounds = grounds;
        region = AssetLoader.mario;
        gravity = new Vector2(0, -9.8f);
        velocity = new Vector2(0, 0);
        bounds = new Rectangle(x, y, width, height);
        setPosition(x, y);
        setWidth(width);
        setHeight(height);
        renderer = new ShapeRenderer();
    }

    public void update(float delta) {
        velocity.add(gravity);
        checkPlatformCollisions(delta);
        moveBy(velocity.x * delta, velocity.y * delta);
        if (Gdx.input.isKeyPressed(22)) {
            setPosition(getX()+(100*delta), getY());
        }
        if (Gdx.input.isKeyPressed(21)) {
            setPosition(getX()-(100*delta), getY());
        }

        bounds.setPosition(getX(), getY());
    }

    private void checkPlatformCollisions (float delta) {
        if (velocity.y > 0) return;

        int len = grounds.size();
        for (int i = 0; i < len; i++) {
            Ground ground = grounds.get(i);
            /*if ((getX() >= ground.getX()) && (getX() <= (ground.getX()+ground.getWidth()))) {
                if (getY() > ground.getY()) {
                    if (-velocity.y * delta > (getY() - ground.getY() + ground.getHeight())) {
                        setPosition(getX(), ground.getY() + ground.getHeight());
                        velocity.y = 0;
                        break;
                    }
                }
            }*/

            if (getY() > ground.getY()) {
                if (bounds.overlaps(ground.bounds)) {
                    setPosition(getX(), ground.getY() + ground.getHeight());
                    velocity.y = 0;
                    break;
                }
            }
        }
    }

    @Override
    public void draw (Batch batch, float parentAlpha) {
        batch.draw(region, getX(), getY());
        //renderer.setProjectionMatrix(batch.getProjectionMatrix());
        batch.end();
        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.setColor(Color.RED);
        renderer.rect(bounds.x, bounds.y, bounds.width, bounds.height);
        renderer.end();
        batch.begin();
    }

}
