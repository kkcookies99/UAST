 class Solution {
    public int[][] XXX(int[][] intervals) {
        int len=intervals.length;
        LinkedList<int[]> list=new LinkedList<>();
        //base case
        if(len==0 || len==1){
            return intervals;
        }
        
        //排序
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }
                else{
                    return a[0]-b[0];
                }
            }
        });

        // for(int i=0;i<len;i++){
        //     System.out.println(Arrays.toString(intervals[i]));
        // }

        list.addLast(new int[]{intervals[0][0],intervals[0][1]});
        for(int i=1;i<len;i++){
            if(intervals[i][0]<=list.peekLast()[1]){
                int[] tmp=list.pollLast();
                list.addLast(new int[]{tmp[0],Math.max(tmp[1],intervals[i][1])});
            }
            else{
                list.addLast(new int[]{intervals[i][0],intervals[i][1]});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

