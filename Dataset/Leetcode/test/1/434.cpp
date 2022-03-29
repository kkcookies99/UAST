 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) 
    {
        int len=nums.size();
        vector<int> index;
        map<int,int> namemap;
        for(int i=0;i<len;i++)  //hash
        {
            namemap[nums[i]]=i;
        }
        for(int i=0;i<len;i++)
        {
            if(namemap.find(target-nums[i])!=namemap.end())
            { 
                if(i!=namemap[target-nums[i]])
                {
                    index.push_back(i);
                    index.push_back(namemap[target-nums[i]]);
                    break;
                }
            }
        }
        
        return index;
    }
    
};  ```
