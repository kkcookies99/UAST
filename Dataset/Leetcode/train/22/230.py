 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        #已放入的左括号数目至少要大于等于右括号
        #二叉树，一个字典存入每层树节点，另一个字典存入相对应每个节点的左括号个数
        #剪枝
        
        r_map = {1:['(']}
        count_map = {1:[1]}    #左括号个数字典
        layers = 2*n
        for i in range(2,layers+1):
            count = 0
            if i not in r_map:
                r_map[i] = []
                count_map[i] = []
            for item in r_map[i-1]:
                left_count = count_map[i-1][count]    #左括号个数
                right_count = i - left_count - 1     #右括号个数
                if left_count != n :
                    if left_count > right_count:
                        r_map[i].append(item+')')
                        count_map[i].append(left_count)
                        r_map[i].append(item+'(')
                        left_count += 1
                        count_map[i].append(left_count)
                        
                    else:
                        r_map[i].append(item+'(')
                        left_count += 1
                        count_map[i].append(left_count)
                else:
                    r_map[i].append(item+')')
                    count_map[i].append(left_count)
                count = count + 1
        
        return r_map[2*n]


