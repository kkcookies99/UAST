 class Solution {
public:
    bool judge(TreeNode*q,TreeNode*p){
        if(!q ^ !p)
            return false;
        if(!q && !p)
            return true;
        if(q->val == p->val)
            return judge(q->left,p->right)&&judge(q->right,p->left);

        return false;
    }
    bool XXX(TreeNode* root) {
        return judge(root->left,root->right);
    }
};

