 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int sum;
        String X,Y,SUM;
        //返回的链表
        ListNode nodeFrist = new ListNode();
        ListNode nodeSecond = new ListNode();
        ListNode nodeThird = new ListNode();
        nodefrist.next=nodesecond;
        nodesecond.next=nodethird;
        //转换成字符串并拼接
        X = String.valueOf(l1.next.next.val)+String.valueOf(l1.next.val)+String.valueOf(l1.val);
        Y = String.valueOf(l2.next.next.val)+String.valueOf(l2.next.val)+String.valueOf(l2.val);
        //转换成整数类型，求和
        sum = Integer.valueOf(X).intValue()+Integer.valueOf(Y).intValue();
        //转换成字符串并截取子字符串
        SUM = String.valueOf(sum);
        nodethird.val = Integer.valueOf(SUM.substring(0,1)).intValue();
        nodesecond.val = Integer.valueOf(SUM.substring(1,2)).intValue();
        nodefrist.val = Integer.valueOf(SUM.substring(2)).intValue();
        return nodefrist;
    }
}

