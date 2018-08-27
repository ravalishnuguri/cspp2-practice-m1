class degrees_to_fahrenhiet
{
  public static void main(String[] args)
  {
    double temperatue = 96;     
 
    System.out.println("Temperatue in Fahrenheit is =" + temperatue);
 
    // temperatue = ((temperatue - 32)*5)/9;
    temperatue = (temperatue * (9.0/5.0))+32;
 
    System.out.println("Temperatue in Celsius = " + temperatue);
  }
}