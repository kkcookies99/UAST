 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(m == 0) //特判
            for(int i = 0; i < n; i++)
                nums1[i] = nums2[i];
        for(int i = 0; i < n; i++) {
            if(nums2[i] <= nums1[0]) { //如果nums2的元素小于nums1的第一个，则直接插入到第一个
                for(int k = m - 1 + i; k >= 0; k--) {
                    nums1[k + 1] = nums1[k];
                }
                nums1[0] = nums2[i];
            }
            else {  //否则从后向前查找nums1，找到第一个小于nums2[i]的元素，进行插入
                for(int j = m - 1 + i; j >= 0; j--) {
                    if(nums2[i] > nums1[j]) {
                        for(int k = m - 1 + i; k > j; k--) {
                            nums1[k + 1] = nums1[k];
                        }
                        nums1[j + 1] = nums2[i];
                        break; //插入完记得需要break
                    }
                }
            }
        }
    }
};

