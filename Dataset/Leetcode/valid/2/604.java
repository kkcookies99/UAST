 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        int tmp = 0;
        while(l1 != null && l2 != null){
            if(l1.val+l2.val+tmp < 10){
                ListNode ret = new ListNode(l1.val+l2.val+tmp);
                cur.next = ret;
                cur = cur.next;
                tmp = 0;
            }else{
                ListNode ret = new ListNode((l1.val+l2.val+tmp)%10);
                cur.next = ret;
                cur = cur.next;
                tmp = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null){
            cur.next = l1;
            ListNode prev = null;
            while(l1 != null){
                if(l1.next == null){
                    prev = l1;
                }
                if(l1.val+tmp > 9){
                l1.val = (l1.val+tmp)%10;
                tmp = 1;
                l1 = l1.next;
                }else{
                    l1.val = l1.val+tmp;
                    tmp = 0;
                    break;
                }
            }
            if(tmp == 1){
                ListNode n = new ListNode(tmp);
                prev.next = n;
                tmp = 0;
            }
        }
        if(l2 != null){
            cur.next = l2;
            ListNode prev = null;
            while(l2 != null){
                if(l2.next == null){
                    prev = l2;
                }
                if(l2.val+tmp > 9){
                    l2.val = (l2.val+tmp)%10;
                    tmp = 1;
                    l2 = l2.next;
                }else{
                    l2.val = l2.val+tmp;
                    tmp = 0;
                    break;
                }
            }
            if(tmp == 1){
                ListNode n = new ListNode(tmp);
                prev.next = n;
                tmp = 0;
            }
        }
        if(tmp == 1){
            ListNode n = new ListNode(tmp);
            cur.next = n;
        }
        return node.next;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


