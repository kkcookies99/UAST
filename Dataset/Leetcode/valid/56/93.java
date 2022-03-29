class Solution {
    public int[][] XXX(int[][] intervals) {
         if(intervals==null || intervals.length<=1){
            return intervals;
        }
        List<int[]> list=new ArrayList();
      
        sort(intervals,0,intervals.length-1);
        int i=0;
        int n=intervals.length;
        while(i<n){
            int l=intervals[i][0];
            int r=intervals[i][1];
            while(i<n-1&& r>=intervals[i+1][0]){
                r=Math.max(r,intervals[i+1][1]);
                i++;
            }
            list.add(new int[]{l,r});
            i++;
        }
        return list.toArray(new int[list.size()][2]);

    }

     public void swap(int[][] intervals,int i,int j){
        int temp=intervals[i][0];
        int temp1=intervals[i][1];
        intervals[i][0]=intervals[j][0];
        intervals[i][1]=intervals[j][1];
        intervals[j][0]=temp;
        intervals[j][1]=temp1;
    }

    public void sort(int[][] intervals,int start,int end){
        int i=start;
        int j=end;
        if(i>j){
            return;
        }
        int temp=intervals[i][0];
        while(i<j){
            while(i<j&&intervals[j][0]>=temp){
                j--;
            }
            while(i<j&&intervals[i][0]<=temp){
                i++;
            }
            swap(intervals,i,j);
        }
        swap(intervals,start,i);
        sort(intervals,start,j-1);
        sort(intervals,j+1,end);
    }
}

