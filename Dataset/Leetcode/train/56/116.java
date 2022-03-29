 class Solution {
    public int[][] XXX(int[][] intervals) {
        int max = intervals[0][1],min = intervals[0][0];
        for(int i = 0; i < intervals.length - 1; i++){
            if (intervals[i][0] < min)
                min = intervals[i][0];
            if (intervals[i][1] > max)
                max = intervals[i][1];
        }

        for (int i = 0; i < intervals.length; i++){
            
            for (int j = 0; j < intervals.length; j++){
                // if (intervals[i][0] <= intervals[j][0] ){
                    if ((intervals[i][1] >= intervals[j][0] && intervals[i][0] <= intervals[j][0]) || (intervals[j][1] >= intervals[i][0] && intervals[i][1] >= intervals[j][1]) || (intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1])){
                        // intervals[i][1] = intervals[j][1];
                        // intervals[j][0] = intervals[i][0];
                        intervals[i][1]=intervals[i][1]>intervals[j][1]?intervals[i][1]:intervals[j][1];
                        intervals[j][1]=intervals[i][1];
                        intervals[j][0]=intervals[j][0]>intervals[i][0]?intervals[i][0]:intervals[j][0];
                        intervals[i][0]=intervals[j][0];
                        

                    }
                // }
            }
            

        }
        int p = 0;
        boolean k = false;
        ArrayList<int[]> list = new ArrayList();
        for (int i = 0; i < intervals.length; i++){

                boolean m = true;
      
                for (int[] x : list){
                    
                    if (Arrays.equals(x, intervals[i])){
                         m = false;
                    }
                }

                if ( m ){
                    list.add(intervals[i]);
                    p++;
                }





        }
        int [][]a = new int[p][2];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }

        return a;


    }


}

