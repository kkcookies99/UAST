 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> answer = new LinkedList<>();
        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length - 2)
        {
            int low = index + 1, high = nums.length - 1;
            while (low < high)
            {
                if (nums[index] > 0 || nums[high] < 0)  break;//提前退出
                int sum = nums[index] + nums[low] + nums[high];
                if (sum > 0)
                {
                    high--;
                }
                else
                {
                    if (sum == 0)
                    {
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[index]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        answer.add(list);
                        int temp = nums[low];
                        while (nums[low] == temp && low < high)  low++;//去重
                        temp = nums[high];
                        while (nums[high] == temp && low < high)  high--;//去重
                    }
                    else
                    {
                        low++;
                    }
                }//固定第一个数，内层两个数采用首尾双指针法
            }
            int temp = nums[index];
            while (nums[index] == temp && index < nums.length - 2)  index++;//跳过重复的结果
        }
        
        return answer;
    }
}

