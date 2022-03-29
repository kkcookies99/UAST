 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        /**
        *已知a+b+c=0
        *不妨设:a<=b<=c,
        * 所以有a<=0;c>=0;a+2b<=0
        *
        */
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        
        //c<=0;c>=0
        if (nums.length==0||nums[0] > 0 || nums[nums.length - 1] <0) {
            return res;
        }

        Map<Integer, Integer> map = new HashMap<>();

        //数值和该值对应的最大的下标
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            //a<=0
            if (nums[i] > 0) {
                break;
            }
            //排除重复项
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {

                //排除重复项
                if (j>i+1&&nums[j] == nums[j - 1]) {
                    continue;
                }
                //a+2b<=0
                if (nums[i] + 2 * nums[j] > 0) {
                    break;
                }
                
                int c = -1 * (nums[i] + nums[j]);

                Integer cIndex = map.get(c);

                //c存在且不为b,即不能重复取b
                if (cIndex != null && cIndex > j) {
                    res.add(Arrays.asList(nums[i], nums[j], c));
                }
            }
        }
        return res;
    }
}

