object Tutorial4_1 {

  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount here : ")
    val deposit = scala.io.StdIn.readInt()

    money(deposit)

    def money (x : Int): Unit = {
      if (deposit <= 20000)
        {
          println("You have a 2% flat")
          println("Now you have extra Rs." + deposit*2 / 100)
        }

      else if (deposit <= 200000)
        {
          println("you have a 4% flat")
          println("Now you have extra Rs." + deposit * 4 / 100)
        }

      else if (deposit <= 2000000)
        {
          println("You have a 3.5% flat")
          println("Now you have extra Rs." + deposit*3.5 / 100)
        }

      else
        {
          println("You have a 6.5% flat")
          println("Now you have extra Rs." + deposit*6.5 /100)
        }
    }
  }


}
