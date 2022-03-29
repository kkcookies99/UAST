 class Solution:
    def XXX(self, s: str) -> bool:
        kuohao = {'(':')','{':'}','[':']'}
        ss=[]
        for i in s:
            if i in ['(','{','[']:
                ss.insert(len(ss),i)
            if i in [')','}',']']:
                if ss:
                    p=ss.pop()
                    if i!=kuohao[p]:
                        return False
                else:
                    return False

        if ss==[]:
            return True
        else:
            return False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

