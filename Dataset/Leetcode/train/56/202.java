 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int len=list.size()-1;
            if(list.get(len)[1]>=intervals[i][0]){
                list.get(len)[1]
                =Math.max(list.get(len)[1],intervals[i][1]);
            }
            else list.add(intervals[i]);
        }
        return list.toArray(new int[list.size()][]);
    }
}

