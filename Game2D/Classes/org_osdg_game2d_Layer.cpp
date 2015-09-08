#include "org_osdg_game2d_Layer.h"
#include <cocos2d.h>


/*
 * Class:     org_osdg_game2d_Layer
 * Method:    createNativeObject
 * Signature: ()J
 */
jlong Java_org_osdg_game2d_Layer_createNativeObject
        (JNIEnv *, jobject) {
    return (jlong) cocos2d::Layer::create();
}
