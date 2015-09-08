#include "org_osdg_game2d_Director.h"
#include <cocos2d.h>


static inline cocos2d::Director *convert(jlong value) {
    return (cocos2d::Director *) value;
}

static inline cocos2d::Scene * convertToScene(jlong value){
    return (cocos2d::Scene *) value;
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


/*
 * Class:     org_osdg_game2d_Director
 * Method:    runWithScene
 * Signature: (JJ)V
 */
void Java_org_osdg_game2d_Director_runWithScene
(JNIEnv *, jobject, jlong self, jlong scene){
    convert(self)->runWithScene(convertToScene(scene));
}