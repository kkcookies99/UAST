 class Solution {
    public int[][] XXX(int[][] intervals) {
        //关键在于区间排序
        //快排 
        if(intervals.length <= 1) return intervals;
        intervals = partition(intervals, 0, intervals.length - 1);
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{intervals[0][0], intervals[0][1]});

        for(int i = 1; i < intervals.length; i++){
            if(list.get(list.size() - 1)[1] >= intervals[i][0]) {
              if(list.get(list.size() - 1)[1] < intervals[i][1]) list.get(list.size() - 1)[1] = intervals[i][1];  
            }
            else list.add(new int[]{intervals[i][0], intervals[i][1]});
        }

        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i ++){
            res[i] = list.get(i);
        }
        return res;

    }
    public int[][] partition(int[][] intervals, int low, int high){
        if(low >= high) return intervals;
        int temp = intervals[low][0];
        int[] dummy = intervals[low];
        int i = low;
        int j = high;
        while(i < j){
            while(i < j && intervals[j][0] >= temp) j--;
            while(i < j && intervals[i][0] <= temp) i ++;
            if(i < j){
                int[] ref = intervals[i];
                intervals[i] = intervals[j];
                intervals[j] = ref;
            } 
        }
        intervals[low] = intervals[i];
        intervals[i] = dummy;
        partition(intervals, low, i - 1);
        partition(intervals, i + 1, high);
        return intervals;
    }
}

