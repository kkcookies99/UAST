 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
       int len1 = nums1.length, len2 = nums2.length;
        int len = len1 + len2;
        int i = 0, j = 0;   //index表示并集的下标,i表示num1的下标,j表示num2的下标
        int current = 0;
        double AA = -1, BB = 0;

        if ((len1 + len2) % 2 == 0) {
            while (i < len1 && j < len2 && current <= len / 2) {
                if (current == 0) {
                    BB = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
                } else {
                    AA = BB;
                    BB = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
                }
                current++;
            }

            while (i < len1 && current <= len / 2) {
                AA = BB;
                BB = nums1[i++];
                current++;
            }

            while (j < len2 && current <= len / 2) {
                AA = BB;
                BB = nums2[j++];
                current++;
            }
            return (AA + BB) / 2;
        } else {
            while (i < len1 && j < len2 && current != len / 2 + 1) {
                BB = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
                current++;
            }
            while (i < len1 && current != len / 2 + 1) {
                BB = nums1[i++];
                current++;
            }
            while (j < len2 && current != len / 2 + 1) {
                BB = nums2[j++];
                current++;
            }
            return BB;
        }
    }
}

