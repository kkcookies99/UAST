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
        if(l1.val==0&&l1.next==null)
            return l2;
        else if(l2.val==0&&l2.next==null)
            return l1;

        int carry=(l1.val+l2.val)/10;
        ListNode h=new ListNode((l1.val+l2.val)%10);
        
        l1=(l1.next==null)?null:l1.next;
        l2=(l2.next==null)?null:l2.next;

        int var1,var2;  //用于保存临时结果
        int result;   //保存进位
        ListNode p=h;

        while(l1!=null || l2!=null || carry!=0){
            var1=(l1==null) ? 0 : l1.val;
            var2=(l2==null) ? 0 : l2.val;
            
            result = (var1+var2+carry)%10;
            ListNode q=new ListNode(result,null);  p.next=q;  p=q;  //创建链表
            carry=(var1+var2+carry)/10;   //保存进位  

            //循环条件
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return h;
    }

}