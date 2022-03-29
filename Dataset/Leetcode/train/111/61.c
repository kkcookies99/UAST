int XXX(TreeNode* root) {
    // 递归实现
    if (!root){
        return 0;
    }
    else if (!root->left && !root->right){
        return 1;
    }
    else if (!root->left){
        return XXX(root->right) + 1;
    }
    else if (!root->right){
        return XXX(root->left) + 1;
    }
    else{
        return min(XXX(root->left), XXX(root->right)) + 1;
    }
}

