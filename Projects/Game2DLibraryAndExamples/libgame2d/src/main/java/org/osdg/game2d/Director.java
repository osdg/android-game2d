package org.osdg.game2d;

/**
 * Created by plter on 8/28/15.
 */
public class Director extends Game2DObject {
    private static Director ourInstance = new Director();

    public static Director getInstance() {
        return ourInstance;
    }

    private Director() {
        nativeInstanceId = createNativeObject();
    }
    private native long createNativeObject();

    public void setDisplayStats(boolean value){
        nativeSetDisplayStats(nativeInstanceId,value);
    }

    private native void nativeSetDisplayStats(long nativeInstanceId, boolean value);


    private long nativeInstanceId = 0;
}
