class Solution:
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        str=str.strip()
        flag = ''
        if len(str)==0:
            return 0
        if len(str)==1:
            if '9'>=str>='0':
                return int(str)
            else:
                return 0
        if str[0] in '-+':
            flag=str[0]
            str=str[1:]
        result = ''
        for i in str:
            if '9'>=i>='0':
                result+=i
            else:
                break
        if result=='':
            return 0 
        else:
            result = flag+result
        if -2**31<=int(result)<=2**31-1:
            return int(result)
        elif flag == '-':
            return -2**31
        else:
            return 2**31-1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

