class Solution {
    public int[][] XXX(int[][] intervals) {

        // 怎么合并区间呢？
        // 两个区间：
        // 如果一个边界的左区间大于另一个边界的右区间，则不重合，不合并
        // 否则可以合并，左边界选小的，右边界选大的

        // 暴力：O(n^2)

        // 试试优先队列
        // 根据左侧元素大小排序
        PriorityQueue<int[]> priQ = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        for (int[] interval : intervals) {
            priQ.add(interval);
        }
        
        List<int[]> list = new ArrayList<>();
        int[] tmps = priQ.poll();
        while (priQ.size() > 0) { // 每次推出一个元素与tmps合并，合并不了就将其加入结果集。然后tmps换刚推出的元素继续
            int[] nums = priQ.poll();
            if (nums[0] > tmps[1]) { // 后面元素的最小值大于当前元素的最大值，无法合并
                list.add(tmps);
                tmps = nums;
            } else { // 可以合并
                tmps[0] = Math.min(nums[0], tmps[0]);
                tmps[1] = Math.max(nums[1], tmps[1]);
            }
        }
        list.add(tmps); // 加上最后一个元素
        
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}```

