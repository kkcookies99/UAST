 public int XXX(int[] nums) {

    if(nums.length<=1)return nums.length;

    int count=1;//默认1，因为不管怎样，第一个都是新值
    int N = nums.length;
    //要用个flag值来标记
    int flag = nums[0];
    for(int i=1; i<N; i++){
        if(nums[i]==flag){
            continue;
        }
        //如果前后不等，表示已经变了，也就是说有新的值。由于是递增的，所以这个新值肯定不同
        if(i!=N-1)flag=nums[i];//如果当前i不是最后一个
        int temp=nums[i];
        nums[i]=nums[count];
        nums[count]=temp;
        count++;
        
    }
    return count;
}

