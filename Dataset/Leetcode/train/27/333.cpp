 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int l=0;
        for(int i=0;i<nums.size();++i){
            while(l<nums.size()&&nums[l]==val){
                ++l;
            }
            if(l==nums.size()){l=i; break;}
            nums[i]=nums[l];
            ++l;
            if(l==nums.size()){
                l=i;
                return ++i;
            }
        }
        return l;
    }
};

