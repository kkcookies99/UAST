 class Solution {
    public int XXX(int[] height) {
        int left=0,right=height.length-1,max=0;
        while(left<right){
            int l=Math.min(height[left],height[right]);
            int w=right-left;
            max=Math.max(l*w,max);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


