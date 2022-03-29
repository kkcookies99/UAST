 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int>arr(nums1.size() + nums2.size(), 0);
        int i = 0, j = 0, index = 0;
        while(i < nums1.size() || j < nums2.size()){
            if(i >= nums1.size()){
                arr[index] = nums2[j];
                index++;
                j++;
            }
            else if(j >= nums2.size()){
                arr[index] = nums1[i];
                i++;
                index++;
            }
            else{
                if(nums1[i] > nums2[j]){
                    arr[index] = nums2[j];
                    j++;
                    index++;
                }
                else{
                    arr[index] = nums1[i];
                    i++;index++;
                }
            }
        }
        double res = 0.0;
        if(arr.size() & 1)
            res = (double) arr[arr.size() / 2];
        else{
            res = (arr[arr.size() / 2 - 1] + arr[arr.size() / 2]) / (2 + 0.0);
        }
        return res;
    }
};

