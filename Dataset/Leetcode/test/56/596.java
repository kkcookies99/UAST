 class Solution {
    public int[][] XXX(int[][] intervals) {
        var ans = new LinkedList<int[]> ();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o2[1] - o1[1];
                else return o1[0] - o2[0];
            }
        });
        int left = -1;
        int right = -1;
        for (int[] cur: intervals) {
            if (cur[0] == left) continue;
            if (cur[0] > right) {
                ans.add(cur);
                left = cur[0];
                right = cur[1];
            } else if (cur[0] <= right && cur[1] > right){
                // 合并区间
                ans.getLast()[1] = cur[1];
                right = cur[1];
            } 
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


