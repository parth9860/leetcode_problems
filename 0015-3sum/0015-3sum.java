import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {

                        List<Integer> temp = Arrays.asList(
                            nums[i], nums[j], nums[k]
                        );

                        Collections.sort(temp);

                        if (!result.contains(temp)) {
                            result.add(temp);
                        }
                    }
                }
            }
        }

        return result;
    }
}