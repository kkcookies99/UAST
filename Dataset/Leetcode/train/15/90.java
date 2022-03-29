 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int opposite = -nums[i];
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1, right = len - 1;
                while (left < right) {
                    int XXX = nums[left] + nums[right];
                    if (XXX == opposite) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[left]);
                        ans.add(nums[right]);
                        res.add(ans);
                        left = moveLeft(nums, left, right);
                        right = moveRight(nums, left, right);
                    } else if (XXX < opposite) {
                        left = moveLeft(nums, left, right);
                    } else {
                        right = moveRight(nums, left, right);
                    }
                }                
            }
        }
        return res;
    }
    
    private int moveLeft(int[] nums, int left, int right) {
        int num = nums[left++];
        while (left <= right) {
            if (nums[left] != num)
                break;
            left++;
        }
        return left;
    }
    
    private int moveRight(int[] nums, int left, int right) {
        int num = nums[right--];
        while (left <= right) {
            if (nums[right] != num)
                break;
            right--;
        }
        return right;
    }    
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

