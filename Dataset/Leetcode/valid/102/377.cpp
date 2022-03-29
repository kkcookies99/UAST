class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>>res;
        if(!root)return res;
        vector<int>path;
        queue<TreeNode*>saved;
        saved.push(root);
        saved.push(NULL);
        while(!saved.empty()){
            auto x = saved.front();
            saved.pop();
            if(!x){
                res.push_back(path);
                path.clear();
                if(!saved.empty())saved.push(NULL);
                else break;
            }else{
                path.push_back(x->val);
                if(x->left)saved.push(x->left);
                if(x->right)saved.push(x->right);
            }
        }
        return res;
        
    }
};

