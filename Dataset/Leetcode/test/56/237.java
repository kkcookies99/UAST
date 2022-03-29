 class Solution {
    public int[][] XXX(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        boolean[] flag = new boolean[intervals.length];
        for (int i = 0; i < intervals.length-1; i++) {
            if (flag[i] == true) continue;
            for (int j = i+1; j < intervals.length; j++) {
                //重复
                int[] arr1 = intervals[i];
                int[] arr2 = intervals[j];
                if (repeat(arr1,arr2)){
                    int[] arr = new int[]{Math.min(arr1[0],arr2[0]),Math.max(arr1[1],arr2[1])};
                    intervals[j] = arr;
                    flag[i] = true;
                    break;
                }
            }
            if (!flag[i]){
                res.add(intervals[i]);
            }
        }
        res.add(intervals[flag.length-1]);
         return res.toArray(new int[res.size()][]);
    }

    private boolean repeat(int[] arr1, int[] arr2) {
        if (arr1[1] < arr2[0] || arr2[1] < arr1[0]){
            return false;
        }
        return true;
    }
}

