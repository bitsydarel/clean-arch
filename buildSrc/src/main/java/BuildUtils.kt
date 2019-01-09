import org.gradle.api.Project
import java.util.*

fun Project.getLocalProperties() : Properties {
    val localProps = Properties()
    localProps.load(rootProject.file("local.properties").inputStream())
    return localProps
}