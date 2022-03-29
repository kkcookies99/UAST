 public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
         List<int> list = new List<int>();
            foreach (int item in nums1) {
                list.Add(item);
                }
            foreach (int item in nums2) {
                list.Add(item);
                }
            list.Sort();
            if (list.Count % 2 == 0) {    
             return  double.Parse((list[list.Count / 2 - 1] + list[list.Count / 2]).ToString()) / 2;
                }
            else {
                return list[list.Count / 2];       
                }
}}

