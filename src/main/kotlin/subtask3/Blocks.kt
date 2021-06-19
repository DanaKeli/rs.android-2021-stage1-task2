package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {
                var blockC = 0
                for (i in blockA) {
                    if (i != null && i::class == Int::class) blockC += (i as Int)
                }
                return blockC
            }
            String::class -> {
                var blockC = ""
                for (i in blockA) {
                    if (i != null && i::class == String::class) blockC += i.toString()
                }
                return blockC
            }
            else -> {
                var blockC: LocalDate = LocalDate.of(1, 1, 1)
                for (i in blockA) {
                    if (i is LocalDate) {
                        if (i > blockC) blockC = i
                    }
                }
                return "${blockC.dayOfMonth}.${blockC.monthValue}.${blockC.year}"
            }
        }

    }
}
