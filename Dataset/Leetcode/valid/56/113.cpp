 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
vector<vector<int>> res,tmp;
map<int,vector<int>> MAP0;
bool flag=true;
for(int i=0;i<intervals.size();i++){
    if(MAP0.find(intervals[i][0])!=MAP0.end()) 
     MAP0[intervals[i][0]][1]=MAP0[intervals[i][0]][1]> intervals[i][1]?MAP0[intervals[i][0]][1]:intervals[i][1];
    else MAP0[intervals[i][0]]=intervals[i];}
for(auto it: MAP0) tmp.push_back(it.second);
map<int,vector<int>> MAP1;
MAP1[tmp[0][0]]=tmp[0];
for(int i=1;i<tmp.size();i++){
    flag=false;
    for(auto it=MAP1.begin();it!=MAP1.end();it++){ 
        if(tmp[i][0]>=it->second[0]&&tmp[i][0]<=it->second[1])
       { it->second[1]=it->second[1]>tmp[i][1]?it->second[1]:tmp[i][1];flag=true;break;}
        else if(tmp[i][1]>=it->second[0]&&tmp[i][1]<=it->second[1])
       {it->second[0]=it->second[0]<tmp[i][0]?it->second[0]:tmp[i][0];flag=true;break;}
        }   
   if(flag==false) MAP1[tmp[i][0]]=tmp[i];
}
for(auto it: MAP1) res.push_back(it.second);
return res;
    }
};

