 public int XXX(int[] nums, int target) {
        int len;
        if (nums==null || (len=nums.length)==0) return -1;
        int mid = len/2;
        if (nums[mid] < target){
            for (int i=mid+1; i< nums.length;i++){
                if (nums[i]==target) return i;
                if (nums[i]>target) return i;
            }
            return len;
        }else{
            for(int j= mid;j>=0;j--){
                if (nums[j]<target) return j+1;
            }
            return 0;
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


