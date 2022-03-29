 class Solution {
    public int XXX(int[] height) {
        int mianji = 0;
        int start=0;
        int end=height.length-1;
        for(int i=0;i<height.length;i++){
            if(start>=end)break;
            int res = (end-start)*Math.min(height[start],height[end]);
            mianji = Math.max(res, mianji);
            if (height[start]>height[end]){
                end--;
            }else {
                start++;
            }
        }
        return mianji;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


