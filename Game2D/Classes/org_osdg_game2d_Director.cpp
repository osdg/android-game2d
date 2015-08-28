#include "org_osdg_game2d_Director.h"
#include <cocos2d.h>


static inline cocos2d::Director *convert(jlong value) {
    return (cocos2d::Director *) value;
}


/*
 * Class:     org_osdg_game2d_Director
 * Method:    createNativeObject
 * Signature: ()J
 */
jlong Java_org_osdg_game2d_Director_createNativeObject
        (JNIEnv *, jobject) {
    return (jlong) (cocos2d::Director::getInstance());
}


/*
 * Class:     org_osdg_game2d_Director
 * Method:    nativeSetDisplayStats
 * Signature: (JZ)V
 */
void Java_org_osdg_game2d_Director_nativeSetDisplayStats
        (JNIEnv *, jobject, jlong pointer, jboolean value) {
    convert(pointer)->setDisplayStats(value);
}
