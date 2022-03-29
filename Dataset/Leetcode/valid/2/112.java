class Solution {
    List<Integer> nums1 = new ArrayList<>(), nums2 = new ArrayList<>();
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode p = l1;
        while ( p != null ) {
            nums1.add(p.val);
            p = p.next;
        }
        p = l2;
        while ( p != null ) {
            nums2.add(p.val);
            p = p.next;
        }

        // 补上前导0
        int gap = nums1.size()-nums2.size();
        if ( gap > 0 ) {
            for ( int i = 0; i < gap; i++ ) {
                nums2.add(0);
            }          
        } else {
            for ( int i = 0; i < -gap; i++ ) {
                nums1.add(0);
            }
        }

        // 模拟加法
        boolean carry = false;
        ListNode dummy = new ListNode(-1), pre = dummy;
        for ( int j = 0; j < nums1.size(); j++ ) {
            int sum = nums1.get(j) + nums2.get(j);
            if ( carry ) {
                sum += 1;
                carry = false;
            }
            if ( sum >= 10 ) {
                carry = true;
                ListNode curr = new ListNode(sum-10);
                pre.next = curr;
                pre = curr;            
            } else {
                ListNode curr = new ListNode(sum);
                pre.next = curr;
                pre = curr;
            }
        }
        // 处理最后一位的进位
        if ( carry ) {
            ListNode curr = new ListNode(1);
            pre.next = curr;
        }
        return dummy.next;

    }
}

