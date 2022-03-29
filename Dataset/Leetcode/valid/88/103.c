 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int i = m-- + n--;
    while (n >= 0) {
        nums1[--i] = m >= 0 && nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--]; 
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


