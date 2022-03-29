 public double XXX(int[] nums1, int[] nums2) {
        int nums1Ptr = 0;
        int nums2Ptr = 0;

        int nums1Size = nums1.length;
        int nums2Size = nums2.length;

        if (nums1Size == 0 && nums2Size == 0) {
            return -1.00;
        }

        if (nums2Size == 0) {
            int mid = nums1Size / 2;
            if (nums1Size % 2 != 0) {
                return nums1[mid];
            } else {
                return (nums1[mid - 1] + nums1[mid]) / 2.0;
            }
        }

        if (nums1Size == 0) {
            int mid = nums2Size / 2;
            if (nums2Size % 2 != 0) {
                return nums2[mid];
            } else {
                return (nums2[mid - 1] + nums2[mid]) / 2.0;
            }
        }

        int[] mergedArray = new int[nums1Size + nums2Size];
        int i = 0;
        while (nums1Ptr < nums1Size || nums2Ptr < nums2Size) {
            if(nums1Ptr >= nums1Size) {
                mergedArray[i] = nums2[nums2Ptr];
                nums2Ptr++;
                i++;
                continue;
            }
            if(nums2Ptr >= nums2Size) { 
                mergedArray[i] = nums1[nums1Ptr];
                nums1Ptr++;
                i++;
                continue;
            }

            
            mergedArray[i] = nums1[nums1Ptr] < nums2[nums2Ptr] ? nums1[nums1Ptr] : nums2[nums2Ptr];
            if ( nums1[nums1Ptr] < nums2[nums2Ptr]) {
                nums1Ptr++;
            } else {
                nums2Ptr++;
            }
            
            i++;
        }

        if (mergedArray.length % 2 != 0) {
            return mergedArray[mergedArray.length/2];
        } else {
            return (mergedArray[mergedArray.length/2 - 1] + mergedArray[mergedArray.length/2]) / 2.0;
        }
    }

