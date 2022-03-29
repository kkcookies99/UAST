 int** XXX(struct TreeNode* root, int* returnSize, int** returnColumnSizes){
    struct TreeNode* queue[5000]={0};  //队列
    struct TreeNode* ptr=root; //扫描指针
    int* columnum=(int*)malloc(sizeof(int) *1000); //记录每行元素个数的数组
    int** nums=(int**)malloc(sizeof(int*) *1000); //二维数组
    memset(nums, 0, sizeof(int*) * 1000); //初始化
    memset(columnum, 0, sizeof(int) * 1000); //初始化
    struct TreeNode* lastnode=root;//用来记录当前层的最后一个结点
    struct TreeNode* newlastnode=NULL;////用来记录下一层层的最后一个结点
    int front=0,rear=0,depth=0,index=0,flag=1;//depth为层号,index为每一层的计数指针
                                               //flag为是否进入下一层的标记用来控制开数组空间
    if(ptr!=NULL){
    queue[rear++]=ptr; //根入队
    while(front!=rear){ //栈非空
        if(!nums[depth]&&flag==1) //当到新的一层时对二维数组中该行开空间
            nums[depth] = (int *)malloc(sizeof(int) * 1000);
        flag=0;//
        ptr=queue[front++];//出队
        nums[depth][index++]=ptr->val;
        columnum[depth]=index;//更新该行元素个数
        if(ptr->left!=NULL){ //左孩子存在，左孩子入栈，更新newlastnode
            queue[rear++]=ptr->left;
            newlastnode=ptr->left;
        }
        if(ptr->right!=NULL){ //右孩子存在，右孩子入栈，更新newlastnode
            queue[rear++]=ptr->right;
           newlastnode=ptr->right;
        }
        if(ptr==lastnode){ //扫描指针到达该层最右结点
            lastnode=newlastnode; //更新lastnode
            depth++; //到达下一行
            flag=1;
            index=0; //重置该行元素计数
        }   
      }
    }
    *returnSize=depth; //返回二维数组元素个数
    *returnColumnSizes=columnum; //返回记录每行元素个数的数组大小
    return nums; 
}

