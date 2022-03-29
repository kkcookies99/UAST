     public int[][] XXX(int[][] intervals) {
        // 贪心
        int n = intervals.length;
        if(n == 0) {
            return null;
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        List<int[]> rec = new ArrayList<>();
        // 排序
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0]) {
                    return -1;
                } else if(o1[0] > o2[0]){
                    return 1;
                } else {
                    // 子区间可以通过最右边界过滤
                    return o2[1] - o1[1];
                }
            }
        });
        // 最右边界
        int r = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int[] tmp = intervals[i];
            if(intervals[i][1] <= r) {
                continue;
            }
            for(int j=i+1; j<n; j++) {
                if(intervals[j][0] > tmp[1]) {
                    break;
                } else if(intervals[j][0] <= tmp[1] && intervals[j][1] > tmp[1]) {
                    tmp[1] = intervals[j][1];
                }
            }
            rec.add(tmp);
            if(r < tmp[1]) {
                r = tmp[1];
            }
        }
        int[][] res = new int[rec.size()][2];
        for(int i=0; i<rec.size(); i++) {
            res[i] = rec.get(i);
        }
        return res;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


