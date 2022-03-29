int XXX(int* height, int heightSize){
    int maxHeight = height[0];
    int maxIdx = 0;
    for(int i = 0; i < heightSize; ++i)
        if(height[i] > maxHeight) {
            maxIdx = i;
            maxHeight = height[i];
        }
    int* flag = (int*)malloc(heightSize*sizeof(int));
    for(int i = 0; i < heightSize; ++i)
        flag[i] = 0;
    int tmp = 0;
    for(int i = 0; i <= maxIdx; ++i)
        if(height[i] >= tmp) {
            flag[i] = 1;
            tmp = height[i];
        }
    tmp = 0;
    for(int i = heightSize - 1; i >= maxIdx; --i)
        if(height[i] >= tmp) {
            flag[i] = 1;
            tmp = height[i];
        }
    int left = 0;
    int right = heightSize - 1;
    int res = 0;
    while(left < right) {
        if(height[left] < height[right]) {
            if(height[left] * (right - left) > res)
                res = height[left] * (right - left);
            while(0 == flag[++left]);
        }
        else {
            if(height[right]*(right - left) > res)
                res = height[right]*(right - left);
            while(0 == flag[--right]);
        }
    }
    return res;
}

