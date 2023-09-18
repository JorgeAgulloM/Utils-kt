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
        ...
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

- String Capitalizer

    ```text
    Extension function that simplifies the capitalisation of a text.
    ```
    ```kotlin
    import com.softyorch.utils.StringUtils.toCapitalized
    
    val myText = "hola, mundo"
    myText.toCapitalized()
    println("Hola, mundo")
    ```