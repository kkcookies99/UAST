 int XXX(int* height, int heightSize){
    int i = 0;
    int j = heightSize - 1;
    int result = 0;

    while(i != j) {
        int temp;
        temp = height[i] > height[j] ? height[j] : height[i];
        result = result > ((j - i) * temp) ? result : ((j - i) * temp);
        if (temp == height[i]) {
            i++;
        } else {
            j--;
        }
    }
    return result;
}

