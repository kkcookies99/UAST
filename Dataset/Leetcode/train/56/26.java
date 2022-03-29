class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(o1,o2)->(o1[0]-o2[0]));
        int min=  intervals[0][0];
        int max = intervals[0][1];
        for(int i = 1;i<=intervals.length-1;i++){
            // 包含
            if(intervals[i][0]>=min && intervals[i][0]<=max){
                // 合并，即取最小的左边，最大的右边
                // 左边已经排好序，不可能小过min
                max = intervals[i][1]>max?intervals[i][1]:max;
            }else{
                // 如果不包含了，则需要把前面的区间加进结果中，并重置min,max
                int[] temp = new int[2];
                temp[0] = min;
                temp[1] = max;
                list.add(temp);
                min = intervals[i][0];
                max = intervals[i][1];
            }
            if(i==intervals.length-1){
                // 最后把最后一个区间也加进去即可。
                int[] temp = new int[2];
                temp[0] = min;
                temp[1] = max;
                list.add(temp);
            }
        }
        
        int[][] result = new int[list.size()][2];
        for(int i = 0;i<=list.size()-1;i++){
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }
}

