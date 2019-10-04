# 1. Two Sum

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        numMap = dict()
        for i in range(n):
            if numMap.__contains__(target - nums[i]):
                return [i, numMap.get(target - nums[i])]
            else:
                numMap[nums[i]] = i

