 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        
        List<List<Integer>> nlist = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {

                if (nums[j] + nums[k] < -nums[i]) {
                    j++;

                } else if (nums[j] + nums[k] > -nums[i]) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    nlist.add(list);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }

        }

        return nlist;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

