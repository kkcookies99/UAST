 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int length=0;
        ListNode tmpNode=head;
        while (tmpNode!=null){
            length++;
            tmpNode=tmpNode.next;
        }//获取长度
        if (length==1){
            return null;
        }
        int i=0;
        tmpNode=head;
        while (tmpNode!=null){
            if (n==1){//判断要删除的位置是否是尾节点
                while (tmpNode.next!=null && tmpNode.next.next!=null){
                    //找到尾节点的前一个,tmpNode.next.next==null的时候就表示已经找到了
                    tmpNode=tmpNode.next;
                }
                tmpNode.next=null;
                return head;
            }else if (n==length){//判断要删除的位置是否是头结点

                return head.next;
            }else {
                if (i==(length-n)-1){
                    tmpNode.next=tmpNode.next.next;
                }
                i++;
                tmpNode=tmpNode.next;
            }
        }
        return  head;

    }
}

