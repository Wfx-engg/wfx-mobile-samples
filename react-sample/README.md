# Whatfix with React Native Sample App

This article explains how to install and update the Whatfix React Native SDK in your project.

#### Prerequisites

Node.js Environment

For Android : -
minSdkVersion - 19

For iOS : -
iOS 10.0+

#### Step 1 - Installation

```
cd react-sample
npm install
cd ios
pod install
```


#### Step 2 - Initializing Whatfix

`RNWhatfixModule.initialize(<ent_name>, <ent_id>, <initial_screen_name>);`

Replace <ent_name> and <ent_id> with your Whatfix account ID. To get your ENT ID and ENT NAME, email us at support@whatfix.com or get in touch with your Account Manager.

#### Step 3 - Creating bundle

```
cd react-sample
```

Android
```
react-native bundle --platform android --dev false --entry-file index.js --bundle-output android/app/src/main/assets/index.android.bundle --assets-dest ./android/app/src/main/res
```

iOS
```
react-native bundle --platform ios --dev false --entry-file index.js --bundle-output ios/main.jsbundle --assets-dest ./ios
```

#
### Other APIs (Optional)

Set your custom location to serve content. Default is cdn.whatfix.com

`RNWhatfixModule.setCustomContentLocation(<Custom_Location>);`

Set your custom host to serve content. Default is whatfix.com

`RNWhatfixModule.setWhatfixHost(<Custom_Host>);`

Set the current user role from your app

`RNWhatfixModule.setLoggedInUserRole(<logged_in_user_role>);`

Set the current user id for analytics

`RNWhatfixModule.setLoggedInUserId(<logged_in_user_id>);`

Set the current user language preference

`RNWhatfixModule.setLanguage(<language_code>);`

#
### **Setting other dev options**:

To enable seeing the extra logs on Logcat

`RNWhatfixModule.setIsDebugEnabled(true);`

Start editor directly

`RNWhatfixModule.startEditor()`

Disable Editor mode

`RNWhatfixModule.disableEditorMode()`

Set custom window variables for advanced segmentation 
(e.g. `let keyValue = {user_type:'paid'};` - Adds a KeyValue Pair with key as user_type and value as 'paid')

`RNWhatfixModule.setCustomKeyValue(keyValue);`

Adding Margin to TaskList widget. Values in DP

`RNWhatfixModule.setTLMargin(left, top, right, bottom);`

Enabling/Disabling EditorModes
(e.g. `RNWhatfixModule.setEditorMode(false, false);` - No editor gesture enabled
`RNWhatfixModule.setEditorMode(false, true);` - Enables editor mode using shake only
`RNWhatfixModule.setEditorMode(true, false);` - Enables editor mode using multitouch only)

`RNWhatfixModule.setEditorMode(isMultiTouchEnabled, isShakeEnabled);`

#
#####App has login screen. Sample login:

Username : user1

Password : password
