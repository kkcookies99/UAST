 class Solution {
public:

    double med_direct(vector<int>& nums1,int lo1,int hi1,vector<int>& nums2,int lo2,int hi2)
    {
        vector<int> nums;
        merge( nums1.begin(), nums1.end(),
                nums2.begin(), nums2.end(),
                back_inserter( nums ) );
        //sort(nums.begin(),nums.end());
        if(nums.size()%2) return nums[nums.size()/2];  //奇数
        else return (nums[nums.size()/2-1]+nums[nums.size()/2])/2.0;  //偶数  
    }
    //lo1为数组1的左边界，lo2为数组2的左边界,同理，hi为有边界
    double median(vector<int>& nums1,int lo1,int hi1,vector<int>& nums2,int lo2,int hi2)
    {
        //递归边界条件
        if((hi1-lo1+hi2-lo2)<6) return med_direct(nums1,lo1,hi1,nums2,lo2,hi2);
        int mid1=lo1+(hi1-lo1-1)/2,mid2=lo2+(hi2-lo2)/2;  //奇偶数这边要注意
        if(nums1[mid1]<nums2[mid2])
            return median(nums1,mid1,hi1,nums2,lo2,mid2);
        else if(nums1[mid1]>nums2[mid2])
            return median(nums1,lo1,mid1,nums2,mid2,hi2);
        else 
            return nums1[mid1];
    }

    double XXX(vector<int>& nums1, vector<int>& nums2) {
        //首先要判空
        if(nums1.size()==0||nums2.size()==0) return med_direct(nums1,0,nums1.size(),nums2,0,nums2.size());
        return median(nums1,0,nums1.size(),nums2,0,nums2.size());
    }
};

