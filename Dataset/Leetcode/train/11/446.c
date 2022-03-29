 int XXX(int* height, int heightSize){
    int i=0;
    int j=heightSize-1;
    int height_i=height[i],height_j=height[j];
    int max=(j-i)*min(height_i,height_j);
    while(j>i){
        if(height[j]>height[i]){
            while((height[i]<=height_i)&&j>i){
                i++;
            }
            height_i=height[i];
        }else{
             while(height[j]<=height_j&&j>i){
                j--;
            }
            height_j=height[j];
        }
        if(max<(j-i)*min(height_i,height_j)){
            max=(j-i)*min(height_i,height_j);
        }
    }
    return max;
}
int min(int i,int j){
    if(j>i){
        return i;
    }else{
        return j;
    }
}

