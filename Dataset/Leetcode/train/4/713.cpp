 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int size = nums1.size() + nums2.size();
        if ((size & 1) == 0) {
            return (kthele(nums1,nums2,0,0,size/2-1) + kthele(nums1,nums2,0,0,size/2))/2.0;
        } else {
            return kthele(nums1, nums2, 0, 0, size/2);
        }
    }

    int kthele(vector<int>& nums1, vector<int>& nums2, int st1, int st2, int k) {
        if (st1 == nums1.size()) {
            return nums2[st2+k];
        } else if (st2 == nums2.size()) {
            return nums1[st1+k];
        } else if (k == 0) {
            return min(nums1[st1], nums2[st2]);
        }
        int half = (k - 1) / 2;
        if (st1 + half >= nums1.size()) {
            return kthele(nums1, nums2, st1, st2+half+1, k-half-1);
        } else if (st2 + half >= nums2.size()) {
            return kthele(nums1, nums2, st1+half+1, st2, k-half-1);
        } else if ((k & 1) == 1 && nums1[st1+half] == nums2[st2+half]) {
            return nums1[st1+half];
        }else if (nums1[st1+half] <= nums2[st2+half]) {
            return kthele(nums1, nums2, st1+half+1, st2, k-half-1);
        } else if (nums1[st1+half] > nums2[st2+half]) {
            return kthele(nums1, nums2, st1, st2+half+1, k-half-1);
        } 
        return -1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


