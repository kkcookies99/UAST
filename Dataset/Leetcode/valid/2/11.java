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
import java.math.BigInteger;
class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        StringBuffer num1 = new StringBuffer("");
        StringBuffer num2 = new StringBuffer("");
        ListNode p = l1;
        while(p!=null){
            num1.append(p.val);
            p=p.next;   
        }
        p=l2;
        while(p!=null){
            num2.append(p.val);
            p=p.next;
        }
        num1.reverse();
        num2.reverse();
        BigInteger big1 = new BigInteger(new String(num1));
        BigInteger big2 = new BigInteger(new String(num2));
        BigInteger add = big1.add(big2);
        StringBuffer res = new StringBuffer(add.toString());
        res.reverse();
        ListNode resFinal = new ListNode(res.charAt(0)-48);
        p=resFinal;
        for(int i=1;i<res.length();i++){
            ListNode tem = new ListNode(res.charAt(i)-48);
            p.next = tem;
            p = tem;
        }
        return resFinal;
    }
}