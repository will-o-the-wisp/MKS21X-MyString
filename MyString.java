public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){

  }
  public char charAt(int index){
    return ' ';
  }
  public CharSequence subSequence(int start, int end){
    return "";
  }
  public int length(){
    return 0;
  }
  public int compareTo(CharSequence s){
    return 0;
  }
}
