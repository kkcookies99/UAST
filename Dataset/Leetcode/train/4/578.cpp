 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m=nums1.size();
        int n=nums2.size();
        int flag= (m+n)%2;
        int i,j,k;
        int left,right=0;
        double mid;
        if(!flag)
        {
            if(m==0)
            {
                if(n==0) return 0.0;
                left=nums2[n/2-1];
                right=nums2[n/2];
                mid=(left+right)/2.0;
                return mid;
            }
            if(n==0)
            {
                left=nums1[m/2-1];
                right=nums1[m/2];
                mid=(left+right)/2.0;
                return mid;
            }
            for(i=0,j=0,k=0;k<((m+n+1)/2+1-flag-1);k++)
            {
                if(nums1[i]<nums2[j])
                {
                    left=nums1[i];
                    i++;
                    if(i==m&&k!=((m+n)/2-1))
                    {
                        left=nums2[(m+n)/2-m-1];
                        right=nums2[(m+n)/2-m];
                        break;
                    }
                }
                else
                {
                    left=nums2[j];
                    j++;
                    if(j==n&&k!=((m+n)/2-1))
                    {
                        left=nums1[(m+n)/2-n-1];
                        right=nums1[(m+n)/2-n];
                        break;
                    }
                }
            }
            if(right==0)
            {
                if(i==m) right=nums2[j];
                else if(j==n) right=nums1[i];
                else if(nums1[i]<nums2[j])
                {
                    right=nums1[i];
                    i++;}
                else
                {
                    right=nums2[j];
                    j++;}
            }
        }
        else
        {
            if(m==0)
            {
                if(n==0) return 0.0;
                left=nums2[n/2];
                right=left;
                mid=(left+right)/2.0;
                return mid;
            }
            if(n==0)
            {
                left=nums1[m/2];
                right=left;
                mid=(left+right)/2.0;
                return mid;
            }
            for(i=0,j=0,k=0;k<((m+n+1)/2+1-flag);k++)
            {
                if(nums1[i]<nums2[j])
                {
                    left=nums1[i];
                    i++;
                    if(i==m &&k !=((m+n+1)/2-1))
                    {
                        left=nums2[(m+n+1)/2-m-1];
                        break;
                    }
                }
                else
                {
                    left=nums2[j];
                    j++;
                    if(j==n && k!=((m+n+1)/2-1))
                    {
                        left=nums1[(m+n+1)/2-n-1];
                        break;
                    }
                }
            }
            right=left;
        }
        mid=(left+right)/2.0;
        return mid;
    }
};

