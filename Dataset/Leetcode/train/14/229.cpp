 class Solution {
public:
string XXX_pre(string strs[],int start,int end) {
//    if(start>end)
//        return "";
    if(start==end)
        return strs[start];
    int nums=(end-start)/2;
    
    
    string a=XXX_pre(strs,start,start+nums);
    string b=XXX_pre(strs,start+nums+1,end);
    
    int asize=a.size();
    int bsize=b.size();
    string res="";
    int minsize=(asize<bsize)? asize:bsize;
    for(int i=0;i<minsize;i++){
        if(a[i]==b[i])
            res+=a[i];
        else
            return res;
    }
    return res;
    
}

string XXX(vector<string>& strs) {
    if(strs.size()==0)
        return "";
    string a[strs.size()];
    for(int i=0;i<strs.size();i++){
        a[i]=strs[i];
    }
    return XXX_pre(a,0,strs.size()-1);

}
};

