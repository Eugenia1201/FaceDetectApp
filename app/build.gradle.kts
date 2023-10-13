plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.facedetectapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.facedetectapp"
        minSdk = 30
        //noinspection OldTargetApi
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    //noinspection GradleCompatible
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.theartofdev.edmodo:android-image-cropper:2.8.0")
//    implementation 'com.otaliastudios:cameraview:2.0.0-beta04'
    implementation ("com.google.firebase:firebase-ml-vision:24.1.0")
    implementation ("com.google.firebase:firebase-ml-vision-face-model:20.0.2")
    implementation("com.otaliastudios:cameraview:2.7.2")
}



