# android-studio-hello-world
Cheshmak SDK - Android Studio Hello World App - Java

This repository shows how to configure cheshmak for minumum usage to be able to send push notifications


# Installation

# 1.Permissions

Insert the following permissions into your AndroidManifest.xml file.

```xml
​<uses-permission android:name="android.permission.INTERNET" />​
​<uses-permission android:name="android.permission.VIBRATE" />​
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```
The last two permissions are optional and are recommended to increase ad monetization and targeting.

# 2.Build.gradle
Add the Cheshmak repo to your build.gradle file:

```java
repositories {
 jcenter()
 //Add Maven block to your repositories section
 maven {
 url 'https://repository.cheshmak.me'
 }
}
```

Next, add the below dependencies to build.gradle file:

```java
implementation 'me.cheshmak:analytics:3.+'
implementation "com.google.firebase:firebase-messaging:17.3.4"
implementation "com.google.firebase:firebase-ads:17.1.3"

```

 # 3. Initializing the SDK
 Before you can initialize and use the Cheshmak SDK, ensure that you have already configured your app in the [Cheshmak panel](https://panel.cheshmak.me). You will receive an APP KEY for your app in the panel.
When you initialize the SDK, you make it ready for use in your app. It sets initial values and performs other setup tasks. This is required for the features of the Cheshmak SDK to work.
First, create an application class (look [here](https://stackoverflow.com/questions/12834379/extending-android-application-class) if you need assistance)
Next, paste the following code snippet into your app's Application class ```onCreate()``` method.
```java
        Cheshmak.with(ApplicationClass.this);
        // Replace <YOUR_APP_KEY> below with the real APP KEY that has been provided in the panel
        Cheshmak.initTracker("<YOUR_APP_KEY>");
```


# 4. Push notification Handling

To open an activity once a user clicks on a push notification, insert the following snippet into your manifest file:

```xml
​<activity
android:name=".YourActivity"​
android:label="your_activity_name">​
​<meta-data android:name="cheshmakPush" android:value="openActivityOnPush"/>​
​</activity>
```

# 5. Build and send push notifications
Build and run your application and start sending push notifications by cheshmak panel
