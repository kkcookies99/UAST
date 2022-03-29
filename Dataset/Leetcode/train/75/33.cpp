class Solution {
public:
    void XXX(vector<int>& nums){//方法一：一次扫描，扫描到0就移到前面，2就移到后面
        int left=0,right=nums.size()-1;
        for(int i=0;i<=right;){
            if(nums[i]==0){
                if(i==left){
                    left++;i++;
                }else swap(nums[left++],nums[i]);
            }else if(nums[i]==2){
                swap(nums[right--],nums[i]);
            }else i++;
        }
    }
    // void XXX(vector<int>& nums) {//方法二：两次扫描，第一次扫描把0和1的个数数出来，第二次写数组
    //     int r=0,w=0;
    //     for(auto n:nums){
    //         if(n==0)r++;
    //         else if(n==1)w++;
    //     }
    //     for(int i=0;i<r;i++)nums[i]=0;
    //     for(int i=r;i<r+w;i++)nums[i]=1;
    //     for(int i=r+w;i<nums.size();i++)nums[i]=2;
    // }
};

