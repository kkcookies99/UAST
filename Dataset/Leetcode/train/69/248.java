class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid == 0) { //mid为0时,必定左边界增大.
                left = mid + 1;
                continue;
            }
            if ( mid <= x / mid && (mid+1) > x / (mid+1)){
                return mid;
            } else if (mid > x / mid){ //右边界缩小
                right = mid;
            } else if ((mid+1) <= x / (mid+1)) { //左边界增大
                left = mid + 1;
            }
        }
        return left;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


