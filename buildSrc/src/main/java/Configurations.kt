/**
 * Clean architecture project configurations.
 */
object Configurations {
    /**
     * Kotlin language version.
     */
    const val kotlinLanguageVersion: String = "1.3.21"
    /**
     * Clean architecture default jvm version.
     */
    const val jvmDefaultVersion = "1.8"
    /************* Publishing configuration **************************/
    /**
     * Group id of the project.
     */
    const val groupId: String = "com.bitsydarel.clean-arch"
    const val licenseName: String = "The Apache Software License, Version 2.0"
    const val licenseUrl: String = "http://www.apache.org/licenses/LICENSE-2.0.txt"
    const val cleanArchCoreVersion: String = "0.3"
    const val cleanArchRxJavaVersion: String = "0.2"
    const val cleanArchCoroutinesVersion: String = "0.1"
    const val remoteMavenRepo: String = "https://dl.bintray.com/bitsydarel/maven"
    const val authorId: String = "bitsydarel"
    const val authorName: String = "Bitsy Darel"
    const val authorEmail: String = "bitsydarel@gmail.com"
    const val authorWebsite: String = "https://github.com/bitsydarel"
    const val cleanArchProjectScmConnectUrl: String = "scm:git:git://github.com/bitsydarel/clean-arch.git"
    const val cleanArchProjectScmUrl: String = "https://github.com/bitsydarel/clean-arch.git"
    const val cleanArchProjectUrl: String = "https://github.com/bitsydarel/clean-arch"
    /************** Core library configurations ***************/
    const val coreLibraryName: String = "Clean architecture multiplatform core library"
    const val coreLibraryDescription: String = "Multiplatform core library to build software base on Clean architecture"
    /************** RxJava library configurations *************/
    const val rxJavaLibraryName: String = "Clean architecture RxJava based library"
    const val rxJavaLibraryDescription: String = "RxJava based library to build software base on Clean architecture"
    /************** Coroutine library configurations ***************/
    const val coroutineLibraryName: String = "Clean architecture multiplatform coroutine library"
    const val coroutineLibraryDescription: String = "Multiplatform coroutine library to build software base on Clean architecture"

}