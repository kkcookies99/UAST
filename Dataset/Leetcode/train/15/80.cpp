 class Solution {
public:
    // 注意点: 三元组数据从小到大排列
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> back;
        //判断nums的元素个数，如果小于3个则将返回[]
        if(nums.size()<3){return back;}
        //将其排序
        sort(nums.begin(),nums.end());
        //排序后第一个元素如果大于1，则根本没有三元组
        //ptr
        for(int i=0;i<nums.size();i++){
            //去重情况 -1 -1 2
            //如果 找到了-1 -1  2,则遍历到第二个-1的时候已经灭有必要便利了，-1 X X,的情况已经在i-1位置
            //时找过了,则其就不用再找了
            if(i>0&&nums[i]==nums[i-1]){continue;}
            int left=i+1;
            int right=nums.size()-1;
            while(right>left){
                //三个数相加>0,则说明大了，i left right nums[i]+nums[left]已经是最小组合了，只能将right--
                if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                //如果三个数相加<0，则说明小了,则将其变大,left++,right已经是最大了,不能减了
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{//等于0
                    //输出答案
                    back.push_back(vector<int>{nums[i],nums[left],nums[right]});
                    //进行去重
                    //如果nums[left+1] 与 nums[left]相等 则没必要在跳到left+1位置,因为 {nums[i],nums[left],3-nums[i]-nums[left]}已经存在
                    while(right>left&&nums[left]==nums[left+1]){left++;}
                    //同理nums[right-1] 与 nums[right]相等 则没必要跳到right-1位置，因为{nums[i],nums[right],3-nums[right]}已存在
                    while(right>left&&nums[right]==nums[right-1]){right--;}
                    //此时left是刚才的nums[left]的最后一个nums[left]的下标了,即left++ 即可得到不同的nums[left]
                    //因为如果nums[left]重复的话，则三元组重复，因为一旦两个重复则第三个一定重复
                    //right同理
                    //双指针同时向中间会合
                    right--;
                    left++;
                }
            }
        }
        return back;
    }
};





undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

