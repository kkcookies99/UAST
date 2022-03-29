 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        dic = {0:'', 1:'I', 5:'V', 10:'X', 50:'L', 100:'C', 500:'D', 1000:'M'}

        rate = 1
        number = num
        result = ''
        while number !=0:
            cur_num = number%10
            if cur_num < 4:
                result += dic[rate]*cur_num
            elif cur_num == 4:
                result += dic[rate*5]
                result += dic[rate]
            elif cur_num == 5:
                result += dic[rate*5]
            elif cur_num<9:
                result += dic[rate]*(cur_num-5)
                result += dic[rate*5]
            else:
                result += dic[rate*10]
                result += dic[rate]
            number = number//10
            rate *= 10

        return result[::-1]

