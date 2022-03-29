 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if (!root) return res;
        stack<TreeNode*> stk;
        while (root || stk.size()) {
            while (root) {
                stk.push(root);
                root = root->left;
            }
            if (stk.size()) {
                root = stk.top();
                stk.pop();
                res.push_back(root->val);
                root = root->right;
            }
        }
        
        return res;
    }
};

