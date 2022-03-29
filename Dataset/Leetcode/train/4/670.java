 public double XXX(int[] nums1, int[] nums2) {
        // 两数组长度
        int l1 = nums1.length,l2 = nums2.length;
        if(l1 == 0 || l2 == 0){
            if(l1 == 0){
                return l2 % 2 != 0 ? nums2[l2/2] : (nums2[l2/2-1]+nums2[l2/2])/2.0;
            }else{
                return l1 % 2 != 0 ? nums1[l1/2] : (nums1[l1/2-1]+nums1[l1/2])/2.0;
            }
        }
        // 两数组已遍历过的索引
        int i1 = -1,i2 = -1;
        // 存储遍历过的元素的后两个
        int[] num = new int[2];
        // num数组的索引
        int index = -1;
        // 遍历的长度不超过中位数的位置时
        while(i1+i2+2 <= (l1+l2)/2){
            // 取出要比较的两个数
            int n1 = i1+1 < l1 ? nums1[i1+1] : Integer.MAX_VALUE;
            int n2 = i2+1 < l2 ? nums2[i2+1] : Integer.MAX_VALUE;
            index = (index+1)%2;
            if(n1 <= n2){
                i1++;
                num[index] = nums1[i1];
            }else{
                i2++;
                num[index] = nums2[i2];
            }
        }
        return (l1+l2)%2 != 0 ? num[index] : (num[0]+num[1])/2.0;
    }

