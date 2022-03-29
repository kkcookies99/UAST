 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length==0){
            return new int[0][0];
        }
        // sort(intervals);
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        int re = 1;
        int i,j;
        int big=intervals[0][1];
        for(i=1;i<intervals.length;i++){
            if(intervals[i][0]>big){
                re++;
                big=intervals[i][1];
            } else {
                big = Math.max(intervals[i][1],big);
            }
        }
        int[][] ans = new int[re][2];
        ans[0] = new int[2];
        ans[0][0]=intervals[0][0];
        ans[0][1]=intervals[0][1];
        j=0;
        for(i=1;i<intervals.length;i++){
            if(intervals[i][0]>ans[j][1]){
                int[] temp = new int[2];
                temp[0]=intervals[i][0];
                temp[1]=intervals[i][1];
                ans[j+1] = temp;
                j++;
                continue;
            } else if(intervals[i][0]>=ans[j][0]&&intervals[i][1]>ans[j][1]){
                ans[j][1]=intervals[i][1];
            }
        }
        return ans;
    }

}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


