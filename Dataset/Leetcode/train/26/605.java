     public int XXX(int[] nums) {
        if(nums.length==1||nums==null)return nums.length;
        int n=nums.length;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[++i]=nums[j++];
            }
        }
        return i+1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


