 class Solution {
    public ListNode XXX(ListNode head, int n) {
        
        if(head.next == null){
            return null;
        }
        
        ListNode node = head;
        while(true){
            if(getPos(node,n+1) == 2) {
                return head.next;
            }
            else if(getPos(node,n+1) == 1)
                break;
            node = node.next;
        }
        //找到了node的前一个位置进行删除 分几种情况

        
        if(node.next.next == null){
            node.next = null;
        } else {
            node.next = node.next.next;
        }


        return head;
          
    }

    /*
        单独给一个方法判定倒数位置的 前一个位置（配合删除）
    */
    public int getPos(ListNode node,int count) {
        while(count != 0) {
            if(node == null) //若node提前走到底了 说明就是删除头
                return 2;
            node = node.next;
            count--;
        }
        if(node == null)
            return 1;
        else 
            return 0;
    }
}

