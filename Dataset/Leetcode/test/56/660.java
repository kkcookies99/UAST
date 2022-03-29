 class Solution {
    public int[][] XXX(int[][] intervals) {
        //思路是按照左边界来进行排序
        //然后开始遍历，逐个的往后走，O(n)
        // int[][] intevals = {{1,3},{2,6},{8,10},{15,18},{4,5}};
        //按照左边界进行排序
        if(intervals.length==0){
            return new int[0][0];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });
        List<int[]> res = new LinkedList<>();
        int l= intervals[0][0], r=intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            //判断二者有交集，左小于等于右，或右大于等于左
            if(intervals[i][0]>=l&&intervals[i][0]<=r || intervals[i][1]>=l&&intervals[i][1]<=r){
                //更新边界
                l = Math.min(l,intervals[i][0]);
                r = Math.max(r,intervals[i][1]);
            }
            //若无交集，则将目前的结果直接放进res中，并更新l与r
            else{
                res.add(new int[]{l,r});
                l = intervals[i][0];
                r = intervals[i][1];
            }
        }
        res.add(new int[]{l,r});
        return res.toArray(new int[res.size()][2]);
        // int[][] ans = new int[res.size()][2];
        // for(int i=0; i<res.size(); i++){
        //     ans[i][0] = res.get(i)[0];
        //     ans[i][1] = res.get(i)[1];
        // }
        // return ans;
        // return res.toArray();
        // System.out.println(Arrays.deepToString((res.toArray())));


    }
}

