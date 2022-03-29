class Solution {
public:
    int XXX(TreeNode* root) {
    if(root == NULL) return 0;
    
    int left = XXX(root->left);
    int right = XXX(root->right);
    return max(left,right) + 1;}
};

