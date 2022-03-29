 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size(), n = nums2.size();
        int cntSum = m + n;
        if(cntSum % 2){
            return helper(nums1, nums2, (cntSum + 1)/2);
        }
        return helper(nums1, nums2, cntSum / 2) * 0.5 + helper(nums1, nums2, cntSum / 2 + 1) *0.5;

    }
    int helper(vector<int>& nums1, vector<int>& nums2, int k){
        int m = nums1.size(), n = nums2.size();
        if(m > n){
            return helper(nums2, nums1,k);
        }

        if(m == 0){
            return nums2[k-1];
        }
        // make sure m <= n;
        if(k <= m){
            return getUpMedian(nums1, 0, k-1, nums2, 0, k-1);
        }
        if(k > n){
            if(nums1[k - n - 1] >= nums2[n-1]){
                return nums1[k-n-1];
            }
            if(nums2[k-m-1] >= nums1[m-1]){
                return nums2[k-m-1];
            }
            // 淘汰(k-m)+(k-n) = 2k - (m+n)数，在剩余两个长度为(m+n)-k的数组里寻找中位数，位置恰好为(m+n)-k + 2k-(m+n) = k
            return getUpMedian(nums1, k - n , m-1, nums2, k - m , n - 1);
        }
        if(nums2[k-m-1] >= nums1[m-1]){
            return nums2[k-m-1];
        }
        return getUpMedian(nums1, 0, m - 1, nums2, k - m , k - 1);
    }
    int getUpMedian(vector<int> &nums1, int s1, int e1, vector<int> &nums2, int s2, int e2){
        int mid1, mid2, offset;
        while(s1 < e1){
            mid1 = s1 + (e1 - s1) / 2;
            mid2 = s2 + (e2- s2) / 2;
            offset = ((e1 - s1 + 1) & 1 )^ 1;
            if(nums1[mid1] == nums2[mid2]){
                return nums1[mid1];
            }else if(nums1[mid1] > nums2[mid2]){
                e1 = mid1;
                s2 = mid2+offset;
            }else{
                s1 = mid1 + offset;
                e2 = mid2;
            }
        }
        return min(nums1[s1], nums2[s2]);
    }
};

