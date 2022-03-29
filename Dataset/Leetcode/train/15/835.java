 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i=0; i<n; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int j = i+1;
            int k = n-1;
            while (j<k) {
                int XXX = nums[j]+nums[k];
                if (XXX==target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    do j++;
                    while (j < k && nums[j] == nums[j - 1]);
                } else if (XXX<target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


