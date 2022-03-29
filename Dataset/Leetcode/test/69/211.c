int XXX(int x){
    int left = 1;
    int right = x;
    if (x == 0) {
        return 0;
    }
    while (left <= right) {
        int mid = left + ((right - left) >> 1);
        if (mid > (x/mid)) {
            right = mid - 1;
        } else if (mid < (x / mid)) {
            if ((mid + 1) > (x / (mid + 1))) {
                return mid;
            }

            left = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


