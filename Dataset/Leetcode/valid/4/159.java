     public double XXX(int[] nums1, int[] nums2) {
        return Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed())
                .sorted()
                .limit((nums1.length + nums2.length) / 2 + 1)
                .skip((nums1.length + nums2.length) % 2 != 0 ?
                        (nums1.length + nums2.length) / 2 :
                        (nums1.length + nums2.length) / 2 - 1)
                .collect(Collectors.averagingInt(Integer::intValue));
    }

