 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
vector<vector<int>>result;  
sort(nums.begin(),nums.end());//先排序后判断nums[0]>0     
if(nums.size()<3||nums[0]>0)return result;//先判断size再引用nums[0]
int j,k;
for(int i=0;i<=nums.size()-3;){    
    j=i+1;
    k=nums.size()-1;
while(j<k){
if(nums[i]+nums[j]+nums[k]>0){
    k--;
}else if(nums[i]+nums[j]+nums[k]<0){
    j++;
}else {
    result.push_back(vector<int>{nums[i], nums[j], nums[k]});// 
       // 去重逻辑应该放在找到一个三元组之后
k--;
while(nums[k]==nums[k+1]&&j<k)k--;
j++;
while(nums[j]==nums[j-1]&&j<k)j++;
}
}
i++;
while(nums[i]==nums[i-1]&&i<=nums.size()-3)i++;
}
return result;
    }
};


