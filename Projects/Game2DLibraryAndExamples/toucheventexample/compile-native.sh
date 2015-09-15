#!/usr/bin/env bash

cd ../../../Game2D/
cocos compile -p android
cp -r proj.android/libs/ ../Projects/Game2DLibraryAndExamples/toucheventexample/src/main/jniLibs/
cp -r proj.android/assets/ ../Projects/Game2DLibraryAndExamples/toucheventexample/src/main/assets/