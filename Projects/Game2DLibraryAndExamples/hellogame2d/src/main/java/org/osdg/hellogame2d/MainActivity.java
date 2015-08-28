package org.osdg.hellogame2d;

import org.osdg.game2d.Director;
import org.osdg.game2d.Game2DActivity;

public class MainActivity extends Game2DActivity {


    @Override
    protected void onCreationComplete() {
        super.onCreationComplete();

        Director.getInstance().setDisplayStats(true);
    }
}
