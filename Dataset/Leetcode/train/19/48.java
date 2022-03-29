 class Solution {
    public static ListNode XXX(ListNode head, int n) {

        LinkedList<ListNode> listNodes = new LinkedList<>();
        ListNode temp = head;
        while (temp.next != null)
        {
            listNodes.add(temp);
            temp = temp.next;
        }
        listNodes.add(temp);

        if (listNodes.size() == 1 && n == 1)
        {
            return null;
        }

        for (int i = listNodes.size() - 1; i >= 0 ; i--) {
            if(n == 1)
            {
                listNodes.get(i).next = null;
               if(i-1 >= 0)
               {
                   listNodes.get(i - 1).next = null;
               }
               if(i + 1 < listNodes.size() && i-1 >= 0 )
               {
                   listNodes.get(i - 1).next = listNodes.get(i + 1);
               }
                listNodes.remove(i);
               break;
            }
            n--;
        }

        return listNodes.get(0);
    }
}

