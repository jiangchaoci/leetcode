#
# @lc app=leetcode.cn id=1475 lang=python3
#
# [1475] 商品折扣后的最终价格
#

# @lc code=start
class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        res = [0] * len(prices)
        for i in range(len(prices)):
            res[i] = prices[i]
            for j in range(i+1, len(prices)):
                if prices[j] <= prices[i]:
                    res[i] -= prices[j]
                    break
        return res
# @lc code=end

