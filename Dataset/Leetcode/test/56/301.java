 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        int[] first=new int[intervals.length];
        int[] second=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            first[i]=intervals[i][0];
            second[i]=intervals[i][1];
        }
        Arrays.sort(first);
        Arrays.sort(second);
        int start=0;
        for(int i=0;i<intervals.length-1;i++){
            if(first[i+1]<=second[i]);
            else{
                list.add(new int[]{first[start],second[i]});
                start=i+1;
            }
        }
         list.add(new int[]{first[start],second[intervals.length-1]});
         return list.toArray(new int[list.size()][]);
    }
}

