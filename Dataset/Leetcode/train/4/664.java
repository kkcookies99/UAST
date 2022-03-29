 class Solution {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public double XXX(int[] nums1, int[] nums2) {
        int nums1Index = 0,nums2Index = 0,count = 0;
        //大小顶堆
        queue1 = new PriorityQueue<>();
        queue2 = new PriorityQueue<>((x,y)->(y-x));
        while(count++ < nums1.length+nums2.length){
            if(queue1.size() != queue2.size()){
                if(nums1Index == nums1.length) queue1.add(nums2[nums2Index++]);
                else queue1.add(nums1[nums1Index++]);
                queue2.add(queue1.poll());
            }else{
                if(nums1Index == nums1.length) queue2.add(nums2[nums2Index++]);
                else queue2.add(nums1[nums1Index++]);
                queue1.add(queue2.poll());
            }
        }
        return queue1.size()!=queue2.size() ? queue1.peek() : (queue1.peek()+queue2.peek())/2.0;
    }
}

