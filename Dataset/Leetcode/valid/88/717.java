 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < m || secondIndex < n) {
            if (firstIndex == m) {
                for (int i = secondIndex; i < n; i++) {
                    res.add(nums2[i]);
                }
                break;
            }
            if (secondIndex == n) {
                for (int i = firstIndex; i < m; i++) {
                    res.add(nums1[i]);
                }
                break;
            }
            if (nums1[firstIndex] <= nums2[secondIndex]) {
                res.add(nums1[firstIndex]);
                firstIndex++;
                continue;
            } else {
                res.add(nums2[secondIndex]);
                secondIndex++;
                continue;
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = res.get(i);
        }
    }
}```

