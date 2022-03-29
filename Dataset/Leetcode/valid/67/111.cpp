 class Solution {
public:
    string XXX(string a, string b) {
        int cnt = 0;
        int tmpsum = 0;
        int add = 0;
        string res;
        int alen = a.size();
        int blen = b.size();
        for(int ia = alen - 1,ib = blen -1;ia >= 0||ib >= 0;ia--,ib--){
            int ac = (ia >= 0 )?(a[ia]-'0'):0;
            int bc = (ib >= 0 )?(b[ib]-'0'):0;
            tmpsum = ac + bc+ cnt;
            cnt = tmpsum / 2;
            add = tmpsum % 2;
            char s = add + '0';
            res.insert(res.begin(),1,s);
        }
        if(cnt==1){
            res.insert(res.begin(),1,'1');
        }
        	//reverse(res.begin(), res.end());
        return res;
    }
};

