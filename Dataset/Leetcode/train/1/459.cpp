 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> out(nums.size());
        for(int r = 0; r < nums.size(); r++)
        {
            out[r] = nums[r];
        }
        
        sort(nums.begin(), nums.end());
        int i = 0, j = nums.size() - 1;
        while(i < j)
        {
          if (target < nums[i] + nums[j])
          {
              --j;
          }
            else if (target > nums[i] + nums[j])
            {
                ++i;
            }
            else
            {
                break;
            }
        }
        
        bool ib = false, jb = false;
        for(int r = 0; r < out.size(); r++){
            if(!ib)
            {
                if(nums[i] == out[r])
                {
                    i = r;
                    ib = true;
                    continue;
                }
            }
            
            if(!jb)
            {
                if(nums[j] == out[r])
                {
                    j = r;
                    jb = true;
                    continue;
                }
            }
            
            if(ib && jb){
                break;
            }
        }
        return vector<int>{i, j};
            
            
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


