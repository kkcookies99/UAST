class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> map {{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};
        int ans = 0,flag=0;
        for(int i = 0;i<s.size()-1;i++){
            if(map[s[i]]<map[s[i+1]]) {
                ans+=(map[s[i+1]]-map[s[i]]);
                flag+=2;
                i++;
            }
            else {
                ans+=map[s[i]];
                flag++;
            }
        }
        if(s.size()==flag) {
            //cout<<"last 4 or 9";
            return ans;
        }
        //cout<<"last two 4 or 9";
        return ans+=map[s[s.size()-1]];
    }
};

//罗马数字转数字，从左向右遍历，同时查看当前位置的下一位所在字符如果遇到第一位小于第二位的，说明遇到“4”或者“9”，那么此时两位同时处理，否则就直接相加即可。

//用i记录字符串中遍历的位数，flag记录已经处理过的位数。处理，就是说将罗马文转换为数字了。

//最后，尾字符处理：处理一个“4”或者“9” 字符推进两位，处理一个其他字符，推进一位。如果最后已处理个数等于字符串长度( s.szie() )，说明最后一个处理的罗马文为“4”或者“9”( 即s.size()-2与s.size()-1位置的字符),此时所有字符都处理过了，可直接返回累计的ans；除此以外，说明倒数第二位字符是“4”或者“9” （即s.size()-3,s.size()-2位置的字符,，此时flag==sisize()-1）实际上最后一位没有处理到，而字符串最后一位一定是非“4”也非“9”的数字，因此直接累加后输出即可。

