 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        boolean flag = false;
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] == -1) continue;
            for(int j = 0; j < intervals.length; j++){
                 if(intervals[j][0] == -1) continue;
                 if(j == i) continue;
                 int start = intervals[i][0];
                 int end = intervals[i][1];
                 if(!(end < intervals[j][0] || start > intervals[j][1])){
                   intervals[i][0] = Math.min(start, intervals[j][0]);
                   intervals[i][1] = Math.max(end, intervals[j][1]); 
                   intervals[j][0] = -1; 
                   flag = true;
                 } 
            } 
                if(flag){
                     if(i > 0) i--;
                     flag = false;
                 }  
        }
        for(int[] i: intervals){
            if(i[0] != -1){
               res.add(i);
            }
        }
        return res.toArray(new int[0][]);
    }
}

