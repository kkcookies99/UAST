 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        if(!root) return res;
        
        queue<TreeNode*> Q;
        Q.push(root);
        
        while(!Q.empty()){
            vector<int> tmp;
            int len = Q.size();  //len记录的是上一层孩子总数
            
            for(int i = 0; i < len; ++i){
                TreeNode* x = Q.front(); Q.pop();
                tmp.push_back(x->val);
                
                if(x->left) Q.push(x->left);
                if(x->right) Q.push(x->right);
            }
            res.push_back(tmp);
        }  //while
        return res;
    }  //XXX
};  //Solution

