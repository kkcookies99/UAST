 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& inter) {
        sort(inter.begin(),inter.end());
        deque<int> s;
        vector<int> in;
        for(auto k:inter){
            for(auto kk:k){
                in.push_back(kk);
            }
        }
        for(int i=0;i<in.size();){
            if(i+2<in.size()){
                if(in[i]==in[i+2]){
                    if(i%2==0){
                        in.erase(in.begin()+i);
                        in.erase(in.begin()+i);
                    }
                    else{
                        in.erase(in.begin()+i+1);
                        in.erase(in.begin()+i+1);
                    }
                }
                else i++;
            }
            else i++;
        }
        for(int i=0;i<in.size();i++){
            if(s.empty()||in[s.back()]<in[i]) {
                if(!s.empty()&&s.back()%2==1 &&i%2==1) s.pop_back();
                s.push_back(i);
                }
               	else if (!s.empty() && in[s.back()] == in[i]) {
				if(i%2==0)
				s.pop_back();
				else {
					if (s.back() % 2 == 1) s.pop_back();
					s.push_back(i);
				}
			}
        }
        vector<vector<int>> v;
        while(!s.empty()){
            auto k=s.front();
            s.pop_front();
            auto l=s.front();
            s.pop_front();
            v.push_back({in[k],in[l]});

        }
        return  v;
    }
};

