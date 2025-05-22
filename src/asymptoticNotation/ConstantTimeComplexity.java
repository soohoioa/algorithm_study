package asymptoticNotation;

public class ConstantTimeComplexity {
  // 상수 시간 복잡도
  
    public static void printFirstItem(int[] arr) {
      System.out.println(arr[0]); // 항상 한 번만 실행됨 → O(1)
    }

    public static void main(String[] args) {
      int[] nums = {10, 20, 30, 40};
      printFirstItem(nums);
    }


}
