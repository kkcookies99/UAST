class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < list.size(); i++){
                for(int j = i + 1; j < list.size();){
                    if(check(list.get(i), list.get(j)) || check(list.get(j), list.get(i))){
                        list.get(i)[0] = Math.min(list.get(i)[0], list.get(j)[0]);
                        list.get(i)[1] = Math.max(list.get(i)[1], list.get(j)[1]);
                        flag = true;
                        list.remove(j);
                    }else{
                        j++;
                    }
                }
            }
        }
        int [][] res = new int[list.size()][2];
        res = list.toArray(res);
        return res;
    }

    private boolean check(int[] nums1, int[] nums2){
        return nums1[1] >= nums2[0] && nums1[1] <= nums2[1] || nums1[0] >= nums2[0] && nums1[0] <= nums2[1];
    }
}

