 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        //先预处理，使得m表示较小数组的个数，n表示较大数组的个数，A表示较小数组，B表示较大数组
        int m, n;
        double result;
        vector<int> A,B;
        if (nums1.size() <= nums2.size()) {
            A = nums1;
            B = nums2;
            m = nums1.size();
            n = nums2.size();
        }
        else {
            A = nums2;
            B = nums1;
            m = nums2.size();
            n = nums1.size();
        }
        //先处理三种边界情况，A为空，i = 0（对应的j可能为n）, i = m（对应的j可能为0）
        if (m == 0) {
            if (n % 2) {
                return B[n/2];
            }
            else {
                return (B[n/2-1] + B[n/2])/2.0;
            }
        }
        int i = 0;
        int j = (m + n + 1)/2 - i;
        if (B[j-1] <= A[i] && j != n) {
            if ((m + n) % 2) {
                result = B[j-1];
                return result;
            }
            else {
                result = A[i] < B[j] ? (A[i] + B[j-1])/2.0 : (B[j] + B[j-1])/2.0;
                return result;
            }
        }
        else if (B[j-1] <= A[i]) {
            if ((m + n) % 2) {
                result = B[j-1];
                return result;
            }
            else {
                result = (A[i] + B[j-1])/2.0;
                return result;
            }
        }
        i = m; 
        j = (m + n + 1)/2 - i;
        if (A[i-1] <= B[j] && j != 0) {
            if ((m + n) % 2) {
                result = A[i-1] > B[j-1] ? A[i-1] : B[j-1];
                return result;
            }
            else {
                result = A[i-1] > B[j-1] ? (A[i-1] + B[j])/2.0 : (B[j-1] + B[j])/2.0;
                return result;
            }
        }
        else if (A[i-1] <= B[j]) {
            if ((m + n) % 2) {
                result = A[i-1];
                return result;
            }
            else {
                result = (A[i-1] + B[j])/2.0;
                return result;
            }
        }
        //如果不是以上三种特殊情况，那么折半查找即可确定i,j
        int sta = 1,end = m - 1;
        while (sta <= end) {
            i = (sta + end)/2;
            j = (m + n + 1)/2 - i;
            if (A[i -1] > B[j]) {
                end = i - 1;
            }
            else if (B[j-1] > A[i]) {
                sta = i + 1;
            }
            else {
                break;
            }
        }
        if ((m + n) % 2) {
            result = A[i-1] > B[j-1] ? A[i-1] : B[j-1];
            return result;
        }
        else {
            int fmax = A[i-1] > B[j-1] ? A[i-1] : B[j-1];
            int lmin = A[i] < B[j] ? A[i] : B[j];
            result = (fmax + lmin)/2.0;
            return result;
        }
    }
};

