int** XXX(struct TreeNode* root, int* returnSize, int** returnColumnSizes){
    int** res = (int**)malloc(sizeof(int*) * 1000);
    if(!root){
        *returnSize = 0;
        (*returnColumnSizes)[0] = 0;
        return res;
    }
    struct TreeNode** stack = (struct TreeNode**)calloc
    (10000, sizeof(struct TreeNode*));
    struct TreeNode* p;
    //index标记每一层最后一个数的位置，i指示当前层数
    int front = -1, rear = -1, index = 0, i = 0, j = 0;
    stack[++rear] = root;
    //rear-front是下一层的元素个数
    res[i] = (int*)calloc(rear-front, sizeof(int));
    (*returnColumnSizes)[i] = rear-front;
    while(front != rear){
        p = stack[++front];
        res[i][j++] = p->val;
        if(p->left) stack[++rear] = p->left;
        if(p->right) stack[++rear] = p->right;
        //当前层走完了，跳到下一层
        if(front == index && front != rear){
            //rear-front是下一层的元素个数
            res[++i] = (int*)calloc(rear-front, sizeof(int));
            (*returnColumnSizes)[i] = rear-front;
            j = 0;
            index = rear;//index跳到下一层的末尾
        }
    }
    *returnSize = ++i;
    return res;
}

