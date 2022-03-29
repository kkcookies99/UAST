 class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()==0)
            return res;
        vector<int> temp;
        vector<bool> book(nums.size(),true);
        for(int i=0;i<nums.size();i++){
            book[i] = false;
            temp.push_back(nums[i]);
            dfs(nums,nums.size(),temp,book);
            temp.pop_back();
            book[i] = true;
        }
        return res;
    }
    void dfs(vector<int>& nums,int k,vector<int> temp,vector<bool> &book){
        // cout<<k<<endl;
        if(k==1){
            res.push_back(temp);
            return ;
        }
        for(int i =0;i<nums.size();i++){
            if(book[i]==true){
                // cout<<k<<endl;
                book[i] = false;
                temp.push_back(nums[i]);
                dfs(nums,k-1,temp,book);
                temp.pop_back();
                book[i] = true;
            }
        }
        
    }
};

