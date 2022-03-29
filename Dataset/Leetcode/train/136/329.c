 int singleNumber(int* nums, int numsSize){
    if(numsSize==1) return *nums;
    return *nums^singleNumber(nums+1,--numsSize);
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


