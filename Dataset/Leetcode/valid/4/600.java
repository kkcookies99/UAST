 class Solution {
   public double XXX(int[] nums1, int[] nums2) {
       if (nums1.length == 0) return (nums2[(nums2.length - 1 ) / 2] + nums2[nums2.length / 2]) / 2.0;
       if (nums2.length == 0) return (nums1[(nums1.length - 1 ) / 2] + nums1[nums1.length / 2]) / 2.0;

       //计算需要的索引 len - 1 和 len
       int len = nums1.length + nums2.length;
       int index1 = (len - 1) / 2;
       int index2 = len / 2;
       //游标指针
       int j = 0, k = 0;
       int min, sum = 0;
       for (int i = 0; i < index2 + 1; i++) {
           //找出两个数组中较小的元素
           if (j >= nums1.length) {
               min = nums2[k];
               k ++;
           } else if (k >= nums2.length) {
               min = nums1[j];
               j ++;
           } else {
               if (nums1[j] < nums2[k]) {
                   min = nums1[j];
                   j ++;
               } else {
                   min = nums2[k];
                   k ++;
               }
           }

           if (i == index1) {
               sum = sum + min;
           }
           if (i == index2) {
               sum = sum + min;
           }
       }
       return sum / 2.0;
   }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


