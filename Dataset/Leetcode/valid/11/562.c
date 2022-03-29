 int XXX(int* height, int heightSize){
    int i=0,j=heightSize-1,t=0,max=0;
    while(i<j){
        t = height[i]>height[j]?height[j]*(j-i):height[i]*(j-i);
        if(max<t) max = t;
        height[i]>height[j]?j--:i++;   
    }
    return max;
}

