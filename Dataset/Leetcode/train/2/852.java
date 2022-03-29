 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        return intToList((listToInt(l1)+listToInt(l2)));
    }
    public int listToInt(ListNode list){
        int i=0;
        i=i+list.val+list.next.val*10+list.next.next.val*100;
        return i;
    }
    public ListNode intToList(int i){
        char[] chars=String.valueOf(i).toCharArray();
        return new ListNode(chars[2]).next=new ListNode(chars[1]).next=new ListNode(chars[0]);
    }
}

