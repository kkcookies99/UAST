 class Solution {
    public int[][] XXX(int[][] intervals) {
        //先将给定的区间按左边界进行排序
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            //return a1[0]-a2[0] 表示按区间的左边界进行升序排序
            public int compare(int[] a1, int[] a2){
                return a1[0] - a2[0];
            }
        });
        int i =0;
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        while(i<n){
            //left表示第i个区间的左边界
            int left = intervals[i][0];
            //right表示第i个区间的右边界
            int right = intervals[i][1];
            //i<n-1是为了防止数组越界（即最后只需要比较倒数第二个区间和最后一个区间）
            //比较当前区间的右边界是否不小于下个区间的左边界，若true则表示有区间重合可以合并，将右边界扩展为下一个区间的右边界，同时i+1表示向右继续遍历其他区间
            while(i < n-1 && right >= intervals[i+1][0]){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            //当while结束则表示 下个区间不能和当前区间合并，于是将当前区间加入list中。同时i+1表示继续向右遍历其他区间
            list.add(new int[] {left,right});
            i++;

        }
        //最后返回list结果
        return list.toArray(new int[list.size()][2]);

    }
}

