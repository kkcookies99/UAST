public int XXX(int[] height) {
    int index=0;
    int last=height.length-1;
    int max=-1;

    while(index<last){
         //数组中取最小值，所有解中取出最大值
        max=Math.max((last-index)*(Math.min(height[index],height[last])),max);
        if(height[index]<height[last]){
          //保存当前较小的值
            int temp=height[index];
          //找到比当前较小值大的在进行比较
            while(index<last&&height[++index]<=temp);
        }else{
           //同上
            int temp=height[last];
            while(index<last&&height[--last]<=temp);
        }
    }
    return max;
}
