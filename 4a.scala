object Main{

      def normalSalary(hours:Double):Double={
        return hours*250;
      }

      def ot(hours:Double):Double={
        return hours*85;
      }

      def income(nH:Double,otH:Double):Double={
        return normalSalary(nH)+ot(otH);
      }


      def taxS(income:Double):Double={
        return income*0.12;
      }


      def takeSalary(noOfWorkH:Double,otH:Double):Double={
        return income(noOfWorkH,otH)-taxS(income(noOfWorkH,otH));
      }

      def main(args:Array[String])={
         println(takeSalary(8,2));
      }
}
