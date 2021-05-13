# Whatfix iOS Sample Project

This article explains how to install and update the Whatfix iOS SDK in your project.

## Prerequisites

* `Xcode 11+`
* `iOS 13`
* `Swift 5` 

## Build Project

**1.** To build project first install Whatfix SDK from Cocoapods.

```
cd ios-sample
pod install
open SoupChef.xcworkspace
```

**2.** Now to initialize Whatfix add your Whatfix `ent_name` and `ent_id` inside `application:didFinishLaunchingWithOptions:` method of `AppDelegate.swift` file.

```swift
Whatfix.initialize(entName: "<ent_name>", entId: "<ent_id>", application: application)
```

To get your `ent_name` & `ent_id`, email us at support@whatfix.com or get in touch with your Account Manager.

**3.** Build and Run the app.

## Other APIs:

**1.** Set your custom host to serve content. Default is `cdn.whatfix.com`

```swift
Whatfix.set(customContentLocation: "<custom_cdn_host>")
```

**2.** Set the current user role from your app (e.g. `manager`)

```swift
Whatfix.set(loggedInUserRole: "<logged_in_user_role>")
```

**3.** Set the current user id for analytics (e.g. `john_doe`)

```swift
Whatfix.set(loggedInUserId: "<logged_in_user_id>")
```  

**4.** Set the current user language preference (e.g. `fr`)

```swift
Whatfix.set(language: "<language_code>")
```

