class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int XXX = 0;
        
        while(left < right){
            int area = (right-left)*((height[left]>height[right]) ? height[right]:height[left]);
            XXX = area>XXX? area:XXX;
            if(height[left] < height[right]){
                left++;
            }else if(height[left] > height[right]){
                right--;
            }else{
                left++;
                right--;
            }
        }
        return XXX;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

