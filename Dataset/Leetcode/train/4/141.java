 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] num = new int[l1 + l2];
        // 第一个数组索引位置
        int i = 0;
        // 第二个数组索引位置
        int j = 0;
        // 定义的num数组索引位置
        int k = 0;

        //两个数组都有值时进行比较，之后向新定义的数组中赋值
        while(i < l1 && j < l2){
            if(nums1[i] < nums2[j]){
                num[k] = nums1[i++];
            }else{
                num[k] = nums2[j++];
            }
            k++;
        }
        // 第二个数组中元素已遍历完成，把第一个数组中剩余元素放到新建数组中
        if(i < l1){
            for (int a = i; a<l1; a++){
                num[k++] = nums1[a];
            }
        }else{
            for (int a = j; a<l2; a++){
                num[k++] = nums2[a];
            }
        }

        // 上面的代码其实就是合并两个有序数组，下面的代码就是找到中间位置，然后取出元素
        // 取余，因为如果余数为1，则直接取中间的那个元素，如果余数为0，需要取两个元素然后除以2
        int y = num.length % 2;
        // 中间元素位置的索引值
        int c = num.length / 2;
        if(y == 1){
            return num[c];
        }else{
            return (double)(num[c] + num[c - 1])/2;
        }
    }
}

