```class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int i,j,k=0,n,m;
        n=nums1.length;
        m=nums2.length;
        int[] temp=new int[n+m];
        double zn = 0;
        for(i=0,j=0,k=0;i<n&&j<m;k++){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i++];
            }
            else{
                temp[k]=nums2[j++];
            }
            //System.out.println(temp[k]);
        }
        if(i<n){
            for(;i<n;k++,i++){
                temp[k]=nums1[i];
            }
        }
        if(j<m){
            for(;j<m;k++,j++){
                temp[k]=nums2[j];
            }
        }
        
        if((n+m)%2==0)
            zn=(temp[(n+m)/2]+temp[(n+m)/2-1])/2.0;
        else
            zn=temp[(n+m)/2];
        return zn;
    }
}
