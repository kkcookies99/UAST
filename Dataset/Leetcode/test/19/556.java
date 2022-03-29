 class Solution {
    public ListNode XXX(ListNode head, int n) {

        // ListNode root = new ListNode(0,head);
        // ListNode slow = root;
        // ListNode fast = slow;
        // for(int i = 0;fast.next!=null&&i < n;i++){         //双指针，中间隔n+1个距离，因为要删除的是slow.next
        //    fast = fast.next;
        // }
        // while(fast.next != null){
        //         fast = fast.next;
        //         slow = slow.next;
        // }
        // slow.next = slow.next.next;
        // return root.next;
        ListNode root = new ListNode(0,head);
        recursion(root,0,n);
        return root.next;

    }

    public int recursion(ListNode a,int level,int n){      //递归的做法 是后序遍历！！！
        if(a.next==null)return 1;
        level = recursion(a.next,level,n) + 1;      //计算此时的位置
        if(level == n+1) a.next = a.next.next;      //如果此时的位置已经到达要删除的前一个节点，则执行删除
        return level;
    }

}

