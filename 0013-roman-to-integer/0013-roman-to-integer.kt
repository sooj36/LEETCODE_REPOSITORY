class Solution {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        
        var result = 0
        
        for (i in s.indices) {
            val current = romanMap[s[i]]!!

            // 다음 문자 있고 && 현재 < 다음 면은 -
            if (i <s.length -1  && current < romanMap[s[i+1]]!!) {
                result -= current
            } else {
                result += current
            }
        }
        
        return result
    }
}
