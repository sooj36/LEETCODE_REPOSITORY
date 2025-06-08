/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var tail = dummy
        var cur1 = list1
        var cur2 = list2

        while (cur1 != null && cur2 != null) {
            if (cur1.`val` <= cur2.`val`) {
                tail.next = cur1
                tail = cur1
                cur1 = cur1.next
            } else {
                tail.next = cur2
                tail = cur2
                cur2 = cur2.next
            }
        }
        
        // 남은 노드들
        if (cur1 != null) {
            tail.next = cur1
        }

        if (cur2 != null) {
            tail.next = cur2
        }

        return dummy.next
    }
}