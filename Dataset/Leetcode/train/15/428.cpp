 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        map<int ,int>mp;
        vector<vector<int> >res;
        set<vector<int> >sss;
        set<int> ss;
            sort(nums.begin(),nums.end());
            if(nums.size()<3||nums[0]>0)return res;
            if(!nums[0]&&!nums[nums.size()-1]){
                vector<int>tmp={0,0,0};
                res.push_back(tmp); 
                return res;
            }
            for(auto it=nums.begin();it!=nums.end();it++){
                mp[*it]++;
                ss.insert(*it);
            }
            for(auto it1=ss.begin();it1!=ss.end();it1++){
                if(*it1>0)return res;
                mp[*it1]--;
                for(auto it2=it1;it2!=ss.end();it2++){
                    if((!mp[*it2])||*it1+*it2>0)continue;
                    mp[*it2]--;
                    if(mp[-(*it1+*it2)]>0){
                        vector<int>tmp={*it1,*it2,-(*it1+*it2)};
                        sort(tmp.begin(),tmp.end());
                        if(!sss.count(tmp)){
                            res.push_back(tmp); 
                            sss.insert(tmp);
                        }
                    }
                    mp[*it2]++;
                }
                mp[*it1]++;
            }
            return res;
    }
};

