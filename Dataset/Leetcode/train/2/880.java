  public ListNode XXX(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        Stack<Integer> s3;
        if (s1.size() < s2.size()) {
            s3 = s1;
            s1 = s2;
            s2 = s3;
        }
        List<Integer> list = new ArrayList<>();
        int distance = s1.size() - s2.size();
        while (!s1.empty()) {
            Integer a = s1.pop();
            Integer b;
            if (!s2.empty() && distance-- <= 0) {
                b = s2.pop();
            } else {
                b = 0;
            }
            int c = a + b;
            list.add(c);
        }
        // 把list转换为node
        Integer f = list.get(list.size() - 1);
        int add = f / 10;
        ListNode res = new ListNode(f % 10);
        ListNode result = res;
        for (int i = list.size() - 2; i >= 0; i--) {
            int r = list.get(i) + add;
            res.next = new ListNode(r % 10);
            add = r / 10;
            res = res.next;
        }
        if (add != 0) {
            res.next = new ListNode(add);
        }
        return result;
    }

