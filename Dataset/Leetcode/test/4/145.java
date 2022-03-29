 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
 int len = nums1.length;
        int len1 = nums2.length;
        int length=len+len1;
        int[] target = new int[length];
        int i = 0, j = 0;
        int index = 0;
        while (i < len && j < len1) {
            if (nums1[i] < nums2[j]) {
                target[index++] = nums1[i++];
            } else {
                target[index++] = nums2[j++];
            }
        }
        if (i == len) {
            for (int k = j; k < len1; k++) {
                target[index++]=nums2[k];
            }
        }else if (j==len1){
            for (int k = i; k < len; k++) {
                target[index++]=nums1[k];
            }
        }
        int mid=(length-1)/2;
        return length%2==0?(double) (target[mid]+target[mid+1])/2:target[mid];
    }
}

