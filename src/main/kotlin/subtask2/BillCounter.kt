package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sumWithoutK = (bill.sum() - bill[k]) / 2
        return if (b <= sumWithoutK) "bon appetit" else "${b - sumWithoutK}"
    }
}
