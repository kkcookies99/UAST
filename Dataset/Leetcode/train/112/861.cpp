 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)
            return false;
        queue<TreeNode*> que;
        que.push(root);
        while(!que.empty())
        {
            TreeNode* a=que.front();
            que.pop();
            if(!(a->left||a->right)&&(sum==a->val))
                return true;
            if(a->left)
            {
                que.push(a->left);
                (a->left)->val+=a->val;
            }
            if(a->right)
            {
                que.push(a->right);
                (a->right)->val+=a->val;
            }
        }
        return false;
    }
};

