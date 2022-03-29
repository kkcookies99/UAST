 class Solution {
    public int[][] XXX(int[][] intervals) {
        int n = intervals.length;
        if(n<2){
            return intervals;
        }
       Arrays.sort(intervals,(int []o1,int[] o2)->{
          return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];  
       });
       List<int[]> list=new ArrayList<>();
       int start = intervals[0][0];
       int end = intervals[0][1];
       for(int i =1;i<n;i++){
           if(end<intervals[i][0]){
             list.add(new int[]{start,end});
             start = intervals[i][0];
             end = intervals[i][1];
           }else{
               if(intervals[i][1]>end){
                  end = intervals[i][1];
               }
           }
              if(i==n-1){
                   list.add(new int[]{start,end});
               }
       }
    int [] [] returnArray = new int [list.size()][2];
    for(int i = 0;i<list.size();i++){
        returnArray[i] = list.get(i);
    }
    return returnArray;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


