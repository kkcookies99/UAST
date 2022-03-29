 class Solution {
    public int[][] XXX(int[][] intervals) {
        
        Arrays.sort(intervals,(o1,o2)->(o1[0]-o2[0]));
        
        List<int[]> res=new ArrayList<>();
        int left=intervals[0][0];
        int right=intervals[0][1];
        for(int[] i:intervals){
            if(i[0]<=right){
                right=Math.max(right,i[1]);
            }else{
                res.add(new int[]{left,right});
                left=i[0];
                right=i[1];   
            }
        }
        res.add(new int[]{left,right});

        return res.toArray(new int[res.size()][]);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


