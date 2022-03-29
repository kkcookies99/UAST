 class Solution(object):
    def XXX(self, num)：
        dict1  = {'1':'I', '4':'IV', '5': 'V', '9':'IX', '10':'X', '40': 'XL', '50':'L', '90': 'XC', '100': 'C',
        '400': 'CD', '500': 'D', '900':'CM', '1000': 'M'
        }
        result = ''
        while num > 0:
            if num >= 1000:
                num -= 1000
                result+=dict1['1000']
                continue
            if num >= 900:
                num -= 900
                result += dict1['900']
                continue
            if num >= 500:
                num -= 500
                result += dict1['500']
                continue
            if num >= 400:
                num -= 400
                result += dict1['400']
                continue
            if num >= 100:
                num -= 100
                result += dict1['100']
                continue
            if num >= 90:
                num -= 90
                result += dict1['90']
                continue
            if num >= 50:
                num -= 50
                result += dict1['50']
                continue
            if num >= 40:
                num -= 40
                result += dict1['40']
                continue
            if num >= 10:
                num -= 10
                result += dict1['10']
                continue
            if num >= 9:
                num -= 9
                result += dict1['9']
                continue
            if num >= 5:
                num -= 5
                result += dict1['5']
                continue
            if num >= 4:
                num -= 4
                result += dict1['4']
                continue
            if num >= 1:
                num -= 1
                result += dict1['1']
                continue
        return result
            
            
            
            
            


