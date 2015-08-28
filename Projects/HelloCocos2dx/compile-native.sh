#!/usr/bin/env bash

cd ../../Game2D/
cocos compile -p android
cp -r proj.android/libs/ ../Projects/HelloCocos2dx/app/src/main/jniLibs/
cp -r proj.android/assets/ ../Projects/HelloCocos2dx/app/src/main/assets/
