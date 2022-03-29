class Solution {
public:
    vector<vector<int>> ans ;
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root) return ans; 
        queue<TreeNode*> q ;
        q.push(root) ;
        while(!q.empty()){
            vector<int> res ;
            for(int i = q.size() ; i ;i --){
                auto node = q.front() ;
                res.push_back(node -> val) ;
                q.pop() ;
                if(node -> left != nullptr) q.push(node -> left) ;
                if(node -> right != nullptr) q.push(node -> right) ;
            }
            ans.push_back(res) ;
        }
        return ans ;
    }
};

