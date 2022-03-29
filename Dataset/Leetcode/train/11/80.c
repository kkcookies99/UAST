int XXX(int* height, int heightSize){
    int max_s = 0;
    int s = 0;
    int i = 1;
    int j = 1;
    for(i=1;i<heightSize+1;i++){
        for(j=i+1;j<heightSize+1;j++){
            s = (j - i) * (height[i-1]>height[j-1]?height[j-1]:height[i-1]);
            if (s > max_s) max_s = s;
            else max_s = max_s;
        }
    }
    return max_s;
}

