 class Solution:
    def XXX(self, s: str) -> str: 
        size = s.__len__();
        if (size <= 1):
              return s;
        leftStr = findStr = "";
        for index1 in range(size):
            leftStr=s[index1]+leftStr;
            leftLen = leftStr.__len__();
            for index2 in range(leftLen):
                if ((leftLen-index2) <= findStr.__len__()):
                    break;
                if(s[index2:leftLen] == leftStr[0:leftLen-index2]):
                    findStr = s[index2:leftLen];
                    break;
        return  findStr;

