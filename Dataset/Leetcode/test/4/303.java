     public double XXX(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int targetNumsLength = nums1Length + nums2Length;
        int[] targetNums = null;
        double targetValue = 0.0;
        // 遍历nums1和nums2的index
        int nums1Index = 0;
        int nums2Index = 0;
        // int maxLength = Math.max(nums1Length, nums1Length);
        
        // 计算index的值
        int numberToCount = 1;
        int targetIndex = -1;
        if(targetNumsLength%2 == 0){
            numberToCount = 2;
            targetIndex = targetNumsLength/2 - 1;
            // 排序到中位数取值的位置即可
            targetNums = new int[targetIndex+2];
        } else {
            numberToCount = 1;
            targetIndex = ( targetNumsLength + 1 ) / 2 - 1;
            // 排序到中位数取值的位置即可
            targetNums = new int[targetIndex+1];
        }
        
        //进行排序

        // 特殊情况处理，如果nums1 或者 nums2为空
        if(nums1Length == 0){
            targetNums = nums2;
        } else if(nums2Length ==0){
            targetNums = nums1;
        } else {
            for(int i=0; i<targetNums.length; i++){
                //如果nums1已经全都加到数组里了
                if(nums1Index >= nums1Length){
                    if(nums2Index >= nums2Length){
                        break;
                    }
                    targetNums[i] = nums2[nums2Index];
                    nums2Index++;
                    continue;
                }
                //如果nums1已经全都加到数组里了
                if(nums2Index >= nums2Length){
                    targetNums[i] = nums1[nums1Index];
                    nums1Index++;
                    continue;
                }
                // 比较两个值，把小的那个放到targetNums里
                if(nums1[nums1Index] <= nums2[nums2Index]){
                    targetNums[i] = nums1[nums1Index];
                    nums1Index++;
                } else {
                    targetNums[i] = nums2[nums2Index];
                    nums2Index++;
                }

                // 优化，排序到中间值时就返回
                if(numberToCount == 1){
                    if(i == targetIndex){
                        // targetValue = targetNums[i];
                        break;
                    }
                } else if(numberToCount == 2){
                    if(i == targetIndex + 1){
                        // targetValue = ((double)targetNums[i] + (double)targetNums[i-1])/2.0;
                        break;
                    }
                }
            }

        }
        // 最后计算值。
        if(numberToCount == 1){
            targetValue = targetNums[targetIndex];
        } else if(numberToCount == 2){
            targetValue = ((double)targetNums[targetIndex] + (double)targetNums[targetIndex+1])/2.0;
        }
        return targetValue;
    }

