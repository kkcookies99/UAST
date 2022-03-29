 int* XXX(struct TreeNode* root, int* returnSize){
    struct TreeNode** stack = (struct TreeNode**)malloc(sizeof(struct TreeNode*)*100);
    struct TreeNode* p = root;
    int * res = (int*)malloc(sizeof(int)*100), i = 0, top = -1;

    while(top != -1 || p)
    {
        if(p)
        {
            stack[++top] = p;
            p = p->left;
        }
        else
        {
            res[i++] = stack[top]->val;
            p = stack[top];
            p = p->right;
            top--;
        }
    }
    *returnSize = i;
    return res;
}

