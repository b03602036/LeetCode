
class Solution:
    #14. Longest Common Prefix
    #60 ms, faster than 6.32%
    def longestCommonPrefix(strs):
        ans = ""
        if len(strs) == 0:
            return ans
        for i in range(len(strs[0])):
            cha = strs[0][i]
            ans += cha
            for j in range(1, len(strs)):
                if i >= len(strs[j]):
                    return ans[:-1]
                elif strs[j][i] != cha:
                    return ans[:-1]

        return ans
