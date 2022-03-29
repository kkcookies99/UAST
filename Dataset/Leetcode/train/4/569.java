 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        if((n1+n2)%2==1){
            return find(nums1,0,nums2,0,(n1+n2)/2+1);
        }else{
            return (find(nums1,0,nums2,0,(n1+n2)/2)+find(nums1,0,nums2,0,(n1+n2)/2+1))/2.0;
        }
    }
    public int find(int[] nums1,int i,int[] nums2,int j,int k){
        if(nums1.length-i>nums2.length-j) return find(nums2,j,nums1,i,k);
        if(k==1){
            if(nums1.length==i) return nums2[j];
            else{
                return Math.min(nums1[i],nums2[j]);
            }
        }
        if(nums1.length==i) return nums2[j+k-1];
        int s1=Math.min(i+k/2,nums1.length);
        int s2=j+k-k/2;
        if(nums1[s1-1]<=nums2[s2-1]) return find(nums1,s1,nums2,j,k-(s1-i));
        else return find(nums1,i,nums2,s2,k-(s2-j));
    }
}

