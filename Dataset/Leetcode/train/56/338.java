    public int[][] XXX(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<int[]> l=new ArrayList<>();
        int start=intervals[0][0],end=intervals[0][1];
        for(int k=1;k<n;k++){
            if(intervals[k][0]>end) {   //当前区间落在之前区间的外面
                l.add(new int[]{start,end});
                start=intervals[k][0];
                end=intervals[k][1];
            }
            else if(intervals[k][0]<=end&&intervals[k][1]>end){ //当前区间可以扩充前面区间的end
                end=intervals[k][1];
            }
        }
        l.add(new int[]{start,end});  //最后一个大区间要加进来
        int[][] ans=new int[l.size()][2];
        int r=0;
        for (int[] interval : l) {
            ans[r][0]=interval[0];
            ans[r++][1]=interval[1];
        }
        return ans;
    }

