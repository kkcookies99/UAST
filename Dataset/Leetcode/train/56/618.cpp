 class Solution {
public:
    //先将二维数组按照左区间递增排序
    //分区操作
    int partition(vector<vector<int> > &nums,int start,int end){
        int i=start,j=end,pivot=nums[start][0];
        while(i<j){
            while(nums[i][0]<=pivot&&i<j){
                i++;
            }
            while(nums[j][0]>pivot){
                j--;
            }
            if(i<j&&nums[i][0]>nums[j][0]){
                swap(nums[i],nums[j]);
            }
        }
        swap(nums[j],nums[start]);
        return j;
    }
    void QSort(vector<vector<int> > &nums){
        //1.堆栈初始化
        stack<int> s;
        //2.快排数据初始
        int start=0,end=nums.size()-1,pivot;
        s.push(end);
        s.push(start);
        while(!s.empty()){
            start=s.top();
            s.pop();
            end=s.top();
            s.pop();
            if(start<end){
                pivot=partition(nums,start,end);
                if(start<pivot){
                    s.push(pivot-1);
                    s.push(start);
                }
                if(pivot<end){
                    s.push(end);
                    s.push(pivot+1);
                }
            }
        }
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()<=1)return intervals;
        QSort(intervals);
        vector<vector<int> > ans;
        for(int i=0;i<intervals.size()-1;i++){
            if(intervals[i+1][0]<=intervals[i][1]){//[a,b][c,d]满足条件c<b，开始合并
                if(intervals[i][1]>=intervals[i+1][1]){//情况1.b>=d 合并为[a,b]
                    intervals[i+1]=intervals[i];
                }
                else{//情况2.b>d 合并为[a,d]
                    intervals[i+1]={intervals[i][0],intervals[i+1][1]};
                    }
            }
            else{//不能合并，将区间保存进答案数组
                ans.push_back(intervals[i]);
                
            }
             if(i==intervals.size()-2){//最后一个区间记得加入，因为每次更新的都是intervals[i+1]
                    ans.push_back(intervals[i+1]);
                }
        }
        return ans;
    }
};

