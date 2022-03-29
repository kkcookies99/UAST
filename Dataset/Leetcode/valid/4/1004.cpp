 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int tot=nums1.size()+nums2.size();
        if(tot%2==0){
            int left=find(nums1, 0, nums2, 0, tot/2);
            int right=find(nums1, 0, nums2, 0, tot/2+1);
            return (left+right)/2.0;
        }else return find(nums1, 0, nums2, 0, tot/2+1);
    }

    int find(vector<int> &nums1, int i, vector<int>&nums2, int j, int k){
        if(nums1.size()-i>nums2.size()-j) return find(nums2, j, nums1, i, k);
        if(k==1){
            if(nums1.size()==i) return nums2[j];
            else return min(nums1[i], nums2[j]);
        }
        if(nums1.size()==i) return nums2[j+k-1];
        // check k/2
        int si=min((int)nums1.size(), i+k/2), sj=j+k-k/2;
        if(nums1[si-1] > nums2[sj-1]) return find(nums1, i, nums2, sj, k-(sj-j));
        else return find(nums1, si, nums2, j, k-(si-i));
    }
};

