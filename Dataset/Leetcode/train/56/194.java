  public int[][] XXX(int[][] intervals) {
        // 先按照区间起始位置排序
        Arrays.sort(intervals,(v1,v2)->v1[0] - v2[0]);
        // 遍历区间
        int[][] res = new int[intervals.length][2];
        int[][] cur = new int[1][2];
        int k = 0;
        if(intervals.length >= 1){
            cur[0][0] = intervals[0][0];
            cur[0][1] = intervals[0][1];
        }
        for(int i = 0; i < intervals.length; i++){

            if(cur[0][1] < intervals[i][0]){
                res[k][0] = cur[0][0];
                res[k][1] = cur[0][1];
                k++;
                cur[0][0] = intervals[i][0];
                cur[0][1] = intervals[i][1];
            }else{
                if(cur[0][1] <= intervals[i][1]){
                    cur[0][1] = intervals[i][1];
                }
            }
            if(i == intervals.length - 1) {
                res[k][0] = cur[0][0];
                res[k][1] = cur[0][1];
            }
        }

        return Arrays.copyOf(res,k + 1);
    }

