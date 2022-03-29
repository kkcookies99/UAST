 vector<int> XXX(vector<int>& nums, int target) {
        int size = nums.size();
        vector<int> ans;
        unordered_map<int,int> map;
        
        for(int i=0 ; i<size ;  i++)
        {
            int tmp = target - nums[i];
            
            cout << tmp << endl;
            
            if(map.find(tmp)!=map.end())
            {
                ans.push_back(map[tmp]);
                ans.push_back(i);
                return ans;
            }
            
            map[nums[i]]=i;
        }
        return ans;
    }

