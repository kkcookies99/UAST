 public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
            double xxx = 0;
            int index1 = 0;   //数组1的索引指标
            int index2 = 0;  //数组2的索引指标
            int curNum = 0; //当前指标指向的数组
            int allLen = nums1.Length + nums2.Length;
            int medIndex1 = allLen % 2 != 0 ? allLen / 2 : allLen / 2-1; //用于中位数运算的第一个值的索引
            int medIndex2 = allLen % 2 != 0  ? allLen / 2 : allLen / 2 ; //用于中位数运算的第二个值的索引
            for (int i = 0; i < allLen; i++)
            {
                if (nums1.Length <= index1)
                {
                    curNum = 2;
                    index2 += 1;
                }
                else if (nums2.Length <= index2)
                {
                    curNum = 1;
                    index1 += 1;
                }
                else
                {
                    curNum = nums1[index1] > nums2[index2] ? 2 : 1;
                    if (curNum==1)
                        index1 += 1;
                    else
                        index2 += 1;
                }
                if (medIndex1 == index1 + index2-1)
                    xxx += curNum == 1 ? nums1[index1-1] : nums2[index2-1];
                if (medIndex2 == index1 + index2-1)
                {
                    xxx += curNum == 1 ? nums1[index1-1] : nums2[index2-1];
                    break;
                }
            }
            return xxx/2;
    }
}

