int** XXX(struct TreeNode* root, int* returnSize, int** returnColumnSizes){
    int **ans=(int**)malloc(1024*sizeof(int*));
    *returnSize=0;
    *returnColumnSizes=(int*)malloc(1024*sizeof(int));
    if(root==NULL)
        return ans;
    int sk[10240]={0};
    struct TreeNode **node=(struct TreeNode**)malloc(10240*sizeof(struct TreeNode*));
    int front=10238,last=10239,count;
    sk[last]=root->val;
    node[last]=root;
    while(front<last)
    {
        count=last-front;
        *(*returnColumnSizes+*returnSize)=count;
        ans[*returnSize]=(int*)malloc(count*sizeof(int));
        while(count)
        {
            ans[*returnSize][count-1]=node[last]->val;
            if(node[last]->right!=NULL)
            {
                sk[front]=node[last]->right->val;
                node[front]=node[last]->right;
                front--;
            }
            if(node[last]->left!=NULL)
            {
                sk[front]=node[last]->left->val;
                node[front]=node[last]->left;
                front--;
            }
            last--;
            count--;
        }
        (*returnSize)++;
    }
    return ans;
}


