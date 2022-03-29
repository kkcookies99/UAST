 class Solution {
public:
    string XXX(int n) {
        return _XXX("1",1,n);
    }
    string _XXX(const string&str,int index,int n){
        if(index==n){
            return str;
        }
        int i=0,j=0;
        string nextStr="";
        while(str[i]){
            while(str[j]&&str[i]==str[j])j++;
            nextStr+=to_string(j-i);
            nextStr+=str[i];
            i=j;
        }
        return _XXX(nextStr,index+1,n);
    }
};

