 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int[] res=new int[n1+n2];
        int l1=0,l2=0;
        for(int i=0;i<n1+n2;i++){
            if(l1<n1&&l2<n2){
                res[i]=nums1[l1]<=nums2[l2]?nums1[l1++]:nums2[l2++];
            }else if(l1==n1&&l2<n2){
                res[i]=nums2[l2++];
            }else if(l1<n1&&l2==n2){
                res[i]=nums1[l1++];
            }
            //res[i]=nums1[l1]<=nums2[l2]?nums1[l1++]:nums2[l2++];
        }
        int reslen=n1+n2;
        if(reslen%2==0){
            double r=(res[reslen/2]+(double)res[reslen/2-1])/2;
            return r;
        }
        return (double)res[reslen/2];
    }
}

