public int XXX(int x) {
        LinkedList<Integer> queue = new LinkedList<>();
        int cur = x;
        while (cur != 0) {
            int num = cur - cur / 10 * 10;
            queue.add(num);
            cur = cur / 10;
        }
        //处理 0 的情况
        if (queue.isEmpty())
            return 0;
        //将所有后缀 0 去掉
        while (queue.peekFirst() == 0)
            queue.removeFirst();
        int res = queue.removeFirst();
        while (!queue.isEmpty()) {
            int curNum = queue.removeFirst();
            //判断是否溢出，本来应该判断 res * 10 + curNum > Integer.MAX_VALUE,但是res是int型，不可以直接乘以10，因此将不等式中的 res 单独提到左侧，就可以避免int溢出
            if (x > 0 && res > (Integer.MAX_VALUE - curNum) / 10) {
                return 0;
            } else if (x < 0 && res < (Integer.MIN_VALUE - curNum) / 10) {
                return 0;
            }
            res = res * 10 + curNum;
        }
        return res;
    }

