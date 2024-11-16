package uk.co.jordanterry.squares.conventions


/**
 * Precompiled [android.library.gradle.kts][uk.co.jordanterry.squares.conventions.Android_library_gradle] script plugin.
 *
 * @see uk.co.jordanterry.squares.conventions.Android_library_gradle
 */
public
class Android_libraryPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("uk.co.jordanterry.squares.conventions.Android_library_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
