 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode list = head;
        int size=0;
        while(list.next!=null){
            list=list.next;
            size ++;
        }
        if(n>size){
            return head;
        }
        list = head;
        int i=0;
        while(i<(size-n)){
            list = list.next;
            i++;
        }
        list.next = list.next.next;
        return head;
    }
}

输入：
[1]
1
输出：
[1]
预期：
[]

