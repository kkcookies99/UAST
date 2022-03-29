 class Solution {
    public ListNode XXX(ListNode head, int n) {
            ListNode[] ls = new ListNode[31];
            ListNode pointer = head;
            int length = 0;
            while(pointer!=null){
                ls[length]=pointer;
                pointer = pointer.next;
                length++;
            }
            if(n>length) return head;
            if(n==length) return head.next;
            ls[length-n-1].next = ls[length-n+1];
            return ls[0];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


