package com.jikexueyuan.toucheventexample;

import android.view.MotionEvent;
import android.view.View;

import org.osdg.game2d.Director;
import org.osdg.game2d.Game2DActivity;
import org.osdg.game2d.Label;
import org.osdg.game2d.Layer;
import org.osdg.game2d.Scene;

public class MainActivity extends Game2DActivity implements View.OnTouchListener {

    private Label label;

    @Override
    protected void onCreationComplete() {
        super.onCreationComplete();

        Scene scene = new Scene();
        Layer layer = new Layer();
        scene.addChild(layer);

        label = new Label();
        layer.addChild(label);
        label.setPosition(300, 200);
        label.setSystemFontSize(30);

        Director.getInstance().runWithScene(scene);

        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (event.getAction()==MotionEvent.ACTION_MOVE){
            label.setString(String.format("%f,%f",event.getX(),event.getY()));
        }

        return true;
    }
}
