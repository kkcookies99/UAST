 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        int size=nums.size();
        map<int,int> hash_map;
        for(int i=0;i<size;i++){
            hash_map[nums[i]]=i;
        }
        for(int i=0;i<size;i++){
            std::map<int,int>::iterator it=hash_map.find(target - nums[i]);
            if(it!=hash_map.end()){
                int key=it->second;
                if(key!=i)
                    return {i,key};
            }
        }
        return {0,0};
    }
};

