class Solution {
    public int[][] XXX(int[][] intervals) {
        int n = intervals.length;
        //如果左边都相等 那么右边降序
        //如果左边不相等 那么左边升序
        Arrays.sort(intervals, (o1, o2) -> (o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]));

        int left=intervals[0][0];
        int right=intervals[0][1];
        List<int[]> list=new LinkedList<>();
        
        for(int i=1;i<n;i++){
            int[] curr=intervals[i];
            if(left<=curr[0]&&right>=curr[0]){
                right=Math.max(right,curr[1]);
            }else if(right<curr[0]){
                list.add(new int[]{left,right});
                left=curr[0];
                right=curr[1];
            }
        }

        list.add(new int[]{left,right});
        int size = list.size();
        int[][] res = new int[size][2];
        for (int i = 0; i < size; i ++){
            res[i] = list.get(i);     
        }
        return res;

    }
}

