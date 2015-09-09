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
    }

    @Override
    long createNativeObject(Object[] args) {
        return createNativeObject();
    }
    native long createNativeObject();

    public void setDisplayStats(boolean value){
        nativeSetDisplayStats(getNativeObjectPointer(),value);
    }

    private native void nativeSetDisplayStats(long nativeInstanceId, boolean value);

    public void runWithScene(Scene scene){
        runWithScene(getNativeObjectPointer(),scene.getNativeObjectPointer());
    }

    private native void runWithScene(long self,long scene);

}
