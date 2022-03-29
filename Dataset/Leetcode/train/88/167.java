     public void XXX(int[] nums1, int m, int[] nums2, int n) {
        // 若nums1中没有要合并的元素，则把nums2一一复制过去
        if (m == 0){
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
       // nums2中待合并的元素都大于等于nums1中最大元素
        if (m > 0 && nums2[i] > nums1[m-1]){
            nums1[m] = nums2[i];
            m += 1;
        }
        
        //nums2中待合并的元素小于nums1中的最小元素
        else if (nums2[i] < nums1[0]){
            
            for (int j = m; j >0; j--) {   //后移
                nums1[j] = nums1[j-1];
            }
            nums1[0] = nums2[i];
            m += 1;
        }
        //nums2中待合并的元素处于nums1中间
        else {
            for (int j = 1; j < m; j++) { 
                if (nums2[i] >= nums1[j - 1] && nums2[i] < nums1[j]) {  //找到插入的位置
                    for (int k = m; k >=j; k--) {   // 后移
                        nums1[k] = nums1[k-1];
                    }
                    nums1[j] = nums2[i];
                    m += 1;
                    break;
                }
            }
        }
    }
}
