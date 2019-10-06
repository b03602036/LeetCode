'''
15. 3Sum

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets
in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.
'''


#1100 ms, faster than 39.60%
def threeSum(nums):
    nums.sort()
    ans = []
    for i in range(len(nums) - 2):
        if nums[i] > 0:
            break
        if i > 0 and nums[i] == nums[i-1]:
            continue
        target = 0 - nums[i]
        a = i + 1
        b = len(nums) - 1
        while a < b:
            if nums[a] + nums[b] == target:
                l = [nums[a], nums[b], nums[i]]
                ans.append(l)
                a = a + 1
                while a < b and nums[a] == nums[a - 1]:
                    a = a + 1
            elif nums[a] + nums[b] > target:
                b -= 1
                if nums[b] == nums[b+1]:
                    b -= 1
            elif nums[a] + nums[b] < target:
                a += 1
                if nums[a] == nums[a-1]:
                    a += 1
    return ans

nu = [-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6]
print(threeSum(nu))