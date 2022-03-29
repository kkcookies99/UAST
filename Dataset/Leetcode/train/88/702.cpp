 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int start = 0;
        for(int i = 0; i < n; i++) {
            int pos = m + i;
            for(int j = start; j < m+i; j++) {
                if(nums2[i] < nums1[j]) {
                    pos = j;//找到插入位置
                    break;
                }
            }
            //pos后面的元素移位
            int k = m+i;
            while(k > pos) {
                nums1[k] = nums1[k-1];
                k--;
            }
            nums1[pos] = nums2[i];
            start = pos;//下次从这里开始
        }
    }
};

