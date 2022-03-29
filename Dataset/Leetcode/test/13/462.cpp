 class Solution {
public:
    int XXX(string s) {
        unordered_map<string,int> mp={{"I",1},{"IV",4},{"V",5},{"IX",9},{"X",10},{"XL",40},{"L",50},{"XC",90},{"C",100},{"CD",400},{"D",500},{"CM",900},{"M",1000}};
        int ans=0;
        int i=0;
        string str;
        while(i<s.size()){
            if(i<s.size()-1){
                str=s.substr(i,2);
                if(mp.count(str)){
                    ans+=mp[str];
                    i+=2;
                }
                else{
                    str=s.substr(i,1);
                    ans+=mp[str];
                    i++;
                }
            }
            else{
                str=s.substr(i,1);
                    ans+=mp[str];
                    i++;
            }
        }
        return ans;
    }
};

