 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 0)
        {
        
            return (get_loction(nums1, nums2, 0, 0, (nums1.length + nums2.length) / 2) + get_loction(nums1, nums2, 0, 0, (nums1.length + nums2.length) / 2 + 1)) / 2.0;
        }
        else
        {
            return (double) get_loction(nums1, nums2, 0, 0, (nums1.length + nums2.length) / 2 + 1);
        }
    }

    /*begin1 */
    public int get_loction(int[] nums1, int[] nums2, int begin1, int begin2, int k)
    {
        if (begin1 == nums1.length)
        {
            return nums2[begin2 + k - 1];
        }
        else if (begin2 == nums2.length)
        {
            return nums1[begin1 + k - 1];
        }
        else if (k == 1)
        {
            return nums1[begin1] < nums2[begin2] ? nums1[begin1]: nums2[begin2];
        }
        else
        {
            int end1, end2;
            if (begin1 + k / 2 - 1 >= nums1.length)
            {
                end1 = nums1.length - 1;
            }
            else
            {
                end1 = begin1 + k / 2 - 1;
            }
            if (begin2 + k / 2 - 1 >= nums2.length)
            {
                end2 = nums2.length - 1;
            }
            else
            {
                end2 = begin2 + k / 2 - 1;
            }
            if (nums1[end1] <= nums2[end2])
            {
                return get_loction(nums1, nums2, end1 + 1, begin2, k - end1 - 1 + begin1);
            }
            else
            {
                return  get_loction(nums1, nums2, begin1, end2 + 1, k - end2 - 1 + begin2);
            }
        }
    }
}

