 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length==0) return new int[0][0];
        List<int[]> ans = new ArrayList<>();
        int[] cur;
        sort(intervals,0,intervals.length-1);
        cur=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=cur[1]){
                if(intervals[i][1]>cur[1]) cur[1]=intervals[i][1];
                else continue;
            }else{
                ans.add(cur);
                cur=intervals[i];
            }
        }
        ans.add(cur);
        
        return ans.toArray(new int[ans.size()][]);
    }
    public void sort(int[][] intervals,int l,int r){
        if(l>=r) return;
        int p=partition(intervals,l,r);
        sort(intervals,l,p-1);
        sort(intervals,p+1,r);
    }
    public int partition(int[][] intervals,int l,int r){
        int[] temp = intervals[l];
        while(l<r){
            while(l<r){
                if(intervals[r][0]<temp[0]){
                    intervals[l]=intervals[r];
                    break;
                }
                r--;
            }
            while(l<r){
                if(intervals[l][0]>temp[0]){
                    intervals[r]=intervals[l];
                    break;
                }
                l++;
            }
        }
        intervals[l]=temp;
        return l;
    }
}

