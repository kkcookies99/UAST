 public int[][] XXX(int[][] intervals) {
        //首先按照start对区间进行排序
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]>res=new ArrayList<>();
        //然后不断合并区间
        int start=intervals[0][0],end=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<=end){
                 end=Math.max(end,intervals[i][1]); //这里要稍微注意一下取两者较大的那个值
            }else {
                int[]interval=new int[]{start,end};
                res.add(interval);
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);    
    }

