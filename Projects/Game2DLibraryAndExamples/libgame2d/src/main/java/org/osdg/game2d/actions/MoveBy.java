package org.osdg.game2d.actions;

import org.osdg.game2d.base.Vec2;

/**
 * Created by plter on 9/21/15.
 */
public class MoveBy extends ActionInterval {

    public MoveBy(float duration,Vec2 position){
        this(duration,position.getX(),position.getY());
    }

    public MoveBy(float duration,float x,float y){
        super(new Object[]{duration, x, y});
    }


    @Override
    protected long createNativeObject(Object[] args) {
        return createNativeObject((Float)args[0],(Float)args[1],(Float)args[2]);
    }

    private native long createNativeObject(float duration,float x,float y);
}
