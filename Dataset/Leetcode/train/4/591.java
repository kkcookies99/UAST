 public double XXX(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2,0,merge, nums1.length, nums2.length);
        Arrays.sort(merge);

        System.out.println(Arrays.toString(merge));
        if (merge.length % 2 == 1) {
            return merge[merge.length/2];
        } else {
            double p = merge[merge.length/2];
            return (p + merge[merge.length/2 - 1])/2;
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


