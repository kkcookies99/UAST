 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> (o1[0] == o2[0]) ? o1[1] - o2[1]: o1[0] - o2[0]);
        List<int[]> ans = new ArrayList();
        boolean[] used = new boolean[intervals.length];
        int i = 0;
        while(i < intervals.length){
                int left = intervals[i][0];
                int right = intervals[i][1];
                int j = i + 1;
                while(j < intervals.length && intervals[j][0] <= right){
                    right = Math.max(right, intervals[j][1]);
                    j++;
                }
                int[] temp = {left, right};
                ans.add(temp);
                i = j;
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}

