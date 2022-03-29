 class Solution {
public:
    string CommonPrefix(string left,string right)
    {
        int len=min(left.size(),right.size()),i=0;
        while(i<len && left[i]==right[i])i++;
        return left.substr(0,i);
    }
    string getCommonPrefix(vector<string>& strs,int low,int high)
    {
        if(low==high)
            return strs[low];
        int mid=(low+high)/2;
        string leftprefix=getCommonPrefix(strs,low,mid);
        string rightprefix=getCommonPrefix(strs,mid+1,high);
        return CommonPrefix(leftprefix,rightprefix);
    }
    string XXX(vector<string>& strs) {
        if(strs.size()==0)
            return "";
        return getCommonPrefix(strs,0,strs.size()-1);
    }
};

