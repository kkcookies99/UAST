int XXX(int* height, int heightSize){
    int i=0,j=heightSize-1,max=0,temp=0;
    while(i<j){
        if(height[i]<height[j]){
            temp=(j-i)*height[i];
            i++;
        }
        else{
            temp=(j-i)*height[j];
            j--;
        }
        max=max>temp?max:temp;
    }
    return max;
}

