import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] unit = {10000, 5000, 1000, 500, 100, 50, 10};
    int[] num = new int[unit.length];
    int total = 37890;
    for(int i=0; i<unit.length; i++) { 
      num[i] = total/unit[i];       
      total %= unit[i];   
    }
    System.out.println(Arrays.toString(num));
  }
}