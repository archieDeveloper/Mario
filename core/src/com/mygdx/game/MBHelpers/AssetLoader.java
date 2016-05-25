package com.mygdx.game.MBHelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by archie on 22.05.16.
 */
public class AssetLoader {

    public static Texture texture;

    public static TextureRegion mario, ground;

    public static void load() {
        texture = new Texture(Gdx.files.internal("data/texture.png"));
        texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        mario = new TextureRegion(texture, 0, 0, 24, 32);
        ground = new TextureRegion(texture, 0, 50, 32, 32);
    }

    public static void dispose() {
        // Мы должны избавляться от текстур, когда заканчивает работать с объектом в котором есть текстуры
        texture.dispose();
    }
}
