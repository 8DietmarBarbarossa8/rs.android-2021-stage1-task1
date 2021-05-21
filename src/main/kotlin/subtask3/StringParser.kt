package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        val openBrackets = listOf('<', '[', '(')
        val resSet = mutableSetOf<String>()

        var tmp: Char
        var str = StringBuilder()
        var index = 0
        var returnInd = -1
        var repeats = 0

        while (index < inputString.length) {
            if (inputString[index] in openBrackets) {
                tmp = inputString[index]
                returnInd = index + 1
                index++
                while (inputString[index] != closeAnalog(tmp) || repeats !=0) {
                    str.append(inputString[index])
                    if(inputString[index] == tmp) repeats++
                    if(inputString[index] == closeAnalog(tmp)) repeats--
                    index++
                }
                resSet.add(str.toString())
                str.clear()
                index = returnInd
            }
            else index++
        }

        return resSet.toTypedArray()
    }

    private fun closeAnalog(ch: Char): Char = when (ch) {
        '[' -> ']'
        '<' -> '>'
        '(' -> ')'
        else -> ' '
    }
}
