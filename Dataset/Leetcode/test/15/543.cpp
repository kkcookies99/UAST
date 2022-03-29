 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> v1;
        sort(nums.begin(), nums.end());     //排序以去重
        for(int i = 0; i < nums.size(); i++){   
            int left = i+1, right = nums.size()-1;  //左指针=i+1,右指针=size-1;
            if(i && nums[i] == nums[i-1]){          //第一次去重：保证不会因为i引起重复
                    continue;                       //比如 [-4,-1,-1,0,1,2]
                                                    //         ^  ^
                }                                   //        i  i+1
                                                    //在这种情况下，当遍历到i+1时会输出和i同样的结果{-1,0,1}
            while(left < right){
                if(nums[left] + nums[right] > -nums[i]){   
                    right--;
                }else if(nums[left] + nums[right] < -nums[i]){
                    left++;
                }else{
                    v1.push_back({nums[i],nums[left],nums[right]});
                    //第二次去重：确保在i不变时，不会让left和right在外层while循环中指向同样答案
                    while(left < right && nums[left] == nums[left+1]){
                        left++; //如果left和下一个left相同，指向下一个
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;    //同理
                    }
                    //两种情况，1.在left right收缩过程中没有重复，此时left和right相邻，再逼近一次以越界终止；
                    //        2.找到相同答案后他们都指向相同答案，再收缩一次进行下一个循环。
                    left++; 
                    right--;
                }
            }
        }
        return v1;
        
    }
};

