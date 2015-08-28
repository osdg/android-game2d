#!/usr/bin/env bash

cd ../../../Game2D/
cocos compile -p android
cp -r proj.android/libs/ ../Projects/Game2DLibraryAndExamples/hellogame2d/src/main/jniLibs/
cp -r proj.android/assets/ ../Projects/Game2DLibraryAndExamples/hellogame2d/src/main/assets/