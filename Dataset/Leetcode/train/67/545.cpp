class Solution {
public:
string XXX(string a, string b) {
    int t = b.size()-1;
    if(b.size()>a.size()) return XXX(b,a);
    for(int i = a.size()-1;i>=0;i--){
        if(t>=0)a[i] = a[i]+b[t]-'0';
        if(a[i]>'1'){
            a[i]-=2;
            if(i!=0) a[i-1]+=1;
            else a.insert(a.begin(),'1');
        }
        t--;
    }
    return a;
}
};

