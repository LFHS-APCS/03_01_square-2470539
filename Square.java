public class Square{
  private double side;
  public final int MAX_SIDE_LENGTH = 10;
  public Square(double side){
  }
  public double getSide(){
    return side;
  }
  public double setSide(double theSide){
    if(theSide<=10 && theSide>0){
    side = theSide;
    return side;
    } else{
      return side;
    }
  }
  public String toString(){
    return "Square with side length = " + side;
  }
  public double area(){
    double area = side*side;
    return area;
  }
  public double diagonal(){
    double diagonal = side*Math.sqrt(2);
    return diagonal;
  }
}
