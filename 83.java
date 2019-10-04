class solution{

    //83. Remove Duplicates from Sorted List
    //0 ms, faster than 100.00%
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode cur = head;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
                continue;
            }
            cur = cur.next;
        }
        return head;
    }

}
