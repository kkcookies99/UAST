 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode[] arr=new ListNode[100];
        ListNode node=head;
        int i=0;//数组的长度
        while(node!=null){
            arr[i++]=node;
            node=node.next;
        }
        int index=i-n;//index是要删除的正数（倒数的反面）的索引值
        if(index==0){
            return head.next;
        }
        if(index==i-1){
            arr[index-1].next=null;
            return head;
        }
        ListNode tmp=arr[index].next;
        arr[index].next=null;
        arr[index-1].next=tmp;
        return head;
    }
}

