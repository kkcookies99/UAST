class Solution {
public:
    void XXX(vector<int>& nums) {
        int a = 0, b = 0, c = 0;
        int len = nums.size();
        
        for(int i = 0; i < len; i++){
            if(nums[i] == 0){
                a++;
            }else if(nums[i] == 1){
                b++;
            }else if(nums[i] == 2){
                c++;
            }
        }
        
        nums.clear();
        nums.insert(nums.begin(),c,2);
        nums.insert(nums.begin(),b,1);
        nums.insert(nums.begin(),a,0);
    }
};

