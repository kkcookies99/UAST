 class Solution:
    # 纳尼   这题为毛是位运算   菜狗子不理解
    ## 看解题  异或  操作  也太骚了！
    ## 异或 运算性质
    """
    a^0 = a
    a^a = 0

    同时 ^ 满足  交换律和结合律

    注意题目中重复元素次数是 两次  （或者偶次） 才可以用异或的解法
    """
    def singleNumber(self, nums: List[int]) -> int:

        return reduce(lambda x,y: x^y,nums)
        # reduce 函数  传入函数表达式 迭代对象
        # 利用循环是一样的

