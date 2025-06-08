<h2><a href="https://leetcode.com/problems/merge-two-sorted-lists">21. Merge Two Sorted Lists</a></h2><h3>Easy</h3><hr><p>You are given the heads of two sorted linked lists <code>list1</code> and <code>list2</code>.</p>

<p>Merge the two lists into one <strong>sorted</strong> list. The list should be made by splicing together the nodes of the first two lists.</p>

<p>Return <em>the head of the merged linked list</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" style="width: 662px; height: 302px;" />
<pre>
<strong>Input:</strong> list1 = [1,2,4], list2 = [1,3,4]
<strong>Output:</strong> [1,1,2,3,4,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> list1 = [], list2 = []
<strong>Output:</strong> []
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> list1 = [], list2 = [0]
<strong>Output:</strong> [0]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in both lists is in the range <code>[0, 50]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
	<li>Both <code>list1</code> and <code>list2</code> are sorted in <strong>non-decreasing</strong> order.</li>
</ul>

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
        val dummy = ListNode(0) // 가짜 더미 시작점
        var tail = dummy // 새 리스트의 끝 부분 추적( 연결 리스트는 끝에서만 추가 가능 )
        var cur1 = list1 // 첫 번째 리스트 현재 위치
        var cur2 = list2 // 두 번째 리스트 현재 위치

        while (cur1 != null && cur2 != null) { // 둘 다 남아있을 때까지 반복
            if (cur1.`val` <= cur2.`val`) { // 첫 번째 값이 더 작으면
                tail.next = cur1 // 첫 번째 결과에 연결
                tail = cur1 // tail을 새로 연결된 곳으로 이동
                cur1 = cur1.next // 첫 번째 리스트 다음으로 이동
            } else {
                tail.next = cur2
                tail = cur2
                cur2 = cur2.next
            }
        }
        
        // 남은 노드들
        if (cur1 != null) { // 첫번째 리스트에만 남은게 있으면
            tail.next = cur1 // 그대로 연결
        }

        if (cur2 != null) {
            tail.next = cur2
        }

        return dummy.next // 가짜 더미 시작점 다음부터가 진짜 시작점
    }
}
