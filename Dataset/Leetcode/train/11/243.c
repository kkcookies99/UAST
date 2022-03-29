int XXX(int* height, int heightSize){
    int low=0,high=heightSize-1,max=0,ans=0;
    while(low<high){
        if(height[low]>height[high]){
            ans=height[high]*(high-low);
            high--;
        }else{
            ans=height[low]*(high-low);
            low++;
        }
        max=fmax(max,ans);
    }
    return max;
}


