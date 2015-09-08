package org.osdg.hellogame2d;

import org.osdg.game2d.Director;
import org.osdg.game2d.Game2DActivity;
import org.osdg.game2d.Label;
import org.osdg.game2d.Layer;
import org.osdg.game2d.Scene;

public class MainActivity extends Game2DActivity {


    @Override
    protected void onCreationComplete() {
        super.onCreationComplete();

//        Director.getInstance().setDisplayStats(true);

        Scene s = new Scene();
        Layer l = new Layer();
        s.addChild(l);

        Label label = new Label();
        label.setString("Hello World");
        l.addChild(label);

        Director.getInstance().runWithScene(s);

        l.setPosition(300,300);

    }
}
