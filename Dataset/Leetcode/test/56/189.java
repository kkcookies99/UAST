 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a1,int[] a2){
                return a1[0]-a2[0];
            }
        });
        int begin=intervals[0][0],end=intervals[0][1];
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                end=Math.max(end,intervals[i][1]);
            }else{
                list.add(new int[]{begin,end});
                begin=intervals[i][0];
                end=intervals[i][1];
            }
        }
        list.add(new int[]{begin,end});
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);
        return res;
    }
}

