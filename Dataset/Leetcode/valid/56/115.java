 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        LinkedList<int[]> stk = new LinkedList<int[]>();
        stk.push(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] a = stk.peek();
            if(a[1] < intervals[i][0]){
                stk.push(intervals[i]);
            }else if(a[1] >= intervals[i][0] && a[1] < intervals[i][1]){
                stk.peek()[1] = intervals[i][1];
            }
        }
        return stk.toArray(new int[stk.size()][2]);
    }
}

