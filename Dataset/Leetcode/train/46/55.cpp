class Solution {
public:
    vector<vector<int>> res ; 
    vector<int> path ;
    vector<bool> st ;

    vector<vector<int>> XXX(vector<int>& nums) {
        for(int i = 0 ;i < nums.size() ; i ++) st.push_back(false) ;
        dfs(nums,0) ;
        return res ;    
    }
    void dfs(vector<int>& nums , int u ){
        if(u == nums.size()){       //全都填上数字了！
            res.push_back(path) ; return ;
        }
        for(int i = 0 ;i < nums.size() ; i++){
            if(!st[i]){   //nums[i] 没有被使用过！
                st[i] = true ;
                path.push_back(nums[i]) ;
                dfs(nums,u + 1) ;   //填下一个
                st[i] = false ;     //恢复现场
                path.pop_back() ;   //移出元素
            }
        }

    }
};

