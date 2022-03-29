 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        //三个指针；p1->数组1的位置，p2->数组2的位置，i->(完整的)数组1的位置。全部都是从头开始放。
        //针对数组1和数组2是非递减的，所以可以从后面开始比较，更大的放入数组1的第i位置。
        //复杂度O(m+n)
        int p1 = m-1;
        int p2 = n-1;

        for(int i=m+n-1;i>=0;i--){
            if(p2<0 || nums2==null){
                break;  //p2<0时，不用排了，剩下的nums1本来就是有序的。
            }
            if(p1<0 || nums1[p1] <= nums2[p2]){    //  “||”或的机制是前面为true，后面的条件就不用看了，所以不会出现索引超出边界的情况。
                nums1[i] = nums2[p2--];
            }else{
                nums1[i] = nums1[p1--];
            }

        }
    }
}

