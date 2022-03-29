 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int L=intervals[i][0];
            int R=intervals[i][1];
            while(i+1<intervals.length&&R>=intervals[i+1][0]) R = Math.max(R,intervals[i+++1][1]);
            if(i<intervals.length) list.add(new int[]{L,R});
        }
        return list.toArray(new int[list.size()][]);
    }
}

