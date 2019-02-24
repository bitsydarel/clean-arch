import Configurations.kotlinLanguageVersion

object KotlinLibraries {
    const val gradlePlugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinLanguageVersion"
    const val nativePlguin: String = "org.jetbrains.kotlin:kotlin-native-gradle-plugin:$kotlinLanguageVersion"
    /*************************** Kotlin common libraries **************************************/
    const val stdlibCommon: String = "org.jetbrains.kotlin:kotlin-stdlib-common"
    const val testCommon: String = "org.jetbrains.kotlin:kotlin-test-common"
    const val testAnnotationCommon: String = "org.jetbrains.kotlin:kotlin-test-annotations-common"
    /*************************** Kotlin JVM Libraries *****************************************/
    const val testJvm: String = "'org.jetbrains.kotlin:kotlin-test'"
    const val testJunitJvm: String = "org.jetbrains.kotlin:kotlin-test-junit"
    const val stdlibJdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val stdlibJdk7: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk7"
    const val reflection: String = "org.jetbrains.kotlin:kotlin-reflect"
    /*************************** Kotlin Javascript libraries *********************************/
    const val stdlibJs: String = "org.jetbrains.kotlin:kotlin-stdlib-js"
    const val testJs: String = "org.jetbrains.kotlin:kotlin-test-js"
}

object ThirdPartiesLibraries {
    const val rxJava2: String = "io.reactivex.rxjava2:rxjava:2.2.7"
}