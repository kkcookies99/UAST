 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int length = len1 + len2;
        // 创建一个新数组
        int[] arr = new int[length];
        // 声明两个变量，分别用来对两个数组进行循环
        int index = 0, i = 0, j = 0;

        // 对两个数组进行循环，其中一个数组循环完毕即退出
        while(i < len1 && j < len2) {
            if(nums1[i] < nums2[j]) {
                arr[index++] = nums1[i++];
            } else {
                arr[index++] = nums2[j++];
            }
        }
        // 判断没有循环完的数组是哪一个，将剩余数据加入到arr中
        // 由于上边已经对i和j进行了后++，所以在这里是可能和len相等
        if(i == len1) {
            for(int k = j; k < len2; k++) {
                arr[index++] = nums2[k];
            }
        } else if(j == len2) {
            for(int k = i; k < len1; k++) {
                arr[index++] = nums1[k];
            }
        }

        int midL = (length - 1) / 2;
        int midR = (double)(length - 1) / 2 == (double) midL ? midL : midL + 1;
        return (double)(arr[midL] + arr[midR]) / 2;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


