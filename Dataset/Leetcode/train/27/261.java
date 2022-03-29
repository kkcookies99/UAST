 public int XXX(int[] nums, int val) {



    int s = -1;
    int e = -1;
    int r = 0;
    Arrays.sort(nums);
    int length = nums.length;
    if(length==0){
        return 0;
    }
    for(int i=0;i<length;i++){
        if(nums[i]==val){
            e = i;
   
        }
    }
    for(int n=(length-1);n>=0;n--){
        if(nums[n]==val){
            s = n;
         
        }
    }
    if(s!=-1&&e!=-1){
        r=length-((e-s)+1);
        e=e+1;
        while(e<length){
            nums[s]=nums[e];
            s=s+1;
            e=e+1;
        }
         return r;
    }else{
       return length;
    }
}

