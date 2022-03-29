 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        if((nums1.length + nums2.length) % 2 == 0){
            return (findKthElement(nums1,nums2,0,nums1.length-1,0,nums2.length-1,(nums1.length + nums2.length)/2) + findKthElement(nums1,nums2,0,nums1.length-1,0,nums2.length-1,(nums1.length + nums2.length)/2+1)) / 2.0;
        }else{
            return findKthElement(nums1,nums2,0,nums1.length-1,0,nums2.length-1,(nums1.length + nums2.length)/2+1);
        }
    }

    public int findKthElement(int[] nums1, int[] nums2 ,int l1,int r1,int l2,int r2,int k){
        // System.out.println(k);
         if(l1 > r1){
            return nums2[l2+k-1];
        }else if(l2 > r2){
            return nums1[l1+k-1];
        }

        if(k == 1){
            return nums1[l1] < nums2[l2] ? nums1[l1] : nums2[l2];
        }

        int tmp = k / 2;
        //比较第 tmp 个元素

        int k1 = l1 + tmp -1 > r1 ? r1 :  l1 + tmp -1;
        int k2 = l2 + tmp -1 > r2 ? r2 :  l2 + tmp -1;     

        //抹除前面tmp个元素
        if(nums1[k1] < nums2[k2]){
            tmp = k1 - l1 + 1 ;
            l1 = k1 + 1;
        }else{
            tmp = k2 - l2 + 1 ;
            l2 = k2 + 1;
        }

        // 记录下接下里要算第几个元素

        return findKthElement(nums1,nums2,l1,r1,l2,r2,k - tmp);
    }
}

