  public double XXX(int[] nums1, int[] nums2) {
        Integer[] result=new Integer[nums1.length + nums2.length];
        for (int index=0,i=0,j=0;index<result.length;index++){
            if(i>=nums1.length){
                result[index]=nums2[j++];
            }  else if (j>=nums2.length){
                result[index]=nums1[i++];
            } else if (nums1[i]>nums2[j]){
                result[index]=nums2[j++];
            }else{
                result[index]=nums1[i++];
            }
        }
        if(result.length%2==0){
            return ((double)(result[result.length/2-1]+result[result.length/2]))/2;
        }
        return result[result.length/2];
    }

