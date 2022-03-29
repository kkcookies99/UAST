bool XXX(int x){
    if(x < 0)return false;
    int *target;//存目标整数相反数的数组(目标数组)
    int *nums1;//存前半段整数的数组
    int *nums2;//存后半段整数的数组
    int MaxSize = 0;//记录整数长度
    int i = 0;
    int k = 0;
    int s = x;
    while(s != 0){//得到整数长度，即目标整数长度，数组长度
        s = s/10;
        MaxSize += 1;
    }//while
    target = (int*)malloc(MaxSize * sizeof(int));
    nums1 = (int*)malloc((MaxSize/2) * sizeof(int));
    nums2 = (int*)malloc((MaxSize/2) * sizeof(int));
    while(x != 0){//初始化目标数组
        target[i++] = x%10;
        x = x/10;
    }//while
    for(int j = 0; j < MaxSize/2; ++j){//初始化前半段数组
        nums1[j] = target[j];
    }//for
    if(MaxSize%2 == 0){
        for(int j = MaxSize-1; j >= MaxSize/2; --j){
            nums2[k++] = target[j];
        }//for
    }//if
    if(MaxSize%2 == 1){
        for(int j = MaxSize-1; j >= (MaxSize/2)+1; --j){
            nums2[k++] = target[j];
        }//for
    }//if
    for(int j = 0; j < MaxSize/2; ++j) {
        if (nums1[j] != nums2[j]) {
            return false;
        }
    }
    return true;
}

