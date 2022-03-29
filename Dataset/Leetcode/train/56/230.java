 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,(o1,o2)->(o1[0]!=o2[0]?o1[0]-o2[0]:o1[1]-o2[1]));
        int left=intervals[0][0],right=intervals[0][1];
        int index=0;
        List<int[]> list=new ArrayList<>();
        while(index<intervals.length){
            while(index<intervals.length && intervals[index][0]<=right){
                right=Math.max(right,intervals[index][1]);
                index++;
            }
            list.add(new int[]{left,right});
            if(index<intervals.length){
                left=intervals[index][0];
                right=intervals[index][1];
            }
        }
        index=0;
        int[][] ans=new int[list.size()][];
        Iterator<int[]> it=list.iterator();
        while(it.hasNext()){
            ans[index++]=it.next();
        }
        return ans;
    }
}

