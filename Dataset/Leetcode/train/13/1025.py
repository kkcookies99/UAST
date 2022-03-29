 class Solution:
    def XXX(self, s: str) -> int:
        dics={"I":"1","V":"5","X":"10","L":"50","C":"100","D":"500","M":"1000"}
        s_len=len(s)
        result = 0
        i = 0
        while(i < len(s)):
            if(s[i] == "I"):
                if(s[i:i+2] == "IV"):
                    result = result + 4
                    i = i + 2
                elif(s[i:i+2] == "IX"):
                    result = result + 9
                    i = i + 2
                else:
                    result = result + int(dics[s[i]])
                    i = i + 1
            elif(s[i] == "X"):
                if(s[i:i+2] == "XL"):
                    result = result + 40
                    i = i + 2
                elif(s[i:i+2] == "XC"):
                    result = result + 90
                    i = i + 2
                else:
                    result = result + int(dics[s[i]])
                    i = i + 1
            elif(s[i] == "C"):
                if(s[i:i+2] == "CD"):
                    result = result + 400
                    i = i + 2
                elif(s[i:i+2] == "CM"):
                    result = result + 900
                    i = i + 2
                else:
                    result = result + int(dics[s[i]])
                    i = i + 1
            else:
                result = result + int(dics[s[i]])
                i = i + 1
        return result

