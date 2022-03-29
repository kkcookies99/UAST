 class Solution {
public:
    int XXX(vector<int>& nums) {
        map<int,int> sortMap;
        for(int i = 0; i < nums.size(); i++){
            sortMap[nums[i]]++;
        }
        map<int,int>::iterator iter = sortMap.begin();
        for(int i = 0; i < sortMap.size(); i++){
            nums[i] = iter->first;
            iter++;
        }
        int count = sortMap.size();
        return count;
    }
};