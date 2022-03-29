class Solution {
    public void XXX(int[] nums) {
        
        // 在[0, nums.length]区间
        // 定义[0,i]区间为红色, i 初始为 -1, [0,-1] 为空区间
        // 定义[i + 1,j -1]区间为白色, j 初始为0, [0,-1] 为空区间
        // 定义[r,n - 1] 区间为蓝色, r 初始为 n, n = nums.length, [n,n-1] 为空区间
        // 定义[j,r) 区间为未排序元素
        int n = nums.length;
        int i = -1, j = 0, r = n;
        while(j < r) {
            if(nums[j] == 0)
                swap(nums, ++i, j++);   // 因为[i + 1, j - 1]区间内为白色, 是已经排好序的元素, 因此交换后 j++ 维护这个区间即可
            else if(nums[j] == 2)
                swap(nums, --r, j);     // 因为[j, r]区间是未排序的元素, 所以交换到 j位置上的元素还需要再次进行判断
            else
                j++;  // nums[j] == 1, 则 j++ 维护[i + 1,j -1]区间
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

