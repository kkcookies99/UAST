 class Solution {
public:
    bool XXX(TreeNode* root) {
        bool balance = false;
        int h = 0;
        return Balance(root,h);
    }
    bool Balance(TreeNode* root,int &h)
    {
        if(root == NULL)
        {
            h = 0;
            return true;
        }
        if(root->left==NULL&&root->right==NULL)
        {
             h = 1;
             return true;
        }
        int hr,hl;
        bool br = Balance(root->left,hl);
        bool bl = Balance(root->right,hr);
        h = (hl>hr?hl:hr)+1;//三目运算符
        if(abs(hl-hr)<2)
            return br&bl;
        return false;
    }
};

