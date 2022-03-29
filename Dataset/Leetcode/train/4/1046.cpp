 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size();
        int n2 = nums2.size();
        int n = n1 + n2;

        vector<int> ans(n, 0);
        double res;
        int i = 0, j = 0, k = 0;

        for (; k <= n/2; k ++){
            if (i < n1 && j < n2){//两个数组都没有搜索到头
                if (nums1[i] < nums2[j]){
                    ans[k] = nums1[i++];
                }
                else{
                    ans[k] = nums2[j++];
                }
            }
            else if (i == n1 && j < n2){//数组1到头
                ans[k] = nums2[j++];
            }
            else if (i < n1 && j == n2){//数组2到头
                 ans[k] = nums1[i++];
            }
        }
        //k最后多加1，再减去
        k-=1;
        //总数为奇数时，直接输出；偶数时，取平均
        if (n % 2)
            res = ans[k];
        else
            res = (ans[k] + ans[k-1]) / 2.0;
        //输出结果
        return res;
    }
};

