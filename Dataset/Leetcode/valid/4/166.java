 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] both = new int[nums1.length+nums2.length];
        int i = 0;
        while(i < nums1.length){ //将数组nums1的值复制到both中
           both[i] = nums1[i];
           i++;
        }
        int j = 0;
        while(j < nums2.length){ //将数组nums2的值继续复制到both中
            both[i+j] = nums2[j];
            j++;
        }
        Arrays.sort(both); //排序
        if(both.length%2 == 0){ //如果总数为偶数，取中间两个数的平均值
            return (both[both.length/2 - 1] + both[both.length/2])/2.0;
        } else {  //如果总数为奇数，取中间那个数
            return both[both.length/2];
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

