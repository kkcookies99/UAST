 class Solution:
    def XXX(self, s: str) -> int:
        work_list = []
        work_len = 0

        # 以空格分割字符串，如果不存在空格则将原数组追加到列表中
        work_list = s.split(" ")
        # 列表倒置
        work_list.reverse()

        # 不是空格且长度大于0,求最后一个单词长度
        for i in work_list:
            if i != " " and len(i)>0:
                work_len = len(i)
                break
                    
        # 返回最后一个单词的长度
        return work_len

