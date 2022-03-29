 int* XXX(struct TreeNode* root, int* returnSize){
 int *num=(int*)malloc(sizeof(int)*100);
    if(root==NULL){
        *returnSize=0;
        return num;
    }
    int i=0;
    inorder(root,num,&i);
    *returnSize=i;
    return num;
}

void inorder(struct TreeNode* node,int *n,int *i){
    if(node==NULL){
        return ;
    }
    inorder(node->left,n,i);
    n[(*i)++]=node->val;
    inorder(node->right,n,i);
}

