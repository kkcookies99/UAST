class Solution {
public:
int max_deep=-1;
    int XXX(TreeNode* root) {
        if(root==NULL) return 0;
        max_deep=max(max_deep,XXX(root->left));
        max_deep=max(max_deep,XXX(root->right));
        return max_deep+1;
    }
};

