 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];//两个数组合并后的有序数组
        int nums1Index = 0;
        int nums2Index = 0;
        int numsIndex = 0;
        if(nums1.length == 0 && nums2.length != 0){
            nums = nums2;
        }else if(nums1.length != 0 && nums2.length == 0){
            nums = nums1;
        }else{//如果两个数组都不为空
            do{
                if(nums1Index == nums1.length){//第一个数组查找完毕
                    for(int i = nums2Index; i < nums2.length; i++){
                        nums[numsIndex] = nums2[i];
                        numsIndex++;
                    }
                    break;
                }else if(nums2Index == nums2.length){//第二个数组查找完毕
                    for(int i = nums1Index; i < nums1.length; i++){
                        nums[numsIndex] = nums1[i];
                        numsIndex++;
                    }
                    break;
                }else{//比较两个数组数据元素大小，依次加到合并数组
                    if(nums1[nums1Index] <= nums2[nums2Index]){
                        nums[numsIndex] = nums1[nums1Index];
                        nums1Index++;
                    }else{
                        nums[numsIndex] = nums2[nums2Index];
                        nums2Index++;
                    }
                    numsIndex++;
                }
            }while(numsIndex != nums.length);
        }

        if(nums.length % 2 == 0){//偶数个元素
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }else{//奇数个元素
           return nums[nums.length / 2];
        }
    }
}

