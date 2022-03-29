 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
  Stream<Integer> stream1 = IntStream.of(nums1).boxed();
        Stream<Integer> stream2 = IntStream.of(nums2).boxed();
        Stream<Integer> newStream = Stream.concat(stream1, stream2);
        List<Integer> list = newStream.sorted((a, b) -> a - b)
                .collect(Collectors.toList());
        int size = list.size();
        if(size%2==0){
            return (list.get(size/2-1)+list.get(size/2))/2.0;
        }
        return list.get(size/2);
    }
}

