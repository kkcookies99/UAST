 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        stack<TreeNode*> ss{{root}};

        while(!ss.empty())
        {
            TreeNode* t = ss.top();ss.pop();
            if(!t->left && !t->right && t->val == sum)
            {
                return true;
            }

            if(t->left)
            {
                t->left->val += t->val;
                ss.push(t->left);
            }

            if(t->right)
            {
                t->right->val += t->val;
                ss.push(t->right);
            }
        }

        return false;
    }
};

