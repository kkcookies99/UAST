 class Solution {
public:
    string XXX(string s, int numRows) {
        int line=numRows,single=line==1?1:2*line-2,groupnum=s.size()/single+1;
        string res;
        for(int lineindex=0;lineindex<line;lineindex++){
            for(int gpindex=0;gpindex<groupnum;gpindex++){
                int first=-1,second=-1;
                bool first_en=true,second_en=true;
                if(lineindex==0||lineindex==line-1) second_en=false;
                first=gpindex*single+lineindex;
                first_en= first < s.size();
                if(second_en)second=2*(gpindex*single+line-1)-first;
                second_en=second<s.size();
                if(first_en) res+=s[first];
                if(second_en) res+=s[second];
            }
        }
    return res;
    }
};

