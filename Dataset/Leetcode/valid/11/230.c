int XXX(int* height, int heightSize){
    int *left,*right,volume=0;
    left=height;
    right=height+(heightSize-1);
    while(left!=right){
        if(*left<=*right){
            volume=volume>=(*left)*(heightSize-1)?volume:(*left)*(heightSize-1);
            left++;
        }
        else{
            volume=volume>=(*right)*(heightSize-1)?volume:(*right)*(heightSize-1);
            right--;
        }
        heightSize--;
    }
    return volume;
}

