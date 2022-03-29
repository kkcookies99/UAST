 class Solution {
        public ListNode XXX(ListNode head, int n) {
            ArrayList<ListNode> arraylist=new ArrayList<>();
ListNode node=head;
            while(node!=null){
                arraylist.add(node);
                node=node.next;
            }
            int index=arraylist.size()-n;//
            if(index==0){
                head=head.next;
            }else{
                int frontindex=arraylist.size()-n-1;//前一个节点
                arraylist.get(frontindex).next=arraylist.get(frontindex).next.next;
            }
            return head;

        }
    }

