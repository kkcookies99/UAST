class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
       sort(nums.begin(),nums.end()); 
        vector<vector<int>> result;
        do{
            vector<int> temp;
            for(int i=0;i<nums.size();i++){
              temp.push_back(nums[i]);
            }
            result.push_back(temp);
        
        }while ( next_permutation(nums.begin(),nums.end()) ); 
    return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


