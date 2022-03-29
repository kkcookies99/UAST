 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        res = ""
        roma_num = {
            0: '',
            1: 'I',
            5: 'V',
            10: 'X',
            50: 'L',
            100: 'C',
            500: 'D',
            1000: 'M',
        }
        flag = 0
        while(num):
            res_sub = ""
            value = num % 10
            num = num / 10
            if value == 5 or value == 0:
                res_sub = roma_num.get(value * (10 ** flag))
            elif 1 <= value <= 3:
                res_sub = roma_num.get(1 * (10 ** flag)) * value
            elif value == 4:
                res_sub = roma_num.get(1 * (10 ** flag)) + roma_num.get(5 * (10 ** flag))
            elif 6 <= value <= 8:
                res_sub = roma_num.get(5 * (10 ** flag)) + roma_num.get( 1 * (10 ** flag)) * (value - 5)
            elif value == 9:
                res_sub = roma_num.get( 1 * (10 ** flag)) + roma_num.get(10 * (10 ** flag))
            flag += 1
            res = res_sub + res
        return res

