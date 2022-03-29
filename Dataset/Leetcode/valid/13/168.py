class Solution(object):
    def XXX(self, s):
        ret = 0
        biaoji = 1
        dic = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        for i in range(len(s)):
            if biaoji == 0:
                biaoji = 1
                continue
            if i == len(s)-1 or  dic[s[i]] >=  dic[s[i+1]]:
                ret += dic[s[i]]
            elif dic[s[i]] < dic[s[i+1]]:
                if biaoji == 1:
                    biaoji = 0
                ret += dic[s[i+1]]-dic[s[i]]
                if i == len(s)-2:
                    break
        return ret


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

