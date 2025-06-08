class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map1 = mutableMapOf<Char, Char>()
        val map2 = mutableMapOf<Char, Char>() // 역방향 체크

        for (i in s.indices) {
            val char1 = s[i]
            val char2 = t[i]

            if (map1.containsKey(char1)) {
                if (map1[char1] != char2) return false // char 1값이 char2랑 다르면 false
            } else {
                map1[char1] = char2
            }

            if (map2.containsKey(char2)) {
                if (map2[char2] != char1) return false
            } else {
                map2[char2] = char1
            }
        }
        return true
    }
}