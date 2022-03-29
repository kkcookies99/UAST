 class Solution {
    public int[][] XXX(int[][] intervals) {
        int len=intervals.length;
        if(len==1)
            return intervals;
        List<int[]> res=new LinkedList();
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0])
                return a[0]-b[0];
            else
                return a[1]-b[1];
        });
        int p1=0;
        int p2=0;
        int max=intervals[p1][1];
        int min=intervals[p1][0];
        int count=0;
        while(p2!=len)
        {
            if(intervals[p2][0]<=max){
                max=Math.max(max,intervals[p2][1]);
                min=intervals[p1][0];
            }
            else{
                count++;
                res.add(new int[]{min,max});
                p1=p2;
                max=intervals[p1][1];
                min=intervals[p1][0];
            }
            p2++;
        }
        count++;
        res.add(new int[]{min,max});
        return res.toArray(new int[count][]);
    }
}

