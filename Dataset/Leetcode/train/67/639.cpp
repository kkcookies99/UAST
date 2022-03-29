class Solution {
public:
    string XXX(string a, string b) {
        int alength = a.size(),blength = b.size(),add = 0,sum = 0;
        if(alength > blength) b.insert(0,alength - blength,'0');
        else a.insert(0,blength - alength,'0');
        string addup = "";
        for(int i = a.length()-1; i>=0; i--){
            sum = a[i] + b[i] - 96 + add;
            //搞不懂，为什么a[i]用static_cast来转换类型就得不到正确结果
            add = 0;
            if(sum > 1) sum = sum%2,add = 1;
            addup = to_string(sum) + addup;
        }
        if(add != 0) addup = "1" + addup;
        return addup;
    }
};

