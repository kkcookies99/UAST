 class Solution {
    public int[][] XXX(int[][] intervals) {
        //按照第一个元素升序排列
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[0] - o2[0];
            }
        });

        ArrayList<int[]> ans = new ArrayList<>();//创建一个动态数组
        ans.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] cur = intervals[i];//当前数组
            int[] last = ans.get(ans.size() - 1);//找到动态数组中的最后一个数组
            if(cur[0] <= last[1]){
                last[1] = Math.max(cur[1] , last[1]);
            }else{
                ans.add(cur);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


