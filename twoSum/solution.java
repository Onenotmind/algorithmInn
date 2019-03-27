public int[] twoSum(int[] nums, int target) {
  Map<Integer, Integer> map = new HashMap<>();
  // 将元素存入map中
  for (int i = 0; i < nums.length; i++) {
    map.put(nums[i], i);
  }
  for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    // 判断map是否存在满足条件的值
    if (map.containsKey(complement) && map.get(complement) != i) {
      return new int[] { i, map.get(complement) };
    }
  }
  throw new IllegalArgumentException("No two sum solution");
}