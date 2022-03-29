 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
       double res = 0;
        int[] sum = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length || j < nums2.length){
            if (i >= nums1.length){
                sum[k] = nums2[j];
                j++;
                k++;
                continue;
            }else if(j >= nums2.length){
                sum[k] = nums1[i];
                i++;
                k++;
                continue;
            }else {
                while (nums1[i] <= nums2[j]) {
                    sum[k] = nums1[i];
                    i++;
                    k++;
                    if (i >= nums1.length) {
                        break;
                    }
                }
                if (i >= nums1.length) {
                    continue;
                }
                while (nums1[i] > nums2[j]) {
                    sum[k] = nums2[j];
                    j++;
                    k++;
                    if (j >= nums2.length) {
                        break;
                    }
                }
            }
        }
        if(sum.length%2 == 0){
            res = (sum[sum.length/2] + sum[(sum.length/2) - 1])/2.000000d;
        }else if(sum.length%2 == 1){
            res = sum[(sum.length-1)/2];
        }
        // DecimalFormat df = new DecimalFormat("#.000000");

        // return Double.parseDouble(df.format(res));
        return res;
    }
}

