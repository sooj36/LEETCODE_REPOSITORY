class Solution {
    fun isValid(string: String): Boolean {

        //stack
        val stackList = mutableListOf<Char>()
        
        for (char in string) {
            when (char) {
                '(' -> stackList.add(')')
                '{' -> stackList.add('}')
                '[' -> stackList.add(']')
                
                else -> {
                    if (stackList.isEmpty() || stackList.removeLast() != char) return false
                }
            } 
        }
        return stackList.isEmpty()
    }
}