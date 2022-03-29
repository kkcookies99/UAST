int max(struct TreeNode* root, int* num)
{
    if (root == NULL) {
        return 0;
    }
    int l = max(root->left, num);
    int r = max(root->right, num);
    if (abs(l-r) > 1) {
        *num = abs(l-r);
    }
    return r > l ? r+1: l+1;
}
bool XXX(struct TreeNode* root) {
    int num = 0;
    max(root, &num);
    return num < 2;
}

