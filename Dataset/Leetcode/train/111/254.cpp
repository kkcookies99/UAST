class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==NULL)return 0;
        int l=XXX(root->left),r=XXX(root->right);
        if(l>0&&r>0)return min(l,r)+1;
        else return max(l,r)+1;
    }
};

