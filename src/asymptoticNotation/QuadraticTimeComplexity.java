package asymptoticNotation;

public class QuadraticTimeComplexity {
  // 이차 시간 복잡도

    public static void printPairs(int n) {
      for (int i = 0; i < n; i++) {         // O(n)
        for (int j = 0; j < n; j++) {     // O(n)
          System.out.println(i + ", " + j);
        }
      }
    }

    public static void main(String[] args) {
      printPairs(3);
    }

}
