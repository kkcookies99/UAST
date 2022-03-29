 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL)
            return true;
        stack<TreeNode*> stack1, stack2;
        stack1.push(root->left);
        stack2.push(root->right);
        while(!stack1.empty() && !stack2.empty())
        {
            TreeNode* tmp1 = stack1.top();
            stack1.pop();
            TreeNode* tmp2 = stack2.top();
            stack2.pop();
            if(tmp1 == NULL && tmp2 == NULL)
                continue;
            else if(tmp1 != NULL && tmp2 != NULL && tmp1->val == tmp2->val)
            {
                stack1.push(tmp1->left);
                stack1.push(tmp1->right);
                stack2.push(tmp2->right);
                stack2.push(tmp2->left);
            }
            else
                return false;   
        }
        return true;
    }
};

