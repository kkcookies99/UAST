 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length == 1) return intervals;
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++){
            int left = intervals[i - 1][0], right = intervals[i - 1][1];
            while(i < intervals.length && left <= intervals[i][0] && right >= intervals[i][1]){
                i++;
            }
            while(i < intervals.length && right >= intervals[i][0]){
                right = Math.max(intervals[i][1], right);
                i++;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(left);
            temp.add(right);
            list.add(temp);
            if(i == intervals.length - 1){
                List<Integer> last = new ArrayList<>();
                last.add(intervals[intervals.length - 1][0]);
                last.add(intervals[intervals.length - 1][1]);
                list.add(last);
            }
        }
        int[][] res = new int[list.size()][2];
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            res[index][0] = list.get(i).get(0);
            res[index][1] = list.get(i).get(1);
            index++;
        }
        return res;
    }
}

