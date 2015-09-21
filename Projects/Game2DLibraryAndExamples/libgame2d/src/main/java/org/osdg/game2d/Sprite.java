package org.osdg.game2d;

/**
 * Created by plter on 9/9/15.
 */
public class Sprite extends Node {


    public Sprite(String fileName) {
        super(new Object[]{fileName});
    }

    public Sprite() {
    }

    @Override
    protected long createNativeObject(Object[] args) {
        if (args!=null&&args.length>=1&&args[0] instanceof String){
            return createNativeObject(args[0].toString());
        }else {
            return createNativeObject();
        }
    }

    native long createNativeObject();
    native long createNativeObject(String fileName);
}
