 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();

        if (nums.length < 3) {
            return lists;
        } else if (nums.length == 3) {
            if ((nums[0] + nums[1] + nums[2]) == 0) {
                list.add(nums[0]);
                list.add(nums[1]);
                list.add(nums[2]);
                lists.add(list);
                return lists;
            } else {
                return lists;
            }
        }

        Arrays.sort(nums);
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;

        while (n1 < nums.length-3){
            while (n2 < nums.length - 1){
                for (int j = n3; j < nums.length; j++) {
                    if((nums[n1] + nums[n2] + nums[j]) == 0){
                        List<Integer> list2 = new ArrayList<>();
                        list2.add(nums[n1]);
                        list2.add(nums[n2]);
                        list2.add(nums[j]);
                        lists.add(list2);
                    }
                }
                n2++;
                n3++;
            }
            n1++;
            n2 = n1+1;
            n3 = n1+2;
        }
        //利用 set 集合去重复
        Set<List<Integer>> set = new HashSet<>();
        set.addAll(lists);
        //再转化为 list 集合
        List <List<Integer>> list3 = new ArrayList<List<Integer>>(set);
        return list3;
    }
}

