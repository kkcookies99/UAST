 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)return s;
        int group=numRows*2-2;
        int acol=group-numRows+1;
        int numCols=s.length()/group*(group-numRows+1);
        numCols=numCols*acol;
        if(s.length()%group/numRows==1){
            numCols=numCols+1+s.length()%group%numRows;
        }
        else{
            numCols=numCols+1;
        }
        char** str=new char*[numRows];
        for(int i=0;i<numRows;i++)str[i]=new char[numCols];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                str[i][j]=0;
            }
        }
        for(int i=0;i<s.length();i++){
            if((i+1)%group<=numRows&&(i+1)%group>0){
                str[(i+1)%group-1][(i+1)/group*acol]=s[i];
            }
            else{
                int ind=(i+1)%group;
                if(ind==0)ind=group;
                int hang=numRows-1-ind+numRows;
                int lie=ind-numRows+((i)/(group))*acol;
                str[hang][lie]=s[i];
            }
        }
        string end="";
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                if(str[i][j]!=0){
                    end=end+str[i][j];
                }
            }
        }
        return end;
    }
};

