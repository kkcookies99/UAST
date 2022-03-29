class Solution {
    public int[][] XXX(int[][] intervals) {
        
        List<Integer>list = new ArrayList<>();
        if(intervals.length==0){return new int[0][0];}
        if(intervals.length==1){return intervals;}
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int left = intervals[0][0];
        int right = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(right>=intervals[i][0]){
                right = Math.max(right,intervals[i][1]);
            }else{
                list.add(left);
                list.add(right);
                //list.
                left = intervals[i][0];
                right = intervals[i][1];
            }
            
            
        }
        list.add(left);
        list.add(right);
        int[][] ans = new int[list.size()/2][2];
        for(int i = 0; i < list.size()/2; i++){
                ans[i][0] = list.get(i*2);
                ans[i][1] = list.get(i*2+1);
            }
            return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


