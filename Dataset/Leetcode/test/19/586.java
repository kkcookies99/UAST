 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        if(remove(head,n)==n){
            return head.next;
        }
        
        return head;
    }
    public int remove(ListNode head,int n) {
        if(head==null){
            return 0;
        }
        int a = remove(head.next,n)+1;
        if(a==n+1){
            if(n==1){
                head.next = null;
            }else{
                head.next = head.next.next;
            }
        }
        return a;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


