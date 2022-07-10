
object main{

  def attend(tp:Double):Double =120 + ((15-tp)/5)*20;
  def revenue(tp:Double):Double =attend(tp)*tp;
  def cost(tp:Double):Double =attend(tp)*3+500;
  def profit(tp:Double):Double =revenue(tp)-cost(tp);

  def main(args:Array[String])={
     print(profit(15));
  }


}
