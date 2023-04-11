package HW1.task1;

public class Massiv {

      public void method (int[] nums) {

          for (int i = 0; i < nums.length; i++) {
              if (nums[i] % 2 == 0) {
                  System.out.println("Четные числа в массиве: " + nums[i]);
              }
          }

          for (int i = 0; i < nums.length; i++) {
              if (nums[i] % 2 != 0) {
                  System.out.println("Нечетные числа в массиве: " + nums[i]);
              }
          }

      }
}

