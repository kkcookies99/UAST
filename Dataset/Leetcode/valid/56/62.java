class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals == null || intervals.length <= 1) return intervals;
        List<int[]> tar = new ArrayList<>();
        int[] temp;
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        for(int i = 0; i<intervals.length;i++){
            temp = new int[2];
            temp[0] = intervals[i][0];
            temp[1] = intervals[i][1];
            while(i < intervals.length-1 && temp[1] >= intervals[i+1][0]){
                temp[1] = Math.max(temp[1], intervals[i+1][1]);
                i++;
            }
            tar.add(temp);
        }
        return tar.toArray(new int[tar.size()][2]);
    }
}

