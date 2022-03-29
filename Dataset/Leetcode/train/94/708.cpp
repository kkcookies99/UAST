 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if(!root)return res;
        stack<TreeNode*> s;
        TreeNode* p = root;
        while(p!=NULL||!s.empty())
        {
            while(p!=NULL)
            {
                s.push(p);
                p = p->left;
            }
            if(!s.empty())
            {
                p = s.top();
                s.pop();
                res.push_back(p->val);
                p = p->right;
            }
        }
        return res;
    }
};

