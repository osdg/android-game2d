package org.osdg.game2d;

/**
 * Created by plter on 8/30/15.
 */
public class Layer extends Node {


    native long createNativeObject();
    @Override
    protected long createNativeObject(Object[] args) {
        return createNativeObject();
    }
}
