 public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.Length + nums2.Length];

        int mid = -1;
        int mid1 = -1;
        int mid2 = -1;

        // 指示合并后 的数组长度是否为偶数
        bool isOushu = false;

        // 中位数的索引值
        if(arr.Length % 2 == 0){
            isOushu = true;
            mid2 = arr.Length / 2;
            mid1 = mid2 -1;
        }else{
            mid = arr.Length / 2;
        }

        int index1 = 0,
            index2 = 0,
            index = 0;

        double result = 0;

        // 合并两个数组
        while(true){
            if(index1+1 > nums1.Length && index2+1 > nums2.Length){
                break;
            }
            else if(index1+1 > nums1.Length){
                arr[index] = nums2[index2];
                index2 +=1;
            }
            else if(index2+1 > nums2.Length){
                arr[index] = nums1[index1];
                index1 +=1;
            }
            else{
                if(nums1[index1] < nums2[index2]){
                    arr[index] = nums1[index1];
                    index1 +=1;
                }else{
                    arr[index] = nums2[index2];
                    index2 +=1;
                }
            }

            if(isOushu && index == mid2){
                result = ((double)arr[mid1] + (double)arr[mid2]) / 2;
                break;
            }else if(index == mid){
                result = arr[index];
            }

            index +=1;
        }

        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

