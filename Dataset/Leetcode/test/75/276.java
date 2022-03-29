class Solution {
    public void XXX(int[] nums) {
        // p1第一个不是0；p2第一个不是1；p3遇到0就给p1，遇到1就给p2
        for(int p1=0,p2=0,p3=0;p3<nums.length;){
            while(p1<nums.length&&nums[p1]==0){
                p1++;
            }
            while(p2<nums.length&&(nums[p2]==0||nums[p2]==1)){
                p2++;
            }
            if(nums[p3]==0&&p3>p1){
                swap(nums,p1,p3);
            }else if(nums[p3]==1&&p3>p2){
                swap(nums,p2,p3);
            }else{
                p3++;
            }
        }
    }
    void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


