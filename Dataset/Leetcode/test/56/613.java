 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->(x[0]-y[0]));
        List<int[]>res=new ArrayList<>();
        int l=0;
        while(l<intervals.length){
            int upper=intervals[l][1];
            int r=l+1;
            while(r<intervals.length&&upper>=intervals[r][0]){
                upper=Math.max(upper,intervals[r][1]);
                r++;
            }
            res.add(new int[]{intervals[l][0],upper});
            l=r;
        }
        int[][] result=new int[res.size()][];
        for(int i=0;i<res.size();++i){result[i]=res.get(i);}
        return result;
    }
}

