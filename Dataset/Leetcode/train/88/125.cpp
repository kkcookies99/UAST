 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = 0, j = 0;

        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                // 需要插入
                int ii = m;
                // cout << ii << endl;
                for(; ii > i; ii--){
                    nums1[ii] = nums1[ii-1];
                }
                nums1[ii] = nums2[j];
                j++;
                i++;
                m++;
            }
            else{
                // cout <<　"i: "　<< i <<　endl;
                // 不需要插入
                i++;
            }
        }

        if(j == n){
            // 全部插入完成
            return;
        }
        else{
            // nums1遍历结束，剩下的nums2全部插入后面
            cout << j << endl;
            while(j != n){
                nums1[i] = nums2[j];
                j++;
                i++;
            }
            return;
        }
    }
};

