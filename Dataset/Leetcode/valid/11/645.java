 class Solution {
    public int XXX(int[] height) {
        int maxNum = 0;
        int min = 0;
        int max = height.length - 1;
        while (min <= max){
           if((Math.min(height[min], height[max]) * (max - min) > maxNum)){
               maxNum = Math.min(height[min], height[max]) * (max - min);
           }
           if(height[min] > height[max]){
               --max;
           } else {
               min++;
           }
        }
        return maxNum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


