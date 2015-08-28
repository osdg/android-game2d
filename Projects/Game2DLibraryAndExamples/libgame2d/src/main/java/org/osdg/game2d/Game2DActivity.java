package org.osdg.game2d;

import org.cocos2dx.lib.Cocos2dxActivity;

/**
 * Created by plter on 8/28/15.
 */
public class Game2DActivity extends Cocos2dxActivity{

    private static Game2DActivity game2DActivity;

    public Game2DActivity(){
        game2DActivity = this;
    }

    public static Game2DActivity getGame2DActivity() {
        return game2DActivity;
    }

    protected void onCreationComplete(){}

    @Override
    protected final void onLoadNativeLibraries() {
        System.loadLibrary("game2d");
    }


    private static void nativeCreationCompleteCallback(){
        game2DActivity.onCreationComplete();
    }

}
