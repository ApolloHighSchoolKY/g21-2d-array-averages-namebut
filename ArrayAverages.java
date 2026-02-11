import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double rowAvg = 0;

    for(int row = 0; row < ray.length; row++)
    {
      for(int col = 0; col < ray[row].length; col++)
      {
        rowAvg = rowAvg + ray[row][col];
      }
      rowAvg = rowAvg/ray.length;
      System.out.println("Row " + row + " Average: " + rowAvg);
      rowAvg = 0;
    }
    System.out.println("\n");
  }
  
  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    double colAvg = 0; 

    for (int col = 0; col < ray[0].length; col++)
    {
      for(int row = 0; row < ray.length; row++)
      {
        colAvg = colAvg + ray[row][col];
      }
      //This spot here represents the completion of one column
      colAvg = colAvg/ray.length;
      System.out.println("Col " + col + " Average: " + colAvg);
      colAvg = 0;
    }
    System.out.println("\n");
  }

  public void arrayAverage(){
    double arrayAvg = 0;

    for(int row = 0; row < ray.length; row++)
    {
      for(int col = 0; col < ray[row].length; col++)
      {
        arrayAvg = arrayAvg + ray[row][col];
      }
  }
  arrayAvg = arrayAvg/(ray.length * ray[0].length);
  System.out.println("Array Average: " + arrayAvg);
}

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
