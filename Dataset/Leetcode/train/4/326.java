 public static double XXX(int[] nums1, int[] nums2) {
    int[] arr = new int[nums1.length + nums2.length];
    int a = 0;
    int b = 0;
    int i = 0;
    double result;
    while (a < nums1.length || b < nums2.length) {
      if (a == nums1.length) {
        arr[i++] = nums2[b++];
      } else if (b == nums2.length) {
        arr[i++] = nums1[a++];
      } else if (nums1[a] > nums2[b]) {
        arr[i++] = nums2[b++];
      } else {
        arr[i++] = nums1[a++];
      }
    }
    if (i % 2 == 0) {
      int left = i / 2;
      result = (arr[left] + arr[--left]) * 1.0 / 2;
    } else {
      result = arr[i / 2];
    }
    return result;
  }

