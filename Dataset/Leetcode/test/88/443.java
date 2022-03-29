 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n >= 1)
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        if (m >= 1 && n >= 1) {
            int[] temp = new int[m + n];
            int t = 0;
            int a = 0;
            int b = 0;
            while (t < temp.length) {
                if ((nums1[a] <= nums2[b]) && nums1[a] != 0) {
                    temp[t] = nums1[a];
                    t++;
                    a++;
                } else if (nums1[a] == 0) {
                    for (int i = t; i < temp.length; i++) {
                        temp[i]=nums2[b];
                        b++;
                        t++;
                    }
                } else {
                    temp[t] = nums2[b];
                    t++;
                    b++;
                }
            }
            nums1=temp;
        }
    }
}

