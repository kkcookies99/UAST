     public ListNode XXX(ListNode head) {
                ListNode node = head;
        while (node != null){
            if (node.next != null){
                if (node.val == node.next.val){
                    node.next = node.next.next;
                }else {
                    node = node.next;
                }
            }else {
                node = node.next;
            }
        }
        return head;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


