# Utils-kt Library

##### Last update 2025/10/06
##### Version 0.1.3

#### A Kotlin library with utilities for Android development. Now updated to support SDK 36, Java 21 (minSdk 23), and fully tested.

### How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

- Groovy
```groovy
allprojects {
  repositories {
    //...
    maven { url 'https://jitpack.io' }
  }
}
```

- Kotlin DSL
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io" )
    }
}
```
Step 2. Add the dependency

- Groovy
```groovy
dependencies {
    implementation 'com.github.JorgeAgulloM:Utils-kt:Tag'
}
```
- Kotlin DSL
```kotlin
dependencies {
    implementation("com.github.JorgeAgulloM:Utils-kt:Tag")
}
```
#### Tag: [![](https://jitpack.io/v/JorgeAgulloM/Utils-kt.svg)](https://jitpack.io/#JorgeAgulloM/Utils-kt)

<br>

### Testing

This library is now equipped with unit tests to ensure the reliability and proper functioning of its utilities.

<br>

### Utilities

### SdkUtils

Object with inline functions and boolean variables to check the device's SDK version. It supports versions from SDK 24 (Nougat) to SDK 36 (Baklava).

- **Execute code on a specific SDK version or higher:**

    ```kotlin
    import com.softyorch.utilsktlibrary.SdkUtils.sdk36AndUp

    sdk36AndUp {
        // This code will run only on devices with SDK 36 (Baklava) or higher.
        println("This is for API 36+")
    }
    ```

- **Execute code below a specific SDK version:**

    ```kotlin
    import com.softyorch.utilsktlibrary.SdkUtils.sdk28Down

    sdk28Down {
        // This code will run only on devices with an SDK lower than 28 (Pie).
        println("This is for devices older than Pie")
    }
    ```

- **Boolean check for SDK version:**

    ```kotlin
    import com.softyorch.utilsktlibrary.SdkUtils.sdk23AndUp

    if (sdk23AndUp) {
        // This code will run only on devices with SDK 23 (S) or higher.
        println("This is for API 23+")
    }
    ```

### StringUtils

- **Delete Accents**

    Extension function to remove accents from a string.
    ```kotlin
    val spanishWord = "Configuración"
    print(spanishWord.deleteAccents()) // Outputs: Configuracion
    ```

- **Capitalize**

    Extension function that capitalizes the first letter of a string.
    ```kotlin
    val myText = "hola, mundo"
    println(myText.toCapitalized()) // Outputs: Hola, mundo
    ```

### TimeUtils

Extension functions to convert `Calendar` objects to `String` and vice-versa.

- **Calendar to String ISO8601 formatted**
    ```kotlin
    val calendar = Calendar.getInstance()
    println(calendar.toDateFormattedISO8601()) // e.g., 2024-05-23T10:30:00
    ```

- **String (ISO8601) to Calendar**
    ```kotlin
    val stringDate = "2024-05-23T10:30:00"
    val calendar = stringDate.toCalendar()
    ```

### ContextUtils

- **Show Toast**

    Extension function on `Context` to simplify showing a Toast message.
    ```kotlin
    // In an Activity or any other Context
    this.showToast("Your message")
    ```

### LogUtils

- **Log Writer**

    Extension functions on `String` that simplify the use of Android's Logger.
    ```kotlin
    "My message".logInfo("MyTag")
    "Debug data".logDebug("MyTag")
    ```
