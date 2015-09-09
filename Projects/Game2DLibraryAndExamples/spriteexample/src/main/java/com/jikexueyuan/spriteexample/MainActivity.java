package com.jikexueyuan.spriteexample;

import org.osdg.game2d.Director;
import org.osdg.game2d.Game2DActivity;
import org.osdg.game2d.Layer;
import org.osdg.game2d.Scene;
import org.osdg.game2d.Sprite;

public class MainActivity extends Game2DActivity {


    @Override
    protected void onCreationComplete() {
        super.onCreationComplete();


        Scene scene = new Scene();
        Layer layer = new Layer();
        scene.addChild(layer);

        Sprite sprite = new Sprite("HelloWorld.png");
        layer.addChild(sprite);
        sprite.setPosition(300, 300);

        Director.getInstance().runWithScene(scene);

    }
}
