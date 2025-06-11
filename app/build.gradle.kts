plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.example.checklistsalas"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.checklistsalas"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Navigation
    implementation("androidx.navigation:navigation-fragment:$2.7.7")
    implementation("androidx.navigation:navigation-ui:$2.7.7")

    // Room
    implementation("androidx.room:room-runtime:2.7.0")
    ksp("androidx.room:room-compiler:2.7.0")
    implementation("androidx.room:room-ktx:2.7.0")

    //MVVM
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.1")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

    //CameraX
    implementation("androidx.camera:camera-core:${libs.versions.camerax.get()}")
    implementation("androidx.camera:camera-camera2:${libs.versions.camerax.get()}")
    implementation("androidx.camera:camera-lifecycle:${libs.versions.camerax.get()}")
    implementation("androidx.camera:camera-view:${libs.versions.camerax.get()}")
    implementation("androidx.camera:camera-extensions:${libs.versions.camerax.get()}")

    // Hilt
    implementation("com.google.dagger:hilt-android:${libs.versions.hilt.get()}")
    ksp("com.google.dagger:hilt-compiler:${libs.versions.hilt.get()}")

}