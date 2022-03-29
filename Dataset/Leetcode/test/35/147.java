 public int XXX(int[] nums, int target) {

    int left=0;
    int right=nums.length-1;
    while(left<right){
    int mid=left+(right-left)/2;
    if(target<nums[mid]){
     right=mid-1;
    }else if(target>nums[mid]){
      left=mid+1;
    }else{
       return mid;
    }
    }
    //让left跟right相等得时候跳出来做额外得判断
    if(target==nums[left]){
     return left;
    }else if(target>nums[left]){
    return left+1;
    }else{
    return left;
    }       
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

