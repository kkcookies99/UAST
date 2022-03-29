 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if (m == 0){ // 数组1为空
            for (int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
        }
        if (n == 0) return; // 数组2为空
        vector<int> temp;
        int n1 = 0, n2 = 0;
        for (int k=0; k < m+n;k++){
            // 防止越界 要先比较 后使用！！！！
            if (n1 < m && n2 <n){
                if (nums1[n1] <= nums2[n2]){ // 第一个数组的数更小，且为循环完
                    temp.push_back(nums1[n1]);
                    n1++;
                }else{
                    temp.push_back(nums2[n2]);
                    n2++;
                }
            }else if (n1 >= m){ // 第一个数组循环完了
                temp.push_back(nums2[n2]);
                n2++;
            }else if (n2 >= n){
                temp.push_back(nums1[n1]);
                n1++;
            }
            
        }
        for (int t = 0; t < m+n; t++){
            nums1[t] = temp[t];
        }
    }
};

