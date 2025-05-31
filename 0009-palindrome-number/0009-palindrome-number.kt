class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0  ||(x % 10 == 0 && x != 0)) return false

        var left = x
        var right = 0

        while (left > right) {
            right = right * 10 + left % 10
            left /= 10
        }
        return left == right || left == right / 10
    }
}