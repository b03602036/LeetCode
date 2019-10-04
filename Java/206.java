public class Solution_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //206. Reverse Linked List
    //0 ms, faster than 100.00%
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode ret = new ListNode(head.val);
        ret.next = null;
        ListNode cur = head.next;
        while (cur != null){
            ListNode temp = new ListNode(cur.val);
            temp.next = ret;
            ret = temp;

            cur = cur.next;
        }
        return ret;
    }
}
