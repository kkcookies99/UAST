class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 子集这道题 除了递归，还可以用位运算的方式来解决
        // 0为取，1为不取，枚举所有集合，比如1,2,3,4这四种就有16中方式，对应0000~1111一共有16种解法
        int n = nums.length;
        int maxNum = 1<<n;// 1~2^n-1
        List<List<Integer>> res = new ArrayList<>();
        // 枚举每种取值
        for(int i = 0;i<maxNum;i++) {
            // 如果取，那二进制位就为1
            List<Integer> list = new ArrayList<>();
            int a = i;
            for(int j = n-1;j>=0;j--) {
                int b = a&1;
                if(b==1) list.add(nums[j]);
                a>>=1;
            }
            res.add(list);

        }
        return res;

    }
}

