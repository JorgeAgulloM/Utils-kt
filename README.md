# Utils Library

##### Last update 2023/09/18
##### Version 0.0.1

#### Kotlin library with utilities for reviewing project SDK levels, Toast object visualisation, Capitalisation and Log.

### How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

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

### Utilities:

## V0.1.2

- Delete Accents

    ```Text
    Extension function to remove accents, useful e.g. for string comparisons. 
    ```
    ```kotlin
    val spanishWord = "Configuración"
    print(spanishWord.deleteAccents()) //= Configuracion
    ```

## V0.1.1

- Time Utils

    ```Text
    Extension functions to pass from Calendar to String, vice-versa and to obtain isolated values from them.
    ```

  - Calendar to String ISO8601 formatted

    ```Text
    Transforms the date of a calendar to ISO8601 format without milliseconds and timezone
    by returning the result in a String.
    ```
    ```Kotlin
    val calendar = Calendar.getInstance()
    println(calendar.toDateFormattedISO8601())
    ```

  - Calendar to String Date

    ```Text
    Returns a String of the date of a Calendar.
    ```
    ```Kotlin
    val calendar = Calendar.getInstance()
    println(calendar.getDateOfNow())
    ```

  - Calendar to String Time

    ```Text
    Returns a String of the time of a Calendar.
    ```
    ```Kotlin
    val calendar = Calendar.getInstance()
    println(calendar.getCurrentTimeOfNow())
    ```

  - Full Date String to Calendar

    ```Text
    Transforms a full String date into a Calendar. No need to pass seconds.
    ```
    ```Kotlin
    val stringDate = "2023-09-21T12:23:34"
    println(stringDate.toCalendarTime())
    ```

  - Full Date String to Date String

    ```Text
    Returns from an ISO8601 String dateTime value, the date value in String type.
    ```
    ```Kotlin
    val stringDate = "2023-09-21T12:23:34"
    println(stringDate.getDateOfNow()) // -> "2023-09-21"
    ```

  - Full Date String to Time String

    ```Text
    Returns from an ISO8601 String dateTime value, the time value in String type.
    ```
    ```Kotlin
    val stringDate = "2023-09-21T12:23:34"
    println(getCurrentTimeOfNow()) // -> "12:23:34"
    ```

  - Time String to Time String without seconds

    ```Text
    Removes seconds from a String time offset.
    ```
    ```Kotlin
    val stringTime = "12:23:34"
    println(stringTime.deleteSeconds()) // -> "12:23"
    ```

<br>

## V0.0.1

- SDK level assessment

    ```text
    - Inline functions that allow you to run your code if the required SDK version is met.
    - Boolean variables that allow you to evaluate whether the required SDK level is met.
    ```
    ```kotlin

    import com.softyorch.utils.SdkUtils.sdk33AndUp
    import com.softyorch.utils.SdkUtils.sdk31AndUp

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            sdk33AndUp {
                println("This code will work on API33 or higher")
            }

            if (sdk31AndUp)
                println("This code will work on API31 or higher")

        }
    }
    ```

- Log writer

    ```text
    - Extension function that simplifies the use of the Android Logger.
    ```
    ```kotlin
    import com.softyorch.utils.LogUtil.logInfo
    import com.softyorch.utils.LogUtil.logDebug

    val myString: String
    myString.logInfo("Hi, this is an Info Log")

    //or

    "text".logDebug("Hi, this is an Info Log")
    ```

- Toast Maker

    ```text
    Extension function that simplifies the way to invoke a Toast message    
    ```
    ```kotlin
    import com.softyorch.utils.ContextUtils.showToast

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            this.showToast("message")
        }
    }
    ```

- String Capitalize

    ```text
    Extension function that simplifies the capitalisation of a text.
    ```
    ```kotlin
    import com.softyorch.utils.StringUtils.toCapitalized
    
    val myText = "hola, mundo"
    myText.toCapitalized()
    println("Hola, mundo")
    ```