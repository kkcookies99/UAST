 int XXX(int* height, int heightSize){
    int l=0;
    int r=heightSize-1;
    int area =0;
    int h =0;
    while(l<r){
        h = height[l] > height[r]? height[r] :height[l];
        area = h*(r-l) >area? h*(r-l) :area;
        if( height[l] < height[r]){
            l++;
        }else r--;
    }
    return area;
}

