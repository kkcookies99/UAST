int XXX(int x){
    if (x == 0) {
        return 0;
    }

    int left = 1, right = x/2 + 1, res;
    while (left <= right) {
        int mid = left + ((right - left) >> 1);
        if (mid > x / mid) {
            right = mid - 1;
        } else if (mid < x / mid) {
            left = mid + 1;
            res = mid;
        } else if (mid == x / mid) {
            return mid;
        }
    }
    return res;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


