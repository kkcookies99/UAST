 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()==1) return intervals;
        int size=intervals.size();
        //对intervals进行排序，使得较小的元素排在前面
        sort(intervals.begin(),intervals.end(),[](vector<int>&a,vector<int>&b){return a[0]<b[0]||(a[0]==b[0]&&a[1]<b[1]);});
        int n=0;
        vector<vector<int>> result;

        while(size>n){
            vector<int> temp=intervals[n];
            int i=0;
            //对目前的元素进行合并,若不可以合并，则直接break，压入result
            //break时，此时跳出的i为temp初始时n的值；因为break时，此时的intervals[i]无法和当前的temp合并，则应作为下一个入口
            for(i=n+1;i<size;i++){
                if(temp[1]>=intervals[i][0]){
                    temp[1]=max(temp[1],intervals[i][1]);
                }
                else{
                    break;
                }
            }
            result.push_back(temp);

            temp.clear();
            n=i;
        }
        return result;

    }
};

