 class Solution {
    public static double XXX(int[] nums1, int[] nums2) {
        double key=(nums1.length+nums2.length)/2.0;
        //是否是kong
        if (nums1.length==0){
            if (key%1==0) {
                return (nums2[(int)key]+nums2[(int)key-1])/2.0;
            }else{
                return nums2[(int)key];
            }
        }
        if (nums2.length==0){
            if (key%1==0) {
                return (nums1[(int)key]+nums1[(int)key-1])/2.0;
            }else{
                return nums1[(int)key];
            }
        }
        int[] connet;
        int s=0;
        int x=0;
        int y=0;
        if (nums1[nums1.length-1]<=nums2[0]){
             connet = connet(nums1, nums2);
             if (key%1==0) {
                 return (connet[(int)key]+connet[(int)key-1])/2.0;
             }else{
                return connet[(int)key];
             }
         } else if (nums2[nums2.length-1]<=nums1[0]){
             connet = connet(nums2, nums1);
             if (key%1==0) {
                 return (connet[(int)key]+connet[(int)key-1])/2.0;
             }else{
                 return connet[(int)key];
             }
        }else {
            int g=0;
            if (key%1==0){
                key=(int)key;
                key++;
                int s1=0;
                int s2=0;
                while (key--!=0){
                    if (nums1[x] > nums2[y]){ s=nums2[y];y++;if(y==(nums2.length)){ --y;++g;if (g>1){s=nums1[x];x++;}} }
                    else { s = nums1[x];x++; if(x==(nums1.length)){ --x;++g;if (g>1){s=nums2[y];y++;}} }
                    if (key==1) s1=s;
                    if (key==0) s2=s;
                }
                return (s1+s2)/2.0;
            }else{
                key=(int)key;
                key++;
                while (key--!=0){
                    if (nums1[x]>nums2[y]){s=nums2[y];y++;if (y==(nums2.length)){--y;++g;if (g>1){s=nums1[x];x++;}}}
                    else {s=nums1[x];x++;if(x==(nums1.length)){--x;++g;if (g>1){s=nums2[y];y++;}}}
                }
            }
         }
        return s;
    }

    public static int[] connet(int[] num,int[] num1){
        int[] ne_num=new int[num.length+num1.length];
        int k=0;
        for (int i:num) {
            ne_num[k]=i;k++;
        }
        for (int j:num1) {
            ne_num[k]=j;k++;
        }
        return ne_num;
    }
}

