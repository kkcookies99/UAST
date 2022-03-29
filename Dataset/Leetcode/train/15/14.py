 class Solution(object):
    def XXX(self, nums):
        # 将nums分成三组：zeros，positives，negatives
        zeros, positives, negatives = 0, {}, {}
        for num in nums:
            if num == 0:
                zeros += 1
            elif num > 0:
                positives.setdefault(num, 0)
                positives[num] += 1
            else:
                negatives.setdefault(num, 0)
                negatives[num] += 1

        # 相加为0的三元组可能的组成形式：
        # 3个0，两个负数一个正数，两个正数一个负数，一正一负加一零
        results = []
        if zeros >= 3:
            results.append([0] * 3)
            
        if len(positives) != 0 and len(negatives) != 0:
            for pi in positives:
                count = positives[pi]
                if count >= 2 and (-2 * pi) in negatives:
                    results.append([pi] * 2 + [-2 * pi])
                if -pi in negatives and zeros > 0:
                    results.append([pi, -pi, 0])
                for pj in positives:
                    if pj <= pi:
                        continue
                    if -1 * (pi + pj) in negatives:
                        results.append([-1 * (pi + pj), pi, pj])
    
            for ni in negatives:
                count = negatives[ni]
                if count >= 2 and (-2 * ni) in positives:
                    results.append([ni] * 2 + [-2 * ni])
                for nj in negatives:
                    if nj <= ni:
                        continue
                    if -1 * (ni + nj) in positives:
                        results.append([-1 * (ni + nj), ni, nj])

        return results

