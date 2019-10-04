// 2. Add Two Numbers

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1);
        ListNode cur = ret;
        boolean flag = false;
        while (l1 != null && l2 != null){
            int val = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
            if((val < 10) && flag == false){
                cur.next = new ListNode(val);
                cur = cur.next;
            }
            else if ((val < 10) || flag == true){
                if(val + 1 >= 10){
                    cur.next = new ListNode((val + 1 ) % 10);
                    cur = cur.next;
                }
                else{
                    cur.next = new ListNode(val + 1);
                    flag = false;
                    cur = cur.next;
                }
            }else if ((val >= 10) && (flag == false)){
                cur.next = new ListNode(val % 10);
                flag = true;
                cur = cur.next;
            }else if ((val >= 10) && flag == true){
                cur.next = new ListNode(val % 10 + 1);
                flag = true;
                cur = cur.next;
            }
        }

        while(l1 != null && l2 == null){
            if(flag == true && l1.val + 1 < 10){
                cur.next = new ListNode(l1.val + 1);
                flag = false;
            }
            else if (flag == true && l1.val + 1 == 10){
                cur.next = new ListNode(0);
                flag = true;
            }
            else {
                cur.next = new ListNode(l1.val);
            }
            l1 = l1.next;
            cur = cur.next;
        }

        while(l2 != null && l1 == null){
            if(flag == true && l2.val + 1 < 10){
                cur.next = new ListNode(l2.val + 1);
                flag = false;
            }
            else if (flag == true && l2.val + 1 == 10){
                cur.next = new ListNode(0);
                flag = true;
            }
            else{
                cur.next = new ListNode(l2.val);
            }
            l2 = l2.next;
            cur = cur.next;
        }

        if(flag == true){
            cur.next = new ListNode(1);
        }

        return ret.next;
    }
}
