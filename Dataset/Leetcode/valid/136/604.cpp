 class Solution {
public:
    int singleNumber(vector<int>& nums) {        
        unordered_map<int,int> m;
        int i=0;
        while(!nums[i]){
            m[nums[i]]++;
            i++;
        }
        for(int i=0;i<nums.size();i++){
            if(m[nums[i]]==1){return nums[i];}
        }
        return -1;
    }    
};

