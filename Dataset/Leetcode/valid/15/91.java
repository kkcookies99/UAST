 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        /**
         1.对数组排序
         2.遍历数组,定义i变量和左右指针（R、L）
         3.当 nums[i] > 0,退出循环（因为 nums[R] >= nums[L] >= nums[i] ）
         4.如果数值相同,则跳过该次循环（过滤重复数据）
         5.循环(移动指针,匹配符合数据)
         6.如果nums[R] + nums[L] + nums[i] = 0,添加到结果集中
         7.移动指针L++,R--
         8.判断指针指向的数据是否有重复数据，有则移动该指针到不重复的数据
         9.否则，nums[R] + nums[L] + nums[i] > 0 ,R--
         10.否则，L++
         11.遍历完数据，则返回结果集。
         */
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int L = i + 1;
            int R = n - 1;

            while (L < R) {
                int sum = nums[R] + nums[L] + nums[i];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));

                    L++;
                    R--;

                    while (L < R && nums[L] == nums[L - 1]) L++;
                    while (L < R && nums[R] == nums[R + 1]) R--;
                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return list;


    }
}

