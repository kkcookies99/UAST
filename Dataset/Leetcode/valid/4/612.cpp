 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> test;
        test = nums1;
        double number;
        for(int i = 0;i < nums2.size();i++){
            test.push_back(nums2[i]);
        }
        
        for(int i = 0;i < test.size();i++){
            for(int j = 0;j < test.size()-i-1;j++){
                if(test[j] > test[j+1]){
                    int temp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = temp;
                }
            }
        }
        if(test.size()%2 == 0){
            number =0.5*(test[test.size()/2]+test[test.size()/2-1]);
        }else{
            number = test[test.size()/2];
        }
        return number;
    }
};

