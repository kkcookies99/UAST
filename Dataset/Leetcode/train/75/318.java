class Solution {
    public void XXX(int[] nums) {
        fastSort(nums, 0, nums.length-1);
    }
    void fastSort(int[] nums, int start, int end){
        if(start > end) return;
        int n = nums[start];
        int left = start, right = end;
        while(left != right){
            while(left != right){
                if(nums[right] < n){
                    nums[left] = nums[right];
                    break;
                }
                right--;
            }
            if(left == right) break;
            while(left != right){
                if(nums[left] > n){
                    nums[right] = nums[left];
                    break;
                }
                left++;
            }
        }
        nums[left] = n;
        fastSort(nums, start, left-1);
        fastSort(nums, right+1, end);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


