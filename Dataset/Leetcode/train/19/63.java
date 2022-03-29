 class Solution {
    public ListNode XXX(ListNode head, int n) {
        
        //设置两个节点都指向头结点
        ListNode cur=head;
        ListNode curr=cur;   

        //第二个节点走n步
        for(int i=1;i<=n;i++){
            curr=curr.next;
        }
        
        //考虑删除头结点的情况，判断第二个节点是否空
        if(curr!=null){
            while(curr.next!=null){
                cur=cur.next;
                curr=curr.next;//第二个节点指向最后一个节点时退出循环
            }
            cur.next=cur.next.next;//cur指向的是被删除的上一个节点
        } else{
            head=cur.next;
        }
       
        return head;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

