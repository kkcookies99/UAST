 public int XXX(int[] nums) {
       if(nums.length<2)return nums.length;
       int i=0,n=0;
       while(i<nums.length-1){
            if(nums[n]!=nums[++i])
                nums[++n]=nums[i];
        }
       return n+1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

