 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 先排序
        // 总目标是0，那么排序后，如果第1个数就>0了，那么只可能越加越大，所以第1个数必须<=0
        // n2、n3必然都=0或一正一负，让双指针分别指向n1后的head（n1的下一个）和tail（数组尾部）
        // sum=n1+n2+n3
        // sum<0时，说明总体偏小，head++
        // sum>0时，说明总体偏大，tail--
        // sum==0时，成功先记录，因为n2固定时对应的n3时唯一的，所以head++且tail--
        // 补充：为了不重复，3个数每次枚举时都要保证和上一次不一样

        Arrays.sort(nums);
        int target = 0;
        int len = nums.length;
        List<List<Integer>> results = new ArrayList<>();

        // 第1个数，下标从0开始，n1>0时结束
        for (int i=0; i<len-2; i++) {
            // 一旦n1>0说明后面都没有有效解了
            int n1 = nums[i];
            if (n1 > target) {
                break;
            }

            // 第1个数避免重复元素
            if (i > 0 && n1 == nums[i-1]) {
                continue;
            }

            // head、tail分别是n2、n3的下标
            int head = i + 1;
            int tail = len - 1;
            // 不能head>tail（n2、n3换位置了属于是），更不能head==tail（元素不能重复使用）
            while (head < tail) {
                // 第2个数避免重复元素
                int n2 = nums[head];
                if (head > i + 1 && n2 == nums[head-1]) {
                    head++;
                    continue;
                }
                // 第3个数避免重复元素
                int n3 = nums[tail];
                if (tail < len - 1 && n3 == nums[tail+1]) {
                    tail--;
                    continue;
                }
                
                int sum = n1 + n2 + n3;
                if (sum < target) {
                    head++;
                } else if (sum > target) {
                    tail--;
                } else {
                    List<Integer> result = new ArrayList<>();
                    result.add(n1);
                    result.add(n2);
                    result.add(n3);
                    results.add(result);

                    head++;
                    tail--;
                }
            }
        }

        return results;
    }
}

