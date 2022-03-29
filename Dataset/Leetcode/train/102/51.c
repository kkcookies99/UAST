int** XXX(struct TreeNode* root, int* returnSize, int** returnColumnSizes){
    if(!root)
    {
        *returnSize = 0;
        return 0;
    }
    int** result = (int**)malloc(sizeof(int*)*2000);
    int i = 0;
    struct TreeNode* p = root;
    struct TreeNode* queue[2000];int front = 0,rear = 0;
    queue[rear++] = p;
    *returnColumnSizes = (int*)malloc(sizeof(int)*2000);

    while(front!=rear)
    {
        int size = rear-front;
        result[i] = (int*)malloc(sizeof(int)*size);
        (*returnColumnSizes)[i] = size;
        for(int j=0;j<size;++j)
        {
            p = queue[front];
            front = (front+1)%2000;
            if(p->left)
            {
                queue[rear] = p->left;
                rear = (rear+1)%2000;
            }
            if(p->right)
            {
                queue[rear] = p->right;
                rear = (rear+1)%2000;
            }
            result[i][j] = p->val;
        }
        ++i;
    }
    *returnSize = i;    
    return result;
}


