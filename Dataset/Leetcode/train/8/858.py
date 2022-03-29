 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        str = str.strip()
        if str == '':
            return 0
        if not (str[0] == '-' or str[0] == '+' or str[0].isdigit()):
            return 0
        aim = ''
        if str[0] == '-' or str[0] == '+' or str[0].isdigit():
            aim += str[0]
        for i in str[1:]:
            if not i.isdigit():
                break
            aim += i
        if aim == '' or aim =='-' or aim == '+':
            return 0
        aim = int(aim)
        if aim < -2 ** 31:
            return -2 ** 31
        if aim > 2 ** 31 - 1:
            return 2 ** 31 - 1
        return aim

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


