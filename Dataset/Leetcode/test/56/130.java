 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[0]-o2[0]);
        for (int[] interval : intervals) {
            int L = interval[0], R = interval[1];
            if (ans.size()==0 || ans.get(ans.size()-1)[1]< L)
                ans.add(new int[]{L,R});
            else
                ans.get(ans.size()-1)[1] = Math.max( ans.get(ans.size()-1)[1] ,R);
        }
        return ans.toArray(new int[0][0]);
    }
}

