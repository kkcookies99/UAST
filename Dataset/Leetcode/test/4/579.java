 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int size = (len1 + len2)/ 2 + 1;
        List<Integer> temp = new ArrayList(size);
        //复杂度 O(log((m+n)/2+1))
        int i = 0, j = 0;
        while ((i < len1 || j < len2) && ((i + j) < size)) {
            if (i < len1 && j < len2) {
                int v1 = nums1[i];
                int v2 = nums2[j];
                if (v1 <= v2) {
                    temp.add(v1);
                    i++;
                } else {
                    temp.add(v2);
                    j++;
                }
            } else if (i < len1) {
                temp.add(nums1[i]);
                i++;
            } else {
                temp.add(nums2[j]);
                j++;
            }

        }

        if ((len1 + len2) % 2 != 0) {
            return temp.get(size - 1);
        } else {
            return Double.valueOf(temp.get(size - 1) + temp.get(size - 2))/2;
        }
    }
}
