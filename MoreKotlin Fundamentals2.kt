data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

enum class Daypart{
    MORING, AFTERNOON, EVENING
}

fun main() {
    val event = Event(title="Study Kotlin", description="Commit to studying Kotlin at least 15 minutes per day.", Daypart.EVENING, durationInMinutes=15)
    println("Title: ${event.title}")
    println("Description: ${event.description}")
    println("Daypart: ${event.daypart}")
    println("Duration in minutes: ${event.durationInMinutes}")
}