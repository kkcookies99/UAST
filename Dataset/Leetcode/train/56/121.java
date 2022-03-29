  public int[][] XXX(int[][] intervals) {
        int n = intervals.length;
        if (n<=1){
            return intervals;
        }
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                //存在重叠
                boolean conflict = (intervals[i][1]>intervals[j][1]&&intervals[i][0]>intervals[j][1])||
                (intervals[i][1]<intervals[j][0]&&intervals[i][0]<intervals[j][0]);
                if(!conflict){
                    intervals[j][0] = Math.min(intervals[i][0],intervals[j][0]);
                    intervals[j][1] = Math.max(intervals[i][1],intervals[j][1]);
                    break;
                }
                if (j==n-1){
                    //最后一个还没有重叠，加入
                    res.add(intervals[i]);
                }
            }
        }
        res.add(intervals[intervals.length-1]);
        return res.toArray(new int[res.size()][2]);
    }

