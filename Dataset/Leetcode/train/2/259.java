class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        while(l1!=null){
            System.out.println(l1.val);
            list1.add(l1.val);
            l1 = l1.next;
        }

        while(l2!=null){
            list2.add(l2.val);
            l2 = l2.next;
        }

        int length1 = list1.size();
        int length2 = list2.size();

        if(length1<length2){
            for(int i = 0 ; i < length2-length1; i++){
                list1.add(0);
            }
        }else{
            for(int i = 0 ; i < length1-length2; i++){
                list2.add(0);
            }
        }

        int value = 0;
        ListNode l_head = new ListNode();
        ListNode l = l_head;
        for(int i = 0 ; i < list1.size();i++){
            int res = list1.get(i)+list2.get(i)+value;
            if(res>9){
                l_head.next = new ListNode(res%10);
                System.out.println(l_head.next.val);
                value = 1;
            }else{
                l_head.next = new ListNode(res);
                System.out.println(l_head.next.val);

                value = 0;
            }

            l_head = l_head.next;

            if(i == list1.size()-1 && res>9){
                l_head.next = new ListNode(1); 
                System.out.println(l_head.next.val);
           
            }

        }

        return l.next;
    }
}

