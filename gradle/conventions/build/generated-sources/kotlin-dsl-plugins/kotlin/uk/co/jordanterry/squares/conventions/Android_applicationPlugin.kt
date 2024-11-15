package uk.co.jordanterry.squares.conventions


/**
 * Precompiled [android.application.gradle.kts][uk.co.jordanterry.squares.conventions.Android_application_gradle] script plugin.
 *
 * @see uk.co.jordanterry.squares.conventions.Android_application_gradle
 */
public
class Android_applicationPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("uk.co.jordanterry.squares.conventions.Android_application_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
