 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list22 = new ArrayList<>();
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        int s1 = list1.size();
        int s2 = list2.size();
        if(s1 > s2){
            for(int i = 0;i < s1 - s2;i++) list22.add(0);
        }
        if(s2 > s1){
            for(int i = 0;i < s2 - s1;i++) list11.add(0);
        }
        for(int i = s1 - 1;i >= 0;i--) list11.add(list1.get(i));
        for(int i = s2 - 1;i >= 0;i--) list22.add(list2.get(i));
        int len = list11.size();
        int temp = 0;
        ListNode result = new ListNode(-1);
        ListNode r = result;
        for(int i = len - 1;i >= 0;i--){
            int sum = list11.get(i) + list22.get(i);
            if(temp == 1){
                sum += temp;
                temp = 0;
            }
            result.next = new ListNode(sum % 10);
            temp = sum / 10;
            result = result.next;
        }
        if(temp != 0)result.next = new ListNode(temp);
        return r.next;
    }
}

