 int* XXX(struct TreeNode* root, int* returnSize){
    int *array=(int*)malloc(100*sizeof(int));*returnSize=0;
    int i=0;
    struct TreeNode *stack[100];
   int top=-1;
   struct TreeNode *p=root;
   while(p||top>-1){
        while(p){
            stack[++top]=p;
            p=p->left;
        }
        p=stack[top--];
        array[i++]=p->val;
        p=p->right;
        if(p){
            stack[++top]=p;
            p=p->left;
        }
   }
    *returnSize=i;
    return array;
}

