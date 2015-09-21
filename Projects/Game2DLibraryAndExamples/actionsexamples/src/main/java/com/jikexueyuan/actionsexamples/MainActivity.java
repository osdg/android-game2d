package com.jikexueyuan.actionsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.osdg.game2d.Director;
import org.osdg.game2d.Game2DActivity;
import org.osdg.game2d.Label;
import org.osdg.game2d.Layer;
import org.osdg.game2d.Scene;
import org.osdg.game2d.actions.MoveBy;

public class MainActivity extends Game2DActivity implements View.OnClickListener {


    private Label label;

    @Override
    protected void onCreationComplete() {
        super.onCreationComplete();

        Director.getInstance().setDisplayStats(true);

        Scene s = new Scene();
        Layer layer = new Layer();
        s.addChild(layer);

        Director.getInstance().runWithScene(s);

        label = new Label();
        label.setString("Hello World");
        label.setSystemFontSize(30);

        layer.addChild(label);

        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        label.runAction(new MoveBy(1,100,100));
    }
}
