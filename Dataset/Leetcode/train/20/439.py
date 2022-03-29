 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # while "()" in s or "[]" in s or "{}" in s:
        #     s = s.replace("()","").replace("[]","").replace("{}","")

        # return s == ""

        stk = []
        for i in s:
            if i in ["(","[","{"]:
                stk.append(i)
            try:
                if i ==")" :
                    if stk[-1]== "(":
                        stk.pop()
                    else:
                        return False
                if i =="]" :
                    if stk[-1] == "[":
                        stk.pop()
                    else:
                        return False
                if i =="}" :
                    if stk[-1] == "{":
                        stk.pop()
                    else:
                        return False
            except:
                return False

        return False if stk else True
    

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


