 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        HashSet<String> set = new HashSet();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int value = nums[i] + nums[j] + nums[k];
                if (value > 0) {
                    k--;
                } else if (value < 0) {
                    j++;
                } else {
                    String key = String.valueOf(nums[i]) + " " + String.valueOf(nums[j]) + " " + nums[k];
                    if (set.contains(key)) {
                        k--;
                        j++;
                        continue;
                    }
                    set.add(key);
                    ArrayList<Integer> data = new ArrayList();
                    data.add(nums[i]);
                    data.add(nums[j]);
                    data.add(nums[k]);
                    //Collections.sort(data);
                    list.add(data);
                    k--;
                    j++;
                }
            }
        }
        return list;
    }
}

