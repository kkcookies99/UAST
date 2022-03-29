 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> tree;
        stack<TreeNode*> s;
        TreeNode* cur = root;
        while(cur || !s.empty())
        {
            while(cur)
            {
                s.push(cur);
                cur=cur->left;
            }
            cur = s.top();
            s.pop();
            tree.push_back(cur->val);
            cur = cur->right;
        } 
        return tree;
    }

};

