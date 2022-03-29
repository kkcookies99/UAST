 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        while (l1.next != null)
            a1.add(l1.val);
            l1 = l1.next;
        while (l2.next != null)
            a2.add(l1.val);
            l2 = l2.next;
        String str1 = new String();
        String str2 = new String();
        int n = a1.size();
        int m = a2.size();
        for (int i = 0; i < n; i++) {
            str1.concat(String.valueOf(a1.get(n--)));
        }
        for (int j = 0; j < m; j++) {
            str2.concat(String.valueOf(a2.get(m--)));
        }
        Integer i = Integer.valueOf(str1, 10);
        Integer j = Integer.valueOf(str2, 10);
        int res = i + j;
        while (res > 0) {
            i = res % 10;
            l3.val = i;
            l3 = l3.next;
            res = res / 10;
        }
        return l3；
    }
}

