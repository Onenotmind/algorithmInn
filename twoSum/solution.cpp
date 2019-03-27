#include<map>
#include<vector>
class Solution {
public:
  vector<int> twoSum(vector<int>& nums, int target) {
    map<int, int> numsMap;
    vector<int> res;
    for (int i = 0; i < nums.size(); i++) {
      int complement = target - nums[i];
      // 判断map是否存在满足条件的值且不为自身(主要处理类似 nums=[3,3] target=6 情景)
      if (numsMap.count(complement) && numsMap[complement] != i) {
          res.push_back(numsMap[complement]);
          res.push_back(i);
      }
      numsMap[nums[i]] = i;
    }
    return res;
  }
};