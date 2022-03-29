 class Solution(object):
    def XXX(self, nums):
        ll = [[]]

        for x in xrange(len(nums)):
            tmp = []
            for l in ll:
                tmp.append(l+[nums[x]])
            ll.extend(tmp)
        return ll

