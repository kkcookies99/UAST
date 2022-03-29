 class Solution {
public:
    string XXX(vector<string>& strs) {
             int length = strs.size();
             if ( length == 0 ) return "";
             string ret = strs[0];
             for (int i =1 ; i < length ; ++i ) {
                 string st = strs[i] ;
                 int min_length = min(ret.length(),st.length());
                 int index = 0 ;
                 while(index<min_length) {
                     if (st[index]==ret[index]) {
                         ++index ;
                     } 
                     else {
                         break ;
                     }
                 }
                 ret = ret.substr(0,index);
                 if ( ret.length()== 0 ) return "" ;
             }
             return ret ;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


