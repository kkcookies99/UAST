 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {

        vector<int> nums3;
        double ans;

        while(!nums1.empty() && !nums2.empty()){
            if(nums1.back() < nums2.back()){
                nums3.push_back(nums2.back());
                nums2.pop_back();
            }
            else{
                nums3.push_back(nums1.back());
                nums1.pop_back();
            }
        }

        while(!nums1.empty()){
                nums3.push_back(nums1.back());
                nums1.pop_back();
        }

        while(!nums2.empty()){
            nums3.push_back(nums2.back());
                nums2.pop_back();
        }

        for(int i=0;i<nums3.size();i++){
            cout<<nums3[i]<<",";
        }

        cout<<endl;
        cout<<nums3.size();

        double x,y;

        if(nums3.size()%2!=0){
            x=y = nums3[nums3.size()/2];
        }
        else{
            x = nums3[nums3.size()/2];
            y = nums3[nums3.size()/2 -1 ];
        }


        ans = (x+y)/2;
        return ans;
    }
};

