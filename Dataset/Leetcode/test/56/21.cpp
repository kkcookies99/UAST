class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>>v(intervals);
        sort(v.begin(),v.end());
        int len=v.size();
        if(len==1)
        return v;
        vector<vector<int>>::iterator it=v.begin()+1;
        while(1)//不能用for，因为len会变 
        {
            if(*it->begin()<=*((it-1)->end()-1))//第二个区间左端点在前一个区间内部
            { 
                *((it-1)->end()-1)=max(*(it->end()-1),*((it-1)->end()-1));
                v.erase(it); 
            }  
            else //第二个区间全在右侧。
            it++;
            if(it==v.end())
            break;
        }
        return v;
    }
};

