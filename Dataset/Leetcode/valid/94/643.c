 int* XXX(struct TreeNode* root, int* returnSize){
    int* test = malloc(sizeof(int));
    *returnSize = 0;
    int* ret = malloc(sizeof(int) * SIZE);
    struct TreeNode* p = root;
    Stack stack;
    initStack(&stack);
    while(p || !isEmpty(stack)){
        if(p){
            push(&stack, p);
            p = p->left;
        }
        else{
            p = pop(&stack);
            ret[(*returnSize)++] = p->val;
            p = p->right;
        }
    }
    free(stack.s);
    return ret;
}

