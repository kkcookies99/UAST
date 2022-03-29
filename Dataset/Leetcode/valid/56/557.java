 class Solution {
    public int[][] XXX(int[][] intervals) {
        int row = intervals.length;
        int column = intervals[0].length;
        Arrays.sort(intervals,(o1,o2)->(o1[0]-o2[0]));
        ArrayList<int[]> result =new ArrayList<>();
        int i=0;
        while(i<row){
            int left =intervals[i][0];
            int right =intervals[i][1];
            while(i<row-1 && intervals[i+1][0]<=right){
                right=Math.max(intervals[i+1][1],right);
                i++;
            }
            result.add(new int[]{left,right});
            i++;
        }
        int size=result.size()-1;
        int[][] res =result.toArray(new int[size][2]);
        return res;
    }
}

