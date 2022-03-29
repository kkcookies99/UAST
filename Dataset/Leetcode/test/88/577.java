 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        //双指针方法   O(N)
        int i = 0;
        int j = 0;
        //这里为求方便 开辟新的数组
        int q = 0;
        int[] ints =  new int[m+n];

        while(i<m && j<n) {
            if(nums1[i]<nums2[j]) {
                ints[q] = nums1[i];
                i++;
            } else {
                ints[q] = nums2[j];
                j++;  
            }
            q++;
        }
        if(i == m ) {
            while (j<n) {
                ints[q] = nums2[j];
                j++;
                q++;
            }
        }//说明num1先到低  把num2之后的拼接上去即可

        if(j == n) {
            while (i<m) {
                ints[q] = nums1[i];
                i++;
                q++;
            }
        }

      // nums1 = ints; //I dont understand???

        for(int k = 0;k<m+n;k++) {
            nums1[k] = ints[k];
        }


    }
}

