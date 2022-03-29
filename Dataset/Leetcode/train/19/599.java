  public ListNode XXX(ListNode head, int n) {
        //预防头节点特殊处理，随加入一个节点
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode slow = res;
        ListNode fast = res;

        while (fast != null) {
            if(n>=0){
                n--;
            }else {
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return res.next;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


