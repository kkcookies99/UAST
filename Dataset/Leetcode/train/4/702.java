  public double XXX(int[] nums1, int[] nums2) {
       if(nums1.length == 0 && nums2.length == 0){
            return 0;
        }
        int[] arr = new int[nums1.length+nums2.length];
        //如果nums1为空，则让合并的数组直接等于nums2 直接根据数组长度奇偶数 返回数组中位数
        if(nums1.length == 0){
            arr = nums2;
            if(arr.length % 2 == 1){
               return (double)arr[arr.length/2];
            }else{
                return ((double)arr[arr.length/2 - 1] + (double)arr[arr.length/2])/2;
            }
        }
         //如果nums2为空，则让合并的数组直接等于nums1 直接根据数组长度奇偶数 返回数组中位数
        if(nums2.length == 0){
            arr = nums1;
             if(arr.length % 2 == 1){
                 return (double)arr[arr.length/2];
            }else{
                return ((double)arr[arr.length/2 - 1] + (double)arr[arr.length/2])/2;
            }
        }

        //需要记录三个数组的指针，指向三个数组遍历的下标
        int nums1Index=0;
        int nums2Index=0;
        int arrIndex=0;
        double result = 0;
        //遍历数组 合并数组 直到其中一个数组遍历完成  退出循环
        while(nums1Index < nums1.length && nums2Index < nums2.length){
            if(nums1[nums1Index] < nums2[nums2Index]){
                arr[arrIndex] = nums1[nums1Index];
                nums1Index++;
            }else{
                arr[arrIndex] = nums2[nums2Index];
                nums2Index++;
            }
            arrIndex++;
        }
     
        //退出循环，将没有遍历完成的数组进行接下来的合并 没有完成遍历的数组任意元素都比合并数组组的任意元素大 且有序，所以直接按照顺序加在合并数组后面
        if(nums1Index < nums1.length){
            while(nums1Index <= nums1.length-1 ){
                arr[arrIndex] = nums1[nums1Index];
                arrIndex++;
                nums1Index++;
            }
        }
        if(nums2Index < nums2.length){
            while(nums2Index <= nums2.length-1){
                arr[arrIndex] = nums2[nums2Index];
                arrIndex++;
                nums2Index++;
            }
        }
        
        if(arr.length % 2 == 1){
            result = (double)arr[arr.length/2];
        }else{
            result = ((double)arr[arr.length/2 - 1] + (double)arr[arr.length/2])/2;
        }
        return result;
    }

