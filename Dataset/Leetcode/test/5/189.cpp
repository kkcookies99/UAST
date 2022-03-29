class Solution {
public:
    string XXX(string s) {
        vector<vector<bool>> v;
        v.resize(s.length()+2,vector<bool>(s.length()+1));
        getReg(s,v);
        int start = 0;
        int cnt = getMaxLenFromRightUpToLeftDown(v,s.length(),start);
        string str(s,start-1,cnt);
        return str;
    }
    void getReg(string s ,vector<vector<bool>> & v){
        string s1(s);
        reverse(s.begin(),s.end());
        string s2(s);
        int len = s.length();
        for( int i = 0 ; i < len ; i ++ ){
            for( int j = 0 ; j < len ; j ++ ){
                v[i+1][j+1]=(s1[i]==s2[j]);
            }
        } 
    }
    int getMaxLenFromRightUpToLeftDown(vector<vector<bool>> & v , int len,int & start){
        int max_cnt = 0 ;
        for( int i = 1 ; i <= len && max_cnt <= len - i ; i ++ ){
            for( int j = 1 ; j <= len && max_cnt <= len - j  ; j ++ ){
                int cnt = 0;
                if(v[i][j]){
                    addNumber(v,i,j,len,cnt);
                    if( max_cnt < cnt ){
                        if( cnt % 2 ? (i + (int)(cnt / 2) + j + (int)(cnt / 2 ) != len + 1 ) : (i + (int)(cnt / 2) + j + (int)(cnt / 2 ) != len + 2)  )
                        {
                            int tmp_cnt = 0 ;
                            confirm( v,i+cnt-1,j,len,tmp_cnt);
                            if( cnt != tmp_cnt) {
                                continue;
                            }
                        }
                        max_cnt = cnt;
                        start = i;
                    }
                }
            }
        }
        return max_cnt;
    }
    void addNumber(vector<vector<bool>> & v , int i,int j,int len, int & cnt){
        if( i > len || j > len || !v[i][j]){
            return;
        }
        cnt += v[i][j]?1:0;
        addNumber(v,i+1,j+1,len,cnt);
    }
    void confirm(vector<vector<bool>> & v , int i,int j,int len, int & cnt){
        if( i <= 1 || j > len || !v[i][j] ){
            return ;
        }
        cnt += v[i][j]?1:0;
        confirm(v,i-1,j+1,len,cnt);
    }
};


int main(){
    Solution a ;
    {
        string str = "aacabdkacaa";
        cout << a.XXX(str) << endl;
    }
    {
        string str = "bb";
        cout << a.XXX(str) << endl;
    }
    {
        string str = "ccd";
        cout << a.XXX(str) << endl;
    }
    {
        clock_t   start,   finish;
        start =clock(); 
        string str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        cout << a.XXX(str) << endl;
        finish = clock();
        cout << (finish - start ) << endl;
    }
    {
        clock_t   start,   finish;
        start =clock(); 
        string str = "borcdubqiupahpwjizjjbkncelfazeqynfbrnzuvbhjnyvrlkdyfyjjxnprfocrmisugizsgvhszooktdwhehojbrdbtgkiwkhpfjfcstwcajiuediebdhukqnroxbgtvottummbypokdljjvnthcbesoyigscekrqswdpalnjnhcnqrarxuufzzmkwizptyvjhpfidgmskuaggtpxqisdlyloznkarxofzeeyvteynluofuhbllyiszszbwnsglqjkignusarxsjvctpgiwnhdufmfpanfwxjwlmhgllzsmdpncbwnsbdtsvrjybynifywkulqnzprcxockbhrhvnwxrkvwumyieazclcviumvormynbryaziijpdinwatwqppamfiqfiojgwkvfzyxadyfjrgmtttvlgkqghgbcfhkigfojjkhskzenlpasyozcsuccdxhulcubsgomvcrbqwakrraesfifecmoztayrdjicypakrrneulfbqqxtrdelggedvloebqaztmfyfkhuonrognejxpesmwgnmnnnamvkxqvzrgzdqtvuhccryeowywmbixktnkqnwzlzfvloyqcageugmjqihyjxhssmhkfzxpzxmgpjgsduogfolnkkqizitbvvgrkczmojxnabruwwzxxqcevdwvtiigwckpxnnxxxdhxpgomncttjutrsvyrqcfwxhexhaguddkiesmfrqfjfdaqbkeqinwicphktffuwcazlmerdhraufbpcznbuipmymipxbsdhuesmcwnkdvilqbnkaglloswcpqzdggnhjdkkumfuzihilrpcvemwllicoqiugobhrwdxtoefynqmccamhdtxujfudbglmiwqklriolqfkknbmindxtljulnxhipsieyohnczddabrxzjmompbtnnxvivmoyfzfrxlufowtqzojfclmatthjtbhotdoheusnpirwicbtyrcuojsdmfcx";
        cout << a.XXX(str) << endl;
        finish = clock();
        cout << (finish - start ) << endl;
    }
}

