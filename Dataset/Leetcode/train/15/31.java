 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if(nums.length < 3) {
            return new ArrayList<>();
        }
        //首先对数组排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = nums.length-1;
        int mid = left + (right-left)/2;
        boolean isBeforeSame = false;
        while (mid - 1 >= left && mid + 1 <= right) {
            if(nums[left] + nums[right] + nums[mid] == 0) {
                if(!isBeforeSame) {
                    List<Integer> data = new ArrayList<>();
                    data.add(nums[left]);
                    data.add(nums[mid]);
                    data.add(nums[right]);
                    result.add(data);
                }
                isBeforeSame = true;
                if (right-mid > mid-left) {
                    right--;
                }else {
                    left++;
                }
                continue;
            }else if (nums[left] + nums[right] + nums[mid] > 0) {
                isBeforeSame = false;
                if(mid - 1 > left) {
                    mid--;
                    continue;
                }
            }else {
                isBeforeSame = false;
                if(mid + 1 < right) {
                    mid++;
                    continue;
                }
            }
            if (mid + 1 == right && mid - 1 > left) {
                left++;
                continue;
            }
            if(mid - 1 == left && mid + 1 < right) {
                right--;
                continue;
            }
            if(mid - 1 == left && mid + 1 == right) {
                break;
            }
        }
        return result;
    }
}

