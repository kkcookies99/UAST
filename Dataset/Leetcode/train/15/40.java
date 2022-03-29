 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int flag1 = -1;
        labela: while (++flag1<=nums.length-3) {
            int flag2=flag1+1;
            int flag3=nums.length - 1;
            while (flag2 < flag3) {
                if (nums[flag1] + nums[flag2] + nums[flag3] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[flag1]);
                    list.add(nums[flag2]);
                    list.add(nums[flag3]);
                    String key =String.valueOf(nums[flag1])+String.valueOf(nums[flag2])+String.valueOf(nums[flag3]);
                    if(!mapStr.containsKey(key)){
                        result.add(list);
                        mapStr.put(key,"");
                    }

                    continue labela;
                }

                if (nums[flag1] + nums[flag2] + nums[flag3] > 0) {
                    flag3--;
                }

                if (nums[flag1] + nums[flag2] + nums[flag3] < 0) {
                    flag2++;
                }
            }

        }
        return result;
    }
    private static Map<String,String> mapStr =new HashMap<>();
}

