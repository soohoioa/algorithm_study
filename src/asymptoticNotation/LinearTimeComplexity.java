package asymptoticNotation;

public class LinearTimeComplexity {
  // 선형 시간 복잡도

  public static void printItems(int n) {
    for (int i = 0; i < n; i++) { // O(n)
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    printItems(5);
  }

}
