 class Solution {
public:
    vector<int> XXX(TreeNode* root) 
    {
        stack<TreeNode*> stk; 
        vector<int> res; 
        TreeNode* tmp; 
        while (root) { stk.emplace(root); root = root->left; }
        while (!stk.empty())
        {
            tmp = stk.top(); 
            stk.pop(); 
            res.emplace_back(tmp->val); 
            tmp = tmp->right; 
            while (tmp) { stk.emplace(tmp); tmp = tmp->left; }
        }
        return res; 
    }
};


