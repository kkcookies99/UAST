 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m + n];
        int i = 0;
        int j = 0;

        int k = 0;
        double res;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
                k++;
            } else if (nums1[i] > nums2[j]) {
                temp[k] = nums2[j];
                j++;
                k++;
            } else {
                temp[k] = nums1[i];
                k++;
                i++;
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        int p = temp.length;
        if(p % 2!=0){
            return (double) temp[p/2];
        }else{
            double l;
            l = (temp[(p/2)-1]+temp[p/2])/2.0;
            return l;
        }
    }
}

