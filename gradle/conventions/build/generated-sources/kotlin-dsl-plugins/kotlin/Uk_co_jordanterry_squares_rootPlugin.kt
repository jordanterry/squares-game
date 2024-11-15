/**
 * Precompiled [uk.co.jordanterry.squares.root.gradle.kts][Uk_co_jordanterry_squares_root_gradle] script plugin.
 *
 * @see Uk_co_jordanterry_squares_root_gradle
 */
public
class Uk_co_jordanterry_squares_rootPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Uk_co_jordanterry_squares_root_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
