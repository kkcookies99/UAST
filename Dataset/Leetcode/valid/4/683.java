 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int p = nums1.length-1;
        int q = nums2.length-1;
        int[] merge = new int[nums1.length+nums2.length];
        int index = merge.length-1;
        while (index>=0){
            if(p>=0&&q>=0){
                if(nums1[p]>=nums2[q]){
                    merge[index] = nums1[p];
                    p--;
                }else {
                    merge[index] = nums2[q];
                    q--;
                }
            }else if(p>=0){
                merge[index] = nums1[p];
                p--;
            }else {
                merge[index] = nums2[q];
                q--;
            }
            index--;
        }
        if(merge.length==1){
            return merge[0];
        }else if(merge.length%2!=0){
            return merge[merge.length/2];
        }
        return (float)(merge[(merge.length/2)-1]+merge[merge.length/2])/2;
    }
}

