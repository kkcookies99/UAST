 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
if (n == 0 && m != 0) {
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums1[i];
                nums1 = arr;
                System.out.println(Arrays.toString(nums1));
            }
        } else if (m == 0 && n != 0) {
            nums1 = nums2;
            System.out.println(Arrays.toString(nums1));
        } else if(m == 0 && n == 0){
            nums1 = new int[]{};
            System.out.println(Arrays.toString(nums1));
        } else{
            int index = 0;
            int i = m + n;
            while (n < i) {
                nums1[n] = nums2[index];
                n++;
                index++;
            }
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }
    }
}

