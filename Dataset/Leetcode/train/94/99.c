 int* XXX(struct TreeNode* root, int* returnSize){
    int data[100],count=0,top=-1;
    struct TreeNode *stack[100];
    struct TreeNode*temp=root;
    while(temp!=NULL){
        stack[++top]=temp;
        if(temp->left==NULL) break;
        temp=temp->left;
    }
    while(top!=-1)
    {
        data[count++]=stack[top]->val;
        if(stack[top]->right!=NULL){
            temp=stack[top--];
            stack[++top]=temp->right;
            temp=temp->right;
            while(temp->left!=NULL){
                stack[++top]=temp->left;
                temp=temp->left;
            }
        }
        else top--;
    }
    int *ret=malloc(sizeof(int)*count);
    for(int i=0;i<count;i++) ret[i]=data[i];
    (*returnSize)=count;
    return ret;
}

