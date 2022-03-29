bool XXX(struct TreeNode* root, int targetSum){
    struct TreeNode** stk = malloc(sizeof(struct TreeNode*)*5001);
    struct TreeNode* pre = NULL;
    int sum = 0;
    int top = 0;
    while(root!=NULL||top>0){
        if(root!=NULL){
            stk[top++] = root;
            sum = sum + root->val;
            root = root -> left;
        }
        else{
            root = stk[top-1];
            if(root->left==NULL&&root->right==NULL&&sum == targetSum){
                    return true;
            }
            else if(root->right!=NULL&&root->right!=pre){
                root=root->right;
            }   
            else{
                root = stk[--top];
                sum = sum-root->val;
                pre = root;
                root = NULL;
            }
        }
    }
    return false;
}

