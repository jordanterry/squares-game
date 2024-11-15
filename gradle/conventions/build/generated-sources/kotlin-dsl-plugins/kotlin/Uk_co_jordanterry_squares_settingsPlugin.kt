/**
 * Precompiled [uk.co.jordanterry.squares.settings.settings.gradle.kts][Uk_co_jordanterry_squares_settings_settings_gradle] script plugin.
 *
 * @see Uk_co_jordanterry_squares_settings_settings_gradle
 */
public
class Uk_co_jordanterry_squares_settingsPlugin : org.gradle.api.Plugin<org.gradle.api.initialization.Settings> {
    override fun apply(target: org.gradle.api.initialization.Settings) {
        try {
            Class
                .forName("Uk_co_jordanterry_squares_settings_settings_gradle")
                .getDeclaredConstructor(org.gradle.api.initialization.Settings::class.java, org.gradle.api.initialization.Settings::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
