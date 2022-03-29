bool XXX(int x){
    bool flag = false; //先假设不是回文数
    if (x < 0) {
        return flag; //负数不是回文数
    }

    //定义一个数组存放最多32的元素
    int* temp = (int*)malloc(sizeof(int) * 32);
    int count = 0;
    int tempx = x;
    while(tempx) {
        temp[count++] = tempx % 10;
        tempx /= 10;
    }

    int L = 0;
    int R = count - 1;
    while (L < R) {
        if (temp[L] != temp[R]) {
            return false;
        }
        L++;
        R--;
    }
    return true;

}

