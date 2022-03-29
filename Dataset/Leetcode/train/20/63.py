 class Solution:
    def XXX(self, s: str) -> bool:
        name_list = ['[]','()','{}']
        for name in name_list:
            if any (name in s for name in name_list):
                s=s.replace('()','')
                s=s.replace('[]','')
                s=s.replace('{}','')
                self.XXX(s) 
            else:
                return len(s)==0

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

