 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (null == intervals || 0 == intervals.length) return new int[0][0];

        // 对intervals按自定义字典序升序排序
        Arrays.sort(intervals, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b){
			    if(a[0]==b[0]){
				    return a[1] - b[1];
                    //return b[1] - a[1];
			    }else {
				    return a[0] - b[0];
                    //return b[0] - a[0];
                    // 注释部分为自定义字典序降序排序
			    }
		    }
	    });
        /*for (int[] x : intervals) {
            System.out.print("[" + x[0] + ", " + x[1] + "] ");
        }
        System.out.println(" ");*/

        List<int[]> lli = new LinkedList<int[]>();
        int n = intervals.length;
        boolean last = false;
        for (int i = 0; i < n - 1; ++i) {
            if (intervals[i][1] < intervals[i + 1][0]) {
                lli.add(intervals[i]);
            }
            else {
                int[] un = new int[]{intervals[i][0], intervals[i][1]};
                while (i < n - 1 && un[1] >= intervals[i + 1][0]) {
                    un = union(un, intervals[++i]);
                }
                lli.add(un);
                if (i == n - 1) last = true;
            }
        }
        if (!last) lli.add(intervals[n - 1]);

        int[][] ans = new int[lli.size()][2];
        for (int i = 0; i < lli.size(); ++i) {
            ans[i][0] = lli.get(i)[0];
            ans[i][1] = lli.get(i)[1];
        }
        return ans;
    }
    private int[] union(int[] x, int[] y) {
        return new int[]{Math.min(x[0], y[0]), Math.max(x[1], y[1])};
    }
}

