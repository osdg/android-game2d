/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_osdg_game2d_Director */

#ifndef _Included_org_osdg_game2d_Director
#define _Included_org_osdg_game2d_Director
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_osdg_game2d_Director
 * Method:    createNativeObject
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_osdg_game2d_Director_createNativeObject
  (JNIEnv *, jobject);

/*
 * Class:     org_osdg_game2d_Director
 * Method:    nativeSetDisplayStats
 * Signature: (JZ)V
 */
JNIEXPORT void JNICALL Java_org_osdg_game2d_Director_nativeSetDisplayStats
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_osdg_game2d_Director
 * Method:    runWithScene
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_org_osdg_game2d_Director_runWithScene
  (JNIEnv *, jobject, jlong, jlong);

#ifdef __cplusplus
}
#endif
#endif
