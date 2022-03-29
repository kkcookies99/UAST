 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();
        while (l1 !=null || l2!=null){
            if(l1 != null){
                list1.add(l1.val);
                l1 = l1.next;
            }else{
                list1.add(0);
            }
            if(l2 != null){
                list2.add(l2.val);
                l2 = l2.next;
            }else {
                list2.add(0);
            }
        }
        list1.add(0);
        list2.add(0);
        ListNode head = new ListNode(0);
        ListNode copy = head;

        ListNode last2 = null;
        for(int i=0;i< list1.size();i++){
            int sum = list1.get(i) + list2.get(i);
            if(sum >=10){
                sum -= 10;
                list2.set(i + 1,list2.get(i + 1)+1);
            }
            head.next = new ListNode(sum);
            if(i == list1.size() - 2){
                last2 = head.next;
            }
            head = head.next;
        }
        if(head.val == 0){
            last2.next = null;
        }
        return copy.next;
    }
}

