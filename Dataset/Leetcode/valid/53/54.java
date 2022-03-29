class Solution {
    public int XXX(int[] nums) {
         int Maxsum=nums[0],sum=0;
        for (int i = 0; i < nums.length; i++) {
           sum+=nums[i];
           if(sum>Maxsum){
               Maxsum=sum;
           }
           if(sum<0)
           {
               sum=0;
           }

        }
       return Maxsum;
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


