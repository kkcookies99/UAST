 int XXX(int* nums, int numsSize, int target){
    if(numsSize==0) return 0;
    int low=0,high=numsSize-1,index=numsSize/2;
    while(low<high)
    {
        if(target==nums[index]) return index;
        if(target>nums[index]) low=index+1;
        else high=index-1;
        index=(high+low)/2;
    }
    if(target>nums[index]) return index+1;
    return index;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

