 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()==1){
            return intervals;
        }
        // 先将intervals按第一元素排序 由于可合并区间一定连续
        sort(intervals.begin(),intervals.end());
        vector<vector<int> > XXX;
        for(int i=0;i<intervals.size();i++){
            //定义元组的左端点和右端点
            int L=intervals[i][0];
            int R=intervals[i][1];
            // 如果XXX为空，就将第一个元组放入XXX
            // 不为空，即XXX里有元组，就将尾元组和目前遍历到的元组进行对比
            // 若XXX尾元组左端点小于L，即无重叠，则将当前所遍历到的元组整个加入XXX
            if(!XXX.size()||XXX.back()[1]<L){
                XXX.push_back({L,R});
                
            }else{
                // 若不小于，即大于等于，则有重叠：将区间合并：即将XXX尾元组右端点改为当前遍历元组的右端点，即实现了区间合并
                XXX.back()[1]=max(XXX.back()[1],R);
            }
        }
        return XXX;
    }
};

