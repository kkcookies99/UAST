class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        ans = 0
        flag = 0
        space_flag = 0
        num_flag = 0
        for i in str:
            if i == ' ' and not num_flag and not flag:
                space_flag = 1
                continue
            elif i in '+-' and not ans and not flag:
                if str.index(i) != 0 and space_flag == 0 :
                    break
                else: 
                    flag = (1 if i =='+' else -1)
            elif i.isdigit():
                ans = ans * 10 + int(i)
                num_flag = 1
            else:
                break
        if not ans:
            return 0
        ans =  ans*-1 if flag == -1 else ans
        return max(min(ans,2**31-1),-2**31)

