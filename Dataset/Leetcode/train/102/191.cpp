class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res ;
        
        if(root == nullptr) return res ; 
        queue<TreeNode*> q ;
        q.push(root) ;
        while(!q.empty()){
            vector<int> ans ;
            for(int i = q.size() ; i ; i --){
                auto node = q.front() ;
                q.pop() ;
                ans.push_back(node -> val) ;
                if(node -> left != nullptr) q.push(node->left)  ;
                if(node -> right != nullptr) q.push(node -> right) ;
            }
            res.push_back(ans) ;
        }
        return res;

    }
};

