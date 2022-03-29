 class Solution {
    public int[][] XXX(int[][] intervals) {
        //Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] i1,int[] i2){
                return i1[0]-i2[0];
            }
        });
        List<int[]> list=new ArrayList<>();
        int i=0;
        while(i<intervals.length){
            int[] tep=new int[2];
            tep[0]=intervals[i][0];
            int max=intervals[i][1];
            while(i < intervals.length && intervals[i][0] <= max){
                max=Math.max(intervals[i][1],max);
                i++;
            }
            tep[1]=max;
            list.add(tep);
        }
        return list.toArray(new int[list.size()][2]);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


