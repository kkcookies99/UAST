    public int[][] XXX(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for (int i = 1;i<intervals.length;i++){
            if (intervals[i-1][1]>=intervals[i][0]){
                if (intervals[i-1][1]>=intervals[i][1]){
                    intervals[i][0] = intervals[i-1][0];
                    intervals[i][1] = intervals[i-1][1];
                }else {
                    intervals[i][0] = intervals[i-1][0];
                }
            }else{
                list.add(intervals[i-1]);
            }
        }
        list.add(intervals[intervals.length-1]);
        int[][] arr = new int[list.size()][];
        for (int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;

    }

