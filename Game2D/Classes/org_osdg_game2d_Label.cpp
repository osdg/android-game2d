#include "org_osdg_game2d_Label.h"
#include <platform/android/jni/JniHelper.h>
#include <cocos2d.h>


static inline cocos2d::Label* convert(jlong pointer){
    return (cocos2d::Label *) pointer;
}

/*
 * Class:     org_osdg_game2d_Label
 * Method:    createNativeObject
 * Signature: ()J
 */
jlong Java_org_osdg_game2d_Label_createNativeObject
        (JNIEnv *, jobject) {
    return (jlong) cocos2d::Label::create();
}


/*
 * Class:     org_osdg_game2d_Label
 * Method:    nativeSetString
 * Signature: (JLjava/lang/String;)V
 */
void Java_org_osdg_game2d_Label_nativeSetString
        (JNIEnv *, jobject, jlong pointer, jstring str) {
    convert(pointer)->setString(cocos2d::JniHelper::jstring2string(str));
}