 class Solution {
    public int[][] XXX(int[][] intervals) {
        // 返回特殊情况
        if (intervals.length == 0){
            return new int[0][0];
        }
        // 以数组的第一个元素重新排序
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        // 初始化
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        
        // 只要当前区间的start大于上一个区间的end 就把上一个区间添加进结果
        for (int i = 1; i < intervals.length; i++){
            int newstart = intervals[i][0];
            if (newstart > end){
                res.add(new int[]{start, end});
                start = newstart;
            }
            // 如果当前区间的start小于上一个区间的end 就比谁end大
            end = Math.max(end, intervals[i][1]);
        }
        // 最后一个区间需要手动添加
        res.add(new int[]{start, end});

        // list转数组
        int[][] resArray = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++){
            resArray[i][0] = res.get(i)[0];
            resArray[i][1] = res.get(i)[1];
        }

        return resArray;
    }
}

