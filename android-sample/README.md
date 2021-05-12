

Integrate Whatfix SDK in your Android project
=============================================

This article explains how to install and update the Whatfix Android SDK in your project.

### **Prerequisites**:

-   Android Studio

-   Android version: **7.0 & later (API level/SDK version 24 & later)**

### **Integration:**

#### Step 1: Add Whatfix Maven repo URL in your build

Add maven `{ url 'https://jitpack.io' }`in Gradle root

```groovy
 repositories { 
   maven {
 
       url  'https://jitpack.io'
 
   }
}
```

#### Step 2: Add the Whatfix SDK dependency 

Add bintray link in the app gradle dependency.

To add Whatfix dependency to your project, specify the following dependency configuration in the dependencies block of your **build.gradle** file.

```groovy
implementation 'org.bitbucket.whatfix:whatfix-android:$sdk-version'
```

where $sdk-version is the latest version of the SDK available which is [![](https://jitpack.io/v/org.bitbucket.whatfix/whatfix-android.svg)](https://jitpack.io/#org.bitbucket.whatfix/whatfix-android)


#### Step 3: Initialize Whatfix in your project

Initialize Whatfix in your **Application** class using the <ent_name> and <ent_id> provided to you.

**Java:**

```java
    Whatfix.initialize(this, "<ent_name>", "<ent_id>" );
```

**Kotlin :**

```kotlin
Whatfix.initialize(application, "<ent_name>", "<ent_id>")

```


Replace <ent_id> & <ent_name> with your Whatfix account ID and NAME . To get your ENT ID & ENT NAME, email us at <support@whatfix.com> or get in touch with your Account Manager.

### Other APIs

1.  Set your custom host to serve content. Default is [cdn.whatfix.com](http://cdn.whatix.com/)

**Java:**
```java
    Whatfix.setCustomContentLocation("test.whatfix.com");
``` 

**Kotlin:**
```kotlin
    Whatfix.setCustomContentLocation("test.whatfix.com")
```

2.  Set the current user role from your app. 
  **Java:**
```java

    Whatfix.setLoggedInUserRole("manager");
```

**Kotlin:**
```kotlin
    Whatfix.setLoggedInUserRole("manager")
```


3.  Set the current user id for analytics

 **Java:**
```java
    Whatfix.setLoggedInUserId("john_doe");
```

**Kotlin:**
```kotlin
    Whatfix.setLoggedInUserId("john_doe")
```

4.  Set the current user language preference

**Java:**
```java

    Whatfix.setLanguage("fr");
```

**Kotlin:**
```kotlin
    Whatfix.setLanguage("fr")
```
