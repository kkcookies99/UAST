 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m=nums1.size();
        int n=nums2.size();
        if(m>n){
            vector<int> temp=nums1;
            nums1=nums2,nums2=temp;
            int tem=m;
            m=n,n=tem;
        }
        int imin=0,imax=m,half=(m+n+1)/2;
        while (imin<=imax){
            int i=(imin+imax)/2;
            int j=half-i;
            if(i>imin&&nums1[i-1]>nums2[j]){
                imax=i-1;
            }
            else if(i<imax&&nums1[i]<nums2[j-1]){
                imin=i+1;
            }
            else{
                double leftmax;
                if(i==0)
                    leftmax=nums2[j-1];
                else if(j==0)
                    leftmax=nums1[i-1];
                else
                    leftmax=(nums1[i-1]>nums2[j-1])?nums1[i-1]:nums2[j-1];
                if((m+n)%2==1)
                    return leftmax;
                double rightmin;
                if(i==m)
                    rightmin=nums2[j];
                else if(j==n)
                    rightmin=nums1[i];
                else
                    rightmin=(nums1[i]<nums2[j])?nums1[i]:nums2[j];
                return (leftmax+rightmin)/2.0;
                
            }
        }
    }
};

