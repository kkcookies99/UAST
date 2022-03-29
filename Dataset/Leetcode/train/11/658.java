 class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int sum = 0;
        for(int i = 0;i<height.length;i++){
            for(int j = 1;j<height.length;j++){
                int x = j-i;
                int y = Math.min(height[i],height[j]);
                sum = x*y;
                if(sum > max) max = sum;
            }
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


