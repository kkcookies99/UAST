 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if(nums==null)
            return new ArrayList<List<Integer>>(); 
     List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<Integer>();
        doIt(nums, list,arr,0);
        return list;
    }

    private static void doIt(int[] nums, List<List<Integer>> list,List<Integer>arr,int i) {
        if (i == nums.length) {
            List<Integer> brr = new ArrayList<Integer>();
            brr.addAll(arr);
            list.add(arr);
            return;
        }
        List<Integer> crr = new ArrayList<Integer>();
        crr.addAll(arr);
        crr.add(nums[i]);
        doIt(nums, list, arr, i + 1);
        doIt(nums, list, crr, i + 1);
    }
}

