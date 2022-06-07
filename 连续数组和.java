package ouyang.empty.demo;

public class MainTest {
  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 1; i < nums.length; i++) {
      nums[i] = i;
    }
    int sum = 6;
    int[] result = new int[1];
    for (int i = 0; i < nums.length; i++) {
      huisu(i, nums, sum, result);
    }
    System.out.println(result[0]);
  }

  // 0 1 2 3 5 6 7 8   5
  private static void huisu(int i, int[] nums, int sum, int[] result) {
    int tempsum = nums[i];
    if (tempsum == sum) {
      result[0] = Math.max(1, result[0]);;
      return;
    } else if (tempsum > sum) {
      return;
    }
    for (int j = i+1; j < nums.length; j++) {
      if (nums[j] - nums[j-1] == 1) {
        tempsum = tempsum + nums[j];
        if (tempsum == sum) {
          result[0] = Math.max(j - i + 1, result[0]);
        } else if (tempsum > sum) {
          return;
        }
      } else {
        return;
      }
    }
  }
}
