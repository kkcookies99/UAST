  public double XXX(int[] nums1, int[] nums2) {

        int[] temp=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int t=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                temp[t++]=nums1[i++];
            }else{
                temp[t++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            temp[t++]=nums1[i++];
        }
        while(j<nums2.length){
            temp[t++]=nums2[j++];
        }
        double b=(temp[(temp.length-1)/2]+temp[temp.length/2])*1.0/2;
        return b;
    }

