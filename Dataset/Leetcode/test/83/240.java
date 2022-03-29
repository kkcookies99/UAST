   public ListNode XXX(ListNode head) {
 //题目数据保证链表已经按升序排列
        ListNode dummyNode = head;
        while (dummyNode!=null && dummyNode.next!=null){
            if(dummyNode.next.val == dummyNode.val){
                dummyNode.next = dummyNode.next.next;
                continue;
            }else {
                dummyNode = dummyNode.next;
            }
        }
        return head;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


