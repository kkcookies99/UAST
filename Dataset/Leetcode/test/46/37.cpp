class Solution {
public:
    void process(vector<int>& nums,vector<bool>& exist,int remain,vector<vector<int>>& ans,vector<int>& a){
        if(remain==0){//剩下的词没了就返回
            ans.emplace_back(a);
            return;
        }
        for(int i=0;i<nums.size();i++){//浏览还有什么词能用
            if(exist[i])continue;//用过了就别用了
            else{
                a.emplace_back(nums[i]);
                exist[i]=1;
                process(nums,exist,--remain,ans,a);//添加，继续递归
                exist[i]=0;
                remain++;
                a.pop_back();
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        int remain=nums.size();
        vector<bool> exist(remain,0);
        vector<vector<int>> ans;
        vector<int> a;
        process(nums,exist,remain,ans,a);
        return ans;
    }
};

