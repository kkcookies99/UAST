 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
             if (nums1.length==0 && nums2.length ==1){
                return nums2[0];
            }

            if (nums1.length==1 && nums2.length ==0){
                return nums1[0];
            }

            int m=(nums2.length-1)/2;

            if(nums1.length ==0 && nums2.length>1){
                if (nums2.length%2 == 0){
                    return (double) (nums2[m]+nums2[m+1])/2;
                }
                return nums2[m];
            }

                m=(nums1.length-1)/2;
            if(nums2.length ==0 && nums1.length>1){
                 if (nums1.length%2 == 0){
                    return (double) (nums1[m]+nums1[m+1])/2;
            }
                 return nums1[m];
        }




            int s1Length=nums1.length;
            int s2Length=nums2.length;
            int newLength=s1Length+s2Length;
            int[] num=new int[newLength];

            int index1=0;
            int index2=0;
            int index=0;

            while (index1 < s1Length || index2 <s2Length){

                if (index1 >= s1Length){
                    while (index2 <s2Length){
                    num[index++]=nums2[index2++];
                    }
                    break;
                }

                if (index2 >= s2Length){
                    while (index1 < s1Length) {
                        num[index++] = nums1[index1++];
                    }
                    break;
                }

                if (nums1[index1] <= nums2[index2]){
                        num[index++]=nums1[index1++];
                }else if (nums1[index1] > nums2[index2]){
                    num[index++]=nums2[index2++];
                }


            }

        int middle=(newLength-1)/2;
            if (newLength%2 == 0){
                double nums=(double) (num[middle]+num[middle+1])/2;
                return nums;
            }

            return num[middle];
        
    }   
}

