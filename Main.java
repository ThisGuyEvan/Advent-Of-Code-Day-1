import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    //Making array of the values.
    Scanner input = new Scanner(new File("fuel.txt"));
    int[] fuel = new int[100];
    int index = 0;
    while (input.hasNextInt()){
      fuel[index] = input.nextInt();
      index++;
    }
    //Methods:
    epTwo(fuel);
  }

//Part One
  public static void epOne(int[] fuel){
    int[] sumOfTotal = new int[100];
    for (int i = 0; i < fuel.length; i++){
      sumOfTotal[i] = (fuel[i] / 3) - 2;
    }

    int sumOfFuel = 0;
    for (int x = 0; x < sumOfTotal.length; x++){
      sumOfFuel += sumOfTotal[x];
    }

    System.out.print(sumOfFuel);
  }

  public static void epTwo(int[] fuel){
    int sumAllModules = 0;
    int[] allModules = new int[100];
    int index = 0;

    while (index != fuel.length){
      int newValue = fuel[index];
      while (true){
        newValue = (newValue/3) -2;
        if (newValue <= 0){
          break;
        }
        else{
          allModules[index] += newValue;
        }
      }
      index++;
    }
    for (int i = 0; i < allModules.length; i++){
      sumAllModules += allModules[i];
    }

    System.out.println(sumAllModules);

  }
}