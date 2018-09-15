import java.io.*;
class Textfile
{
  public static void main(String args[])
{
  try
  {
File f = new File("efg.txt");
    FileWriter w = new FileWriter("ab.txt");
    String str;
  str=f.getAbsolutePath();
    w.write(str);
    w.close();
    System.out.println("complete");
  }
  catch(IOException e)
  {
    e.printStackTrace();
  }
  }
}
