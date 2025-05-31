class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val checkMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val secondNum = target - nums[i]

            if (checkMap.containsKey(secondNum)) {
                // return intArrayOf(map[secondNum]!!, i) 
                return intArrayOf(checkMap.getValue(secondNum), i)
            }

            checkMap[nums[i]] = i 
            // 현재 값과 인덱스를 맵에 저장
        }
        return intArrayOf()
    }
}