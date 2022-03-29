 int* XXX(struct TreeNode* root, int* returnSize){
    *returnSize = 0;
    if(root == NULL)
        return NULL;
    int * ans = (int *)malloc(sizeof(int) * 400);
    struct TreeNode * stack[400];
    int top = 0;
    stack[top] = root;
    struct TreeNode * s = root;
    int k = 0;
    while (top != -1) {
        while (s->left != NULL) {
            stack[++top] = s->left;
            s = s->left;
        }
        s = stack[top];
        ans[k] = s->val;
        ++k;
        --top;
        
        while(top != -1 && s->right == NULL) {
            s = stack[top];
            ans[k] = s->val;
            ++k;
            --top;
        }
        if(s->right != NULL) {
            stack[++top] = s->right;
            s = s->right;
        }
        
    }
    *returnSize = k;
    return ans;
}


