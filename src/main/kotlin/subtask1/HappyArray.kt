package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        var array = sadArray

        while (!isHappyArray(array)){
            val happyElements = arrayListOf(array[0])

            for (i in 1..(array.size - 2))
                if (array[i - 1] + array[i + 1] > array[i])
                    happyElements.add(array[i])

            happyElements.add(array[array.size - 1])

            array = happyElements.toIntArray()
        }

        return array
    }

    private fun isHappyArray(array: IntArray): Boolean {
        for (i in 1..(array.size - 2))
            if (array[i - 1] + array[i + 1] < array[i])
                return false
        return true
    }
}
