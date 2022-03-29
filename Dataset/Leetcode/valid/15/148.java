 class Solution {

    // method: brute force O(N^3), SORT + TOW POINTER(O(N^2))
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            // skip duplicate triples with the same first number
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while ( left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if ( sum == 0 ){
                    List<Integer> triple  = new ArrayList<>();
                    triple.add(nums[i]);
                    triple.add(nums[left]);
                    triple.add(nums[right]);
                    result.add(triple);
                    // skip duplicate pairs with the same left number
                    while(left < --right && nums[right] == nums[right+1]);
                    // skip duplicate pairs with the same right number
                    while(++left < right && nums[left] == nums[left-1]);
                }else if ( sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
