 class Solution {
public:
    bool XXX(TreeNode* root) 
    {
        if(!root)
            return true;
        stack<TreeNode*> left_first,right_first;
        left_first.push(root);
        right_first.push(root);
        while(!left_first.empty())
        {
            TreeNode* l=left_first.top();
            left_first.pop();
            TreeNode* r=right_first.top();
            right_first.pop();

            if(l->val!=r->val)
                return false;
            if(l->left && r->right)
            {
                left_first.push(l->left);
                right_first.push(r->right);
            }
            else if((!l->left && r->right) || (l->left && !r->right))
                return false;
            
            if(r->left && l->right)
            {
                left_first.push(l->right);
                right_first.push(r->left);
            
            }
            else if((!r->left && l->right) || r->left && !l->right)
                return false;
        }
        return true;
    }
};

