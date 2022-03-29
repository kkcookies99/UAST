 char ** XXX(int n, int* returnSize){
    //返回size不会超过 n!
    int size =1;
    for(int i=1;i<=n;i++){
        size*=i;
    } 
    char** returnStrs = (char**)malloc(sizeof(char*)*size);


    //每个左括号右侧都有一个空档，可以放右括号  
    //qtys 记录某个位置左侧（含该位置）的右括号数量之和
    int* qtys = (int*)malloc(sizeof(int)*n);
    memset(qtys,0,sizeof(int)*n);
    qtys[n-1]=n;
    
    
    int tail = n-1;
    *returnSize = 0;
    while(qtys[0]<=1){ 
        //记录待返回字符串     
        returnStrs[(*returnSize)]=(char*)malloc((n<<1)+1);
        returnStrs[(*returnSize)][(n<<1)] = '\0';
        
        int lastQty = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            returnStrs[(*returnSize)][count++] = '(';          
            for(int j=0;j<qtys[i]-lastQty;j++){
                returnStrs[(*returnSize)][count++] = ')';
            }
            lastQty=qtys[i];
        }
        (*returnSize)++;

        
        if(tail == 0)
            break;

        do{
            tail--;
            qtys[tail]++;
        }while(tail>=1 && qtys[tail]>tail+1);
        
        //重新计算qtys的值
        for(int i=tail+1;i<n;i++){
            qtys[i]=qtys[tail];
        }
        //再将tail指针定位到最后一个位置
        tail = n-1;
        qtys[tail]=n;      
        
    }
    
    free(qtys);
    return returnStrs;
    
}


