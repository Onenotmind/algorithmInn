/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  let numsMap = new Map()
  let res = []
  for (let i = 0; i < nums.length; i++) {
    numsMap.set(nums[i], i)
  }
  for (let i = 0; i < nums.length; i++) {
    let left = target - nums[i]
    // 判断map是否存在满足条件的值且不为自身(主要处理类似 nums=[3,3] target=6 情景)
    if (numsMap.get(left) && (numsMap.get(left) !== i)) {
      res = [i, numsMap.get(left)]
    }
  }
  return res
};