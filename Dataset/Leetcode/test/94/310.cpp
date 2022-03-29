 class Solution {
public:
        void goAlongLeftBranch(TreeNode *x,stack<TreeNode*> &s)
        {   
            while(x!=nullptr)
            {
                s.push(x);
                x=x->left;
            }

        }
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> s;
        vector<int> res;
        while(1)
        {
            goAlongLeftBranch(root,s);
            if(s.empty()) break;
            root=s.top();
            s.pop();
            res.push_back(root->val);
            root=root->right;
        }
        return res;
    }
};

