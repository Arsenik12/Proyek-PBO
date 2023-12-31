package com.cr.game.screens;


import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;
import java.util.List;

public abstract class Screen implements com.badlogic.gdx.Screen {


    public List<Sprite> elements;
    protected com.cr.game.CrossyRoad game;

    public Screen (com.cr.game.CrossyRoad game) {
        this.game = game;
        elements = new ArrayList<Sprite>();
    }

    public void pause () {};
    public void resume () {};
    public void dispose (){};
    public void hide (){};
    public void show (){};
    public void destroy () {};

    public abstract void createScreen ();
    public abstract void update (float dt);

    @Override
    public void render(float arg0) {
    }

    @Override
    public void resize(int arg0, int arg1) {
    }
}
