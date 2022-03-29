     vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> map;
        for(int i = 0; i < nums.size(); i++){
            map[nums[i]] = i;
        }
        
        vector<int> res;
        for(int i = 0; i < nums.size(); i++){
            auto it = map.find(target - nums[i]);
            if(it != map.end() && it->second != i){
                res.push_back(it->second);
                res.push_back(i);
                break;
            }
        }
        return res;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


