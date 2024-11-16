/**
 * Precompiled [uk.co.jordanterry.squares.android.application.gradle.kts][Uk_co_jordanterry_squares_android_application_gradle] script plugin.
 *
 * @see Uk_co_jordanterry_squares_android_application_gradle
 */
public
class Uk_co_jordanterry_squares_android_applicationPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Uk_co_jordanterry_squares_android_application_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}