 class Solution {
    public ListNode XXX(ListNode head, int n) {
      ListNode Former=head;
        ListNode Latter=head;
        if(Former.next==null){
            return null;
        }
        for(int i=0;i<n;i++){
            Former=Former.next;
        }
        if(Former==null){
            head=Latter.next;
            return head;
        }
        while (Former.next!=null){
            Former=Former.next;
            Latter=Latter.next;
        }
        Latter.next=Latter.next.next;
        return head;


    }
}
