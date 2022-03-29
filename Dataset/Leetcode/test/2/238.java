class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
       LinkedList<Integer> linkedList = new LinkedList<>();
        ListNode n1 = l1;
        ListNode n2 = l2;
        do{
            linkedList.push(n1.val + n2.val);
            n1 = n1.next;
            n2 = n2.next;
        }while  (n1 !=null && n2 !=null);

        if (n1!=null)
            do{
                linkedList.push(n1.val );
                n1 = n1.next;
            }while (n1 !=null);
        if (n2!=null)
            do{
                linkedList.push( n2.val);
                n2 = n2.next;
            }while (n2 !=null);


        boolean jinwei =false;
        for (int i = linkedList.size()-1; i >= 0; i--) {
            if (jinwei){
                linkedList.set(i,linkedList.get(i)+1);
            }
            if (linkedList.get(i)>9){
                linkedList.set(i,linkedList.get(i)-10);
                jinwei = true;
            }else{
                jinwei =false;
            }
        }
        if (jinwei){
            linkedList.push(1);
        }


        ListNode resNode = new ListNode(linkedList.pollLast());
        ListNode node =resNode;
        while (!linkedList.isEmpty()){
            node.next = new ListNode(linkedList.pollLast());
            node = node.next;
        }
        return resNode;
    }
}

