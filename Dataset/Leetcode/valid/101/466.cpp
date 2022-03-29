 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
            return true;
        return issame(root->left,root->right);
    }
    bool issame(TreeNode* node1,TreeNode* node2)
    {
        if(node1==NULL&&node2==NULL)
            return true;
        if(node1==NULL||node2==NULL)
            return false;
        if(node1->val==node2->val)
            return issame(node1->left,node2->right)&&issame(node1->right,node2->left);
        return false;
    }
};

