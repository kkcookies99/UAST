 class Solution {
    public ListNode XXX(ListNode head, int n) {
        // 双指针法
        ListNode prior = head;
        ListNode pre = new ListNode(0,head); //新建一个头节点
        while(n-->0){
            prior = prior.next;
        }
        while(prior!=null){
            prior = prior.next;
            pre = pre.next;
        }
        
        if(pre.next == head){
            head = head.next;
        }else{
            pre.next = pre.next.next;
        }

        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

