 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int, int> hash;
        for(int i = 0; i < nums.size(); i++){
        	if(hash.count(target - nums[i])) return {hash[target - nums[i]], i};
        	hash[nums[i]] = i;
		}
		return {-1, -1};
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


