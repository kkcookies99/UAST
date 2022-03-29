public int[][] XXX(int[][] intervals) {
        if (Objects.isNull(intervals) || intervals.length ==0) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        Deque<int[]> queue = new LinkedList<>();
        //第一个区间入队
        queue.add(intervals[0]);
        for (int index = 1; index < intervals.length; index++) {
            int left = intervals[index][0];
            int right = intervals[index][1];
            //说明前面区间的右边界包含当前区间的左边界，可以合并
            if (queue.peekLast()[1] >= left) {
                //取交叉区间的较大的右边界
                right = Math.max(right, queue.peekLast()[1]);
                int[] last = queue.getLast();
                last[1] = right;
                //用的新的区级替换
                queue.removeLast();
                queue.addLast(last);
            } else {
                queue.addLast(intervals[index]);
            }
        }

        return queue.toArray(new int[queue.size()][]);
    }

