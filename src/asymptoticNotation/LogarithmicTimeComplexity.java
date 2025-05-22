package asymptoticNotation;

public class LogarithmicTimeComplexity {
  // 로그 시간 복잡도 - 이진 탐색

    public static int binarySearch(int[] arr, int target) {
      int left = 0;
      int right = arr.length - 1;

      while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
          return mid; // 찾음
        } else if (arr[mid] < target) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
      return -1; // 못 찾음
    }

    public static void main(String[] args) {
      int[] nums = {1, 3, 5, 7, 9, 11};
      System.out.println(binarySearch(nums, 7)); // 출력: 3
    }

}
