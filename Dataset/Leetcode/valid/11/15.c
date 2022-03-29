int XXX(int* height, int heightSize){
    int low,high;
    int max = -1,sum;
    low = 0;
    high = heightSize - 1;

    while(low < high){
        sum = 0;    
        if(height[low] <= height[high]){
            sum = (high - low) * height[low];
            low++;
        }else{
            sum = (high - low) * height[high];
            high--;
        }
        if(sum > max)
            max = sum;
    }
    return max;
}

