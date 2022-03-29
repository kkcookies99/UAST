class Solution {
public:
    string XXX(int n) {
        if(n==1) return "1";
        string tmp=XXX(n-1);
        int i=0,count=0;
        char c=tmp[0];
        string a="";
        while(i<tmp.size())
        {
            if(tmp[i]==c) count++;
            else{
                a+=to_string(count)+c;
                c=tmp[i];
                count=1;
            }
            i++;
        }
        a+=to_string(count)+c;
        return a;
    } 
};

