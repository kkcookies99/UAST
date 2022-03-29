 public ListNode XXX(ListNode l1, ListNode l2) {

        if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null) {
            return new ListNode();
        }

        //链表定义为左右链表
        ListNode left = l1;
        ListNode right = l2;

        int sum;
        int add = 0;
        //每个链表个数最大100，创建一个长度101的数组（防止第100位相加发生进位）
        int[] nums = new int[101];
        for (int i = 0; i < 101; i++) {

            sum = 0;

            //左链表不为空相加、左链表指向其下一位
            if (left != null) {
                sum += left.val;
                left = left.next;
            }
            //右链表不为空相加、右链表指向其下一位
            if (right != null) {
                sum += right.val;
                right = right.next;
            }

            //前一位运算是否发生进位
            if (add > 0) {
                sum += add;
            }

            nums[i] = sum % 10;
            add = sum / 10;

            //左右链表为空时并且前一位无发生进位跳出循环
            if (left == null && right == null && add == 0) {
                nums = Arrays.copyOf(nums, i + 1);
                break;
            }

        }

        int length = nums.length;
        ListNode node = new ListNode(nums[0]);
        if (length == 1) {
            return node;
        }

        //递归创建返回值
        ListNode next;
        ListNode pre = node;
        for (int i = 1; i < length; i++) {

            next = new ListNode(nums[i]);
            pre.next = next;
            pre = next;
        }

        return node;
    }

