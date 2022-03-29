 class Solution:
    def XXX(self, s: str) -> int:
        long_str = '' #记录字符串
        longest_str_len = 0 #记录最长字符串的长度
        for i in s: #循环数组
            if i not in long_str: #如果元素i不在long_str,那么long_str就加上元素i
                long_str += i 
            else: #如果元素i在long_str中
                if len(long_str) > longest_str_len:
                    longest_str_len = len(long_str) #若记录的字符串的长度大于最长长度，则替换最大长度
                long_str = long_str.split(i)[1] + i 
                #因为遇到了重复元素，所以重置long_str,重置以元素i切片，比如'abc'以'a'切片的结果是['','bc'],这样的目的是去除重复元素
        if len(long_str) > longest_str_len:
            longest_str_len = len(long_str)
        return longest_str_len
        # 时间复杂度为n，空间复杂度为1

