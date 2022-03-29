 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        int slow=0;
        List<int[]> list=new ArrayList<int[]>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(list.get(slow)[1]>=intervals[i][0]){
                if(list.get(slow)[1]<intervals[i][1]){
                    list.get(slow)[1]=intervals[i][1];
                }
            }else{
                list.add(intervals[i]);
                slow++;
            }
        }
        int[][] result=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}

