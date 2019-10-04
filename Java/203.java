class solution{
    //203. Remove Linked List Elements
    //1 ms, faster than 98.50%
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head!=null && head.val == val){
            head = head.next;
        }
        if(head == null) return null;
        ListNode cur = head;
        while(cur.next != null){

        if(cur.next.val == val){
            cur.next = cur.next.next;
            continue;
        }
        cur = cur.next;

        }
        return head;
    }
}
