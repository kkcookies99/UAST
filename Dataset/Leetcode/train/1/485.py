 class Solution:
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        numTwo=[]
        numsLessOrEqualThanHalfTarget=[i for i in nums if i<=target/2]
        numsGreaterThanHalfTarget=[i for i in nums if (i>target/2)]
        for i in numsLessOrEqualThanHalfTarget:
            for j in numsGreaterThanHalfTarget:
                if i+j==target:
                    numTwo=[i,j]
                    indexOfNumOne=nums.index(i)
                    numsAvailable=nums[0:indexOfNumOne]+nums[indexOfNumOne+1:]
                    indexOfNumTwo=numsAvailable.index(j)
                    if j in nums[0:indexOfNumOne]:
                        pass
                    else:
                        indexOfNumTwo+=1
                    if indexOfNumOne>indexOfNumTwo:
                        return [indexOfNumTwo,indexOfNumOne]
                    else:
                        return [indexOfNumOne,indexOfNumTwo]
        indexOfNumOne=nums.index(target/2)
        indexOfNumTwo=nums[indexOfNumOne+1:].index(target/2)+indexOfNumOne+1
        return [indexOfNumOne,indexOfNumTwo]

