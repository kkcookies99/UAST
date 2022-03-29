int height(TreeNode* root)
{
    if(root==nullptr) return 0;
    return max(height(root->left),height(root->right))+1;
}
bool XXX(TreeNode* root) {
    if(root==nullptr) return true;
    return abs(height(root->left)-height(root->right))<=1&&XXX(root->left)&&XXX(root->right);
}
