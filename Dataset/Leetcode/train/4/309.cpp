 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int siz1=nums1.size(),siz2=nums2.size();

        if(siz1>siz2){
            swap(nums1,nums2);
            siz1=nums1.size();
            siz2=nums2.size();
        }

        int left=0,right=siz1,totalLeft=(siz1+siz2+1)/2;

        int i,j;
        while(left<right){
            i=(left+right+1)/2;
            j=totalLeft-i;
            if(nums1[i-1] > nums2[j]){
                right=i-1;
            }else{
                left=i;
            }
        }
        
        i=left;
        j=totalLeft-i;

        int max1=(i-1<0)?-1:nums1[i-1];
        int min1=(i==siz1)?1e7:nums1[i];
        int max2=(j-1<0)?-1:nums2[j-1];
        int min2=(j==siz2)?1e7:nums2[j];

        if((siz1+siz2)%2==0){
            return (double)(max(max1,max2)+min(min1,min2))/2;
        }
        return max(max1,max2);
        

    }
};

