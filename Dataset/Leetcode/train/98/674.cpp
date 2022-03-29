 class Solution {
public:
    bool judges = true;
    bool XXX(TreeNode* root) 
    {
        if(root==NULL)
            return true;
        judge(root->left,long(LONG_MIN),long(root->val));
        judge(root->right,long(root->val),long(LONG_MAX));
        return judges;
    }
    void judge(TreeNode* p,long min,long max)
    {
        if(p==NULL)
            return;
        if(p->val <= min || p->val >= max)
        {
            judges = false;
            return;
        }
        judge(p->left,min,p->val);
        judge(p->right,p->val,max);
    }
};

