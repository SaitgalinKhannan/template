import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}