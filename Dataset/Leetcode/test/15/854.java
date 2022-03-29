 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            //如果第一个数就大于零，肯定不存在
            if (nums[i]>0){
                return res;
            }
            if (i-1>=0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int temp=nums[i]+nums[left]+nums[right];
                //如果满足条件就添加
                if (temp==0){
                     List<Integer> list=new ArrayList<>();
                     list.add(nums[i]);
                     list.add(nums[left]);
                     list.add(nums[right]);
                     res.add(list);
                     //添加完了之后降重
                    //先搜索左指针
                    while (left<right){
                        if (left+1<right && nums[left]==nums[left+1]){
                            left++;
                        }else {
                            break;
                        }
                    }
                    //再搜索右指针
                    while (left<right){
                        if (right-1>left && nums[right]==nums[right-1]){
                            right--;
                        }else {
                            break;
                        }
                    }
                    left++;
                }else if (temp>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }
}

