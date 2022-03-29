 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        // 进位
        int jinWie = 0;
        int sum = 0;
        ListNode temp1 = l1;
        ListNode temp2=l2;
        ListNode res = new ListNode();
        ListNode temp3 = res;
        // l1 l2 都不为空
        while (temp1 != null && temp2 != null) {
            
            sum = temp1.val + temp2.val +jinWie;
            jinWie = 0;
            if (sum > 9) {
                jinWie = 1;
                sum -=10;
            }
            temp3.next = new ListNode(sum);
            temp3 = temp3.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        // 如果temp1 不为空 temp2为空
        while (temp1 != null) {
            sum = temp1.val +jinWie;
            jinWie = 0;
            if (sum > 9) {
                jinWie = 1;
                sum -=10;
            }
            temp3.next = new ListNode(sum);
            temp3 = temp3.next;
            temp1 = temp1.next;
        }
        // 如果temp2 不为空 temp1为空
        while (temp2 != null){
            sum = temp2.val +jinWie;
            jinWie = 0;
            if (sum > 9) {
                jinWie = 1;
                sum -=10;
            }
            temp3.next = new ListNode(sum);
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
        // 如果最后还有进位
        if (jinWie == 1) {
           temp3.next = new ListNode(1); 
        }
        return res.next;
    }
}

