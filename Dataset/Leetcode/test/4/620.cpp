 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int> cacheBuf;
        auto num1Prt = nums1.begin();
        auto num2Prt = nums2.begin();
        
        unsigned int num1Size = nums1.size();
        unsigned int num2Size = nums2.size();

        while(num1Prt != nums1.end() || num2Prt != nums2.end())
        {
            if(num1Prt != nums1.end() && num2Prt != nums2.end())
            {
                if(*num1Prt<*num2Prt)
                {
                    //cacheBuf.push_back(*num1Prt);
                    goto push_num1;
                }else{
                    goto push_num2;
                    //cacheBuf.push_back(*num2Prt);
                }
            }else if(num1Prt != nums1.end())
            {
                goto push_num1;
                //cacheBuf.push_back(*num1Prt);
            }else 
            {
                goto push_num2;
                //cacheBuf.push_back(*num2Prt);
            }
        push_num1:
            cacheBuf.push_back(*num1Prt);
            num1Prt++;
            continue;
        push_num2:
            cacheBuf.push_back(*num2Prt);
            num2Prt++;
            continue;
        }

        if((num1Size+num2Size)%2 != 0) //奇数
        {
            return cacheBuf[(num1Size+num2Size)/2];
        }else   //偶数
        {
            return ((double)cacheBuf[(num1Size+num2Size)/2]+(double)cacheBuf[(num1Size+num2Size)/2-1])/2;
        }
    }
};

