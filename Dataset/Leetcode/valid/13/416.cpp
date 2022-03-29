 class Solution {
public:
    int XXX(string s) {
       int Result=0;
       unordered_map<string,int> Hash={{"I",1},{"IV",4},{"V",5},{"IX",9},{"X",10},{"XL",40},{"L",50},{"XC",90},{"C",100},{"CD",400},{"D",500},{"CM",900},{"M",1000}};
       int n=static_cast<int>(s.size());
       for(int i=0;i<n;++i){
           if(Hash.find(s.substr(i,2))!=Hash.end()){
               Result+=Hash[s.substr(i,2)];
               i++;
           }else{
               Result+=Hash[s.substr(i,1)];
           }
        }
        return Result;
    }
};

