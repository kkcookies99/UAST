 import java.text.DecimalFormat;
import java.text.NumberFormat;
class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] ints = mergeArrSort(nums1, nums2);
        int length = ints.length;
        if (length % 2==0){
            //偶数
            int i = length / 2;
            double v = (ints[i - 1] + ints[i]) / 2.0f;
            return v;
        }else {
            //奇数
            int i = length / 2;
            double v =ints[i];
            return v;
        }
    }

    public  int[] mergeArrSort(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length+nums2.length];
        // TODO Auto-generated method stub
        int start = 0;
        int temp = 0;
        int index = 0;
        while ((start <= nums1.length-1) && (temp <= nums2.length-1)) {//两段数组，一个从left到mid，一个从mid+1到right，每次把小的赋值给数组b
            if (nums1[start] <= nums2[temp]) {
                res[index++] = nums1[start++];
            } else {
                res[index++] = nums2[temp++];
            }
        }
        if (start > nums1.length-1) {
            for (int i = temp; i <= nums2.length-1; i++)
                res[index++] = nums2[i];
        } else {
            for (int i = start; i <= nums1.length-1; i++)
                res[index++] = nums1[i];
        }
        return res;
    }
}

