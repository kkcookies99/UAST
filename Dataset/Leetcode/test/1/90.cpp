 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        
        vector<int> ret_val;
        
        
        int len = nums.size();
        int i = 0;
        int j = 0;
        
        
        srand(0);
        while(1)
        {
            i =  rand() % len;
            j =  rand() % len;
            
            if(i == j)
            {
                continue;
            }
            else
            {
                if(nums[i] + nums[j] ==  target)
                {
                    ret_val.push_back(i);
                    ret_val.push_back(j);
                    break;
                }
            }
        }
        return ret_val;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


