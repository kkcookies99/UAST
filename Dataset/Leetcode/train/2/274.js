/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var XXX = function(l1, l2) {
    let head=new ListNode(0);
    let current = head;
    let sum=0;
    let carry=0;
    while(l1||l2||carry>0){
        if(l1){
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2){
            sum+=l2.val;
            l2=l2.next;
        }

        if(carry){
            sum++;
            carry=0;
        }
        current.next=new ListNode(sum%10);
        carry=parseInt(sum/10);
        sum=0;
        current=current.next;
        
    }
    return head.next;
};

