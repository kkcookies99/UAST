class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        while (l1 != null) {
            nums1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            nums2.add(l2.val);
            l2 = l2.next;
        }
        nums1.add(0);
        nums2.add(0);
        int i = 0;
        int j = 0;
        boolean isNums1 = (nums1.size() >= nums2.size());
        while (i < nums1.size() - 1 && j < nums2.size() - 1) {
            int a = (nums1.get(i) + nums2.get(j)) % 10;
            int b = (nums1.get(i) + nums2.get(j)) / 10;
            if (isNums1) {
                nums1.set(i, a);
                nums1.set(i + 1, nums1.get(i + 1) + b);
            } else {
                nums2.set(i, a);
                nums2.set(i + 1, nums2.get(i + 1) + b);
            }
            i++;
            j++;
        }
        if (isNums1) {
            while (i < nums1.size() - 1) {
                int a = nums1.get(i) % 10;
                int b = nums1.get(i) / 10;
                nums1.set(i, a);
                nums1.set(i + 1, nums1.get(i + 1) + b);
                i++;
            }
        } else {
            while (j < nums2.size() - 1) {
                int a = nums2.get(j) % 10;
                int b = nums2.get(j) / 10;
                nums2.set(j, a);
                nums2.set(j + 1, nums2.get(j + 1) + b);
                j++;
            }
        }
        ListNode dumb = new ListNode();
        ListNode head = dumb;
        for (int k = 0; k < Math.max(nums1.size(), nums2.size()); k++) {
            if (isNums1) {
                if (k == Math.max(nums1.size(), nums2.size()) - 1 && nums1.get(k) == 0) {
                    continue;
                } else {
                    dumb.next = new ListNode(nums1.get(k));
                    dumb = dumb.next;
                }
            } else {
                if (k == Math.max(nums1.size(), nums2.size()) - 1 && nums2.get(k) == 0) {
                    continue;
                } else {
                    dumb.next = new ListNode(nums2.get(k));
                    dumb = dumb.next;
                }
            }
        }
        return head.next;
    }
}

