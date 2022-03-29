 class Solution {
        public List<List<Integer>> XXX(int[] nums) {
            List<List<Integer>> result  = new ArrayList<>();
            //1.特判
            if (nums.length < 3 || nums == null){
                return result;
            }
            //2.排序
            Arrays.sort(nums);

            //3.遍历一个数，对剩余两个采用双指针法
            for (int i = 0; i < nums.length -2; i++) {
                //3.1特判,第一个数字
                if (nums[0] > 0 ){
                    return result;
                }
                //3.2第一个数字出现重复后，继续
                if(i > 0 && nums[i] == nums[i-1]) continue;

                //定义双指针
                int target = -nums[i];
                int left = i + 1;
                int right = nums.length -1;
                //3.3双指针法
                while (left < right){
                    //1满足条件，保存解,指针进位。
                    if ((nums[left] + nums[right]) == target){
                        ArrayList<Integer> list = new ArrayList<>(3);
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        //2去重
                        while (left < right && nums[left] == nums[left +1]){
                            left++;
                        }
                        while (left < right && nums[right] == nums[right -1]){
                            right--;
                        }
                        //3去重后，指针正常移位
                        left++;
                        right--;
                    //4不满足解，指针进位
                    }else if ((nums[left] + nums[right]) > target){
                        right--; //不满足，移动左右指针
                    }else {
                        left++;
                    }
                }
            }
         return result;
        }
    }

