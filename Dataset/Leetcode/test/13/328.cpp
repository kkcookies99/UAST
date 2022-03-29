class Solution {
public:
        int XXX(string s) {
                unordered_map<char,int> hashmap;
                hashmap['I']=1;
                hashmap['V']=5;
                hashmap['X']=10;
                hashmap['L']=50;
                hashmap['C']=100;
                hashmap['D']=500;
                hashmap['M']=1000;
                int flag=1;
                int sum=hashmap[s[s.length()-1]];
                for(int x=s.length()-1;x>0;x--){
                        if(hashmap[s[x]]>hashmap[s[x-1]]){
                                sum-=hashmap[s[x-1]];
                                flag=-1;
                        }
                        else if(hashmap[s[x]]<hashmap[s[x-1]]){
                                sum+=hashmap[s[x-1]];
                                flag=1;
                        }
                        else{
                                if(flag==1){
                                        sum+=hashmap[s[x-1]];
                                }
                                else{
                                        sum-=hashmap[s[x-1]];
                                }
                        }
                }
                return sum;
         }
};

