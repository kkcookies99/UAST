 public double XXX(int[] nums1, int[] nums2) {
    int n=nums1.length;
    int m=nums2.length;
    int p1=0,p2=0;
    int k=n+m;
    int[] sum=new int[k];
    for(int i=0;i<k;i++){
        if(p2>=m || (p1<n && nums1[p1]<nums2[p2])){
            sum[i]=nums1[p1];
            p1++;
        }else{
            sum[i]=nums2[p2];
            p2++;
            }
        }
    double ans=0;
    if((n+m)%2==0){
        ans=((sum[k/2-1]+sum[k/2]))/2.0;
    }else{
        ans=sum[k/2];
    }
    return ans;
}

