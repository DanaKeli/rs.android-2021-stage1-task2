package subtask2

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        var x = ""
        var y = 0
        var newA = a.toUpperCase()
        for (i in b) {
            if (newA.contains(i)) {
                x += i
                if (y > newA.indexOf(i)) return "NO"
                y = newA.indexOf(i)
            } else break
        }
        return if (x == b) "YES" else "NO"
    }
}

