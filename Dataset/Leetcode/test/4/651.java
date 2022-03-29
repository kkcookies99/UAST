  public double XXX(int[] nums1, int[] nums2) {
    	int totalLength = nums1.length + nums2.length; 	
	
        //寻找第k小,正序偏移量k
        int k = ( totalLength + 1 ) / 2;

        double minK = findMinK(nums1, nums2, k, 0, 0);

        //奇偶考虑
        boolean isEven = totalLength % 2 == 0;
        if (isEven){
            double minK1 = findMinK(nums1, nums2 , k + 1, 0, 0);
            minK = (minK + minK1) / 2;
        }
        return minK;
    }

    /*
    k - 1 , halk - 1 的意义是一样的，
    由于从两个数组的lo1 跟lo2 索引（包含） 开始进行排除，
    也就是两数组开始索引应该为lo1 / lo2 ,而不是 {lo1 / lo2} + halk 索引开始
    */
    private static double findMinK(int[] nums1, int[] nums2, int k, int lo1, int lo2) {

        if (lo1 >= nums1.length) {
            return nums2[lo2 + k - 1];
        } else if (lo2 >= nums2.length) {
            return nums1[lo1 + k - 1];
        } else if (k == 1){
            return Math.min(nums1[lo1], nums2[lo2]);
        }

        int halfK = k / 2 ;
        int excludeCount = 0;
        int indexOne = Math.min(lo1 + halfK - 1, nums1.length - 1); //防止越界
        int indexTwo = Math.min(lo2 + halfK - 1, nums2.length - 1);

        //index_n 自增作为下一次寻找第k小数 各自数组开始索引 
        //excludeCount 为排除数量，考虑到索引可能超过数组末尾，因此halfK并非一定为 实际排除数量
        if (nums1[indexOne] < nums2[indexTwo]) {
            excludeCount = ++indexOne - lo1 ;
            lo1 = indexOne ;
        } else {
            excludeCount = ++indexTwo - lo2 ;
            lo2 = indexTwo ;
        }

        return findMinK(nums1, nums2, k - excludeCount, lo1, lo2);
    }

