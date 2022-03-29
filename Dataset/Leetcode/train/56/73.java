class Solution {
    public int[][] XXX(int[][] intervals) {
    	int len = intervals.length;
    	if(len == 1) return intervals;
    	Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    	List<int[]> res = new ArrayList<>();
    	res.add(new int[2]);
	res.get(0)[0] = intervals[0][0];
	int temp = intervals[0][1];		//存储区间右边界
	int p = 0;
    	for(int i = 1; i < len; i++) {
    		if(intervals[i][0] > temp) {
    			res.get(p)[1] = temp;
    			res.add(new int[2]);
    			res.get(++p)[0] = intervals[i][0];
    		}else if(intervals[i][1] <= temp) continue;
    		temp = intervals[i][1];
    	}
    	res.get(p)[1] = temp;
    	int[][] ans = res.toArray(new int[0][0]);
    	return ans;
    }
}

