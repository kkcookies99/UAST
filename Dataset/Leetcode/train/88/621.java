 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        while(true) {
            if (index2 >= n) {
                return;
            }
            if (index1 >= m) {
                if (index2 < n) {
                    for(int i = index2; i < n; i++) {
                        nums1[index1] = nums2[i];
                        index1++;
                    }
                }
                return;
            }
            if (nums1[index1] == nums2[index2]) {
                move(nums1, index1, m);
                nums1[index1] = nums2[index2];
                m++;
                index1++;
                index2++;
            } else if (nums1[index1] > nums2[index2]) {
                move(nums1, index1, m);
                nums1[index1] = nums2[index2];
                m++;
                index2++;
            } else {
                index1++;
            }
        }
    }

    public void move(int [] array, int index, int end) {
        while(index < end) {
            array[end] = array[end - 1];
            end--;
        }
    }
}

