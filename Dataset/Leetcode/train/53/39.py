class Solution:
    def XXX(self, nums):
        c = nums[:] #对传入的列表nums进行浅拷贝,保留原来的数据
        for i in range(len(nums) - 1):
            if nums[i] > 0:
                nums[i + 1] += nums[i]
        a = max(nums)   #以上这一部分正是宝宝的求子列表和的最大值的方法,经过该方法后,nums的每一位数都是以原来列表对应位置上数为最后一位的所有子列表和的最大值
        b = [] #放入一个列表,存储所有最大值子列表
        for i in range(len(nums)):
            if nums[i] == a: #最大值是a,但是注意修改后的nums列表中可能不止一个最大值,对应原列表c,最大和的子列表可能不止一个
                for j in range(i-1, -1, -1): #从最大和值的位置的左边一位开始,从后往前遍历
                    if nums[j] < 0:
                        b.append(c[j+1:i+1]) #但凡修改后的nums中有值为负,那么最大和值子列表的左边界就是这个负值的右边一位,当然最大和值子列表的右边界就是修改后的nums的最大和值的位置
                        break # 如果有负值,跳出本for循环,不执行下面的else:语句
                else:
                    b.append(c[0:i+1]) #这里使用了 和 for循环和 break搭配的else:语句,它的规则为:从上到下,不论是否进入for循环或是for循环运行结束都顺序执行else里语句,只有一种情况,就是
                    #for循环里的break后不执行else:里的语句.
                    #在这里有两种情况会程序会进入这个语句:1.在原地修改后nums中第一位即索引为0的值就为最大和值(不论其列表长度就是1还是大于1),2.最大和值在修改后nums的后几位,且其前面没有负值,
                    #那其最大和子列表就是c[0:i+1]
        return b
#nums =[16,-100,1,3,4,8] #以下为几个测试列表nums
#nums =[1,3,4,8,-100,16]
#nums =[6]

