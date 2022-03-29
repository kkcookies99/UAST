 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int, int> Hashtable;
        for (int i=0; i<nums.size(); i++){
            auto it = Hashtable.find(nums[i]);
            if(it != Hashtable.end()) it = Hashtable.erase(it);
            else Hashtable[nums[i]] += 1;
        }
        for (auto x:Hashtable){
            if(x.second==1) return x.first;
        }
        return {};
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


