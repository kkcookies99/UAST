 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> result;
        if(!root)return result;
        stack<TreeNode*> s;
        while(!s.empty()||root)
        {
            while(root)
            {
                s.push(root);
                root=root->left;
            }
            TreeNode *r=s.top();
            s.pop();
            result.push_back(r->val);
            root=r->right;
        }
        return result;
    }
};

