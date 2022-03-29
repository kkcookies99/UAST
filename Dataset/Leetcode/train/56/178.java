 public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int left=intervals[0][0];
        int right=intervals[0][1];
        List<int[]> res = new ArrayList<int[]>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=right){
                right=Math.max(right,intervals[i][1]);
            }else{
                res.add(new int[]{left,right});
                left=intervals[i][0];
                right=intervals[i][1];
            }
        }
        res.add(new int[]{left,right});
        return res.toArray(new int[res.size()][]);
    }

