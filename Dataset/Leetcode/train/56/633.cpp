 class Solution {
public:
    class cmp{
        public:
        bool operator()(vector<int> m,vector<int>n){
            return m[0]>n[0];
        }
    };
    
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()==0)return {};
        if(intervals.size()==1)return intervals;
        int n=intervals.size();
        priority_queue<vector<int>,vector<vector<int>>, cmp> PQ;
        for(int i=0;i<n;i++){
            PQ.push(intervals[i]);
        }
        for(int i=0;i<n;i++){
            intervals[i]=PQ.top();
            PQ.pop();
        }
        vector<vector<int>> V;
        stack<vector<int>> S;
        S.push(intervals[0]);
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=S.top()[1]){
                if(S.top()[1]<=intervals[i][1])S.top()[1]=intervals[i][1];
            }
            else S.push(intervals[i]);
        }
        while(!S.empty()){
            V.push_back(S.top());
            S.pop();
        }
        reverse(V.begin(),V.end());
        return V;
    }
};

