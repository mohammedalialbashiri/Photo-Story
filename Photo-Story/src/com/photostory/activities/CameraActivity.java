/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.photostory.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.photostory.utl.AppConstant;

// ----------------------------------------------------------------------

public class CameraActivity extends Activity {

	public static Bitmap bmResult;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		AppConstant.initializeStaticVariable(dm);

		Class c = null;
		// if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
		// // if (Build.VERSION.SDK_INT < Build.VERSION_CODES.FROYO) {
		// // use portrait
		// c = CameraPortraitActivity.class;
		// } else {
		// // use landscape
		// c = CameraLandscapeActivity.class;
		// }
		c = CameraLandscapeActivity.class;

		Intent n = new Intent(this, c);
		startActivity(n);
		finish();
	}
}
