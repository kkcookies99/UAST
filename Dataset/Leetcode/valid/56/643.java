 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        // 把数组按照第一列排序
        Arrays.sort(intervals,(o1, o2) -> o1[0]-o2[0]);
        List<int []> list = new ArrayList();
        // 初始化左右边界
        int left = intervals[0][0]; int right = intervals[0][1];
        for(int i = 0;i<intervals.length-1;i++){
            // 如果右边界比下一个数组的左边界大说明两个数组交叉了
            if(right>=intervals[i+1][0]){
                // 取又边界为这两个数组的最大的右边界
                right = Math.max(right,intervals[i+1][1]);
                // 边界条件把最后一组加入数组
                if(i==intervals.length-2) list.add(new int[]{left,right});
                continue;
            }else{
                // 如果右边界比下一个数组的左边界小说明两个数组没有交叉
                // 这个时候list集合添加一个数组边界为left right
                list.add(new int[]{left,right});
                // 添加完成后继续初始化下一个数组的左右边界
                left = intervals[i+1][0];
                right = intervals[i+1][1];
                // 边界条件把最后一组加入数组
                if(i==intervals.length-2) list.add(new int[]{left,right});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

