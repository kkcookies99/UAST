class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        boolean isup = false;
        ListNode res = new ListNode();
        ListNode retu = res;
        while(l1!=null || l2 != null){
            if(l1 != null &&l2 !=null){
                int num = l1.val + l2.val + (isup?1:0);
                if(num>=10){
                    isup = true;
                    num -= 10;
                }else {
                    isup = false;
                }
                res.val = num;
                l1 = l1.next;
                l2 = l2.next;
                if(l1!=null || l2 != null){
                    res.next = new ListNode();
                    res = res.next;
                }
            }else if(l1!=null){
                int num = l1.val + (isup?1:0);
                if(num>=10){
                    isup = true;
                    num -= 10;
                }else {
                    isup = false;
                }
                res.val = num;
                l1 = l1.next;
                if(l1!=null){
                    res.next = new ListNode();
                    res = res.next;
                }
            }else if(l2!=null){
                int num = l2.val + (isup?1:0);
                if(num>=10){
                    isup = true;
                    num -= 10;
                }else {
                    isup = false;
                }
                res.val = num;
                l2 = l2.next;
                if(l2!=null){
                    res.next = new ListNode();
                    res = res.next;
                }
            }
        }
        if(isup){
            res.next = new ListNode();
            res = res.next;
            res.val = 1;
        }
        return retu;
    }
}

