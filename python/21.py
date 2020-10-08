
'''
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of
 the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

'''

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

# 2019/10/07 --> 44 ms, faster than 65.24%
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1:
            return l2
        if not l2:
            return l1

        dum = ListNode(None)
        cur = dum

        while l1 and l2:
            if l1.val > l2.val:
                cur.next = l2
                l2 = l2.next
            else:
                cur.next = l1
                l1 = l1.next
            cur = cur.next
        while not l1 and l2:
            cur.next = l2
            l2 = l2.next
            cur = cur.next

        while not l2 and l1:
            cur.next = l1
            l1 = l1.next
            cur = cur.next

        return dum.next

l1 = ListNode(1)
l1.next = ListNode(4)
l1.next.next = ListNode(8)


l2 = ListNode(1)
l2.next = ListNode(3)
l2.next.next = ListNode(4)

s = Solution
m = Solution.mergeTwoLists(s, l1, l2)
while m:
    print(m.val)
    m = m.next
