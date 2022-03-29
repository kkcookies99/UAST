class Solution {
    public void XXX(int[] nums) {
        int[] time = new int[3];
        for(int i=0;i<nums.length;i++){
            time[nums[i]]++;
        }
        for(int i = 0; i<nums.length;i++){
            if(i<time[0]) nums[i]=0;
            else if(i<time[0]+time[1]) nums[i]=1;
            else nums[i] = 2;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


