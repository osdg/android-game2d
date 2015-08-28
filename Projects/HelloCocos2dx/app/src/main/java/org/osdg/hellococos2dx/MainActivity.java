package org.osdg.hellococos2dx;

import org.cocos2dx.lib.Cocos2dxActivity;

public class MainActivity extends Cocos2dxActivity {


    @Override
    protected void onLoadNativeLibraries() {
        System.loadLibrary("cocos2dcpp");
    }
}
