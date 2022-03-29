     public int[][] XXX(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals,Comparator.comparingInt((int[] a)->a[0]));
        int[] pre=intervals[0];
        res.add(pre);
        for (int i = 1; i < intervals.length; i++) {
            if(pre[1]>=intervals[i][0]){
                pre[1]=Math.max(pre[1],intervals[i][1]);
            }else {
                pre=intervals[i];
                res.add(pre);
            }
        }
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i]=res.get(i);
        }
        return ans;
    }


