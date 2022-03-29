 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            if(o1[0]>o2[0]) return 1;
            if(o1[0]==o2[0]) return 0;
            return -1;
        });
        List<int[]> intermediateResult = new ArrayList<>();
        int i = 0;
        while(i < intervals.length){
            int j = i;
            int max = intervals[i][1];
            while(j<intervals.length && max>=intervals[j][0]) {
                max = Math.max(max,intervals[j][1]);
                ++j;
            }
            int[] a = new int[]{intervals[i][0],max};
            intermediateResult.add(a);
            i = j;
        }
        return intermediateResult.toArray(new int[intermediateResult.size()][]);
    }
}

