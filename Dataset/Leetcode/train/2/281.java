 public ListNode XXX(ListNode l1, ListNode l2) {
        String s1 = getIntStringByListNode(l1);
        String s2 = getIntStringByListNode(l2);
        
        int[] maxArr, minArr;
        if (s1.length() > s2.length()) {
            maxArr = getIntArrayByString(s1);
            minArr = getIntArrayByString(s2);
        } else {
            maxArr = getIntArrayByString(s2);
            minArr = getIntArrayByString(s1);
        }
        StringBuilder sb = new StringBuilder();
        boolean isCarryBit = false;
        for (int i = 0; i < maxArr.length; i++) {
            int t = isCarryBit ? 1 : 0;
            isCarryBit = false;
            if (i >= minArr.length) {
                t += maxArr[i];
            } else {
                t += (maxArr[i] + minArr[i]);
            }
            if (t >= 10) {
                sb.append(t - 10);
                isCarryBit = true;
                continue;
            }
            sb.append(t);
        }
        if (isCarryBit) {
            sb.append(1);
        }
        return createListNode(sb.toString());
    }

    private String getIntStringByListNode(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.val);
        if (node.next != null) {
            sb.append(getIntStringByListNode(node.next));
        }
        return sb.toString();
    }

    private ListNode createListNode(String source) {
        int n = Integer.parseInt(source.substring(0, 1));
        ListNode node = new ListNode(n);
        if (source.length() > 1) {
            node.next = createListNode(source.substring(1));
        }
        return node;
    }

    private int[] getIntArrayByString(String source) {
        int[] arr = new int[source.length()];
        for (int i = 0; i < source.length(); i++) {
            arr[i] = source.charAt(i) - '0';
        }
        return arr;
    }

