public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        ArrayList<int[]> sorted = new ArrayList<int[]>();
        sorted.add(intervals[0]);
        for(int i=1; i<intervals.length;i++){
            int[] array = sorted.get(sorted.size()-1);
            if(intervals[i][0] <= array[1] && intervals[i][1]>array[1]){
                // 第i个元素的左边界小于等于array的右边界并且要第i个元素的右边界大于array的右边界
                // 实际上就是判断两个区域相交的条件（*）
                array[1] = intervals[i][1];
            }else if(intervals[i][0] > array[1]){
                // 第i个元素的左边界大于ArrayList的右边界
                sorted.add(intervals[i]);
            }
        }
        return sorted.toArray(new int[sorted.size()][]);
    }

