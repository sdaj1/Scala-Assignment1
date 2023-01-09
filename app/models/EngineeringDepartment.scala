package models

case class EngineeringDepartment() extends ITT{
  var emp = List(new Employee("Gnanaraj", 34), new Employee("Deepankar", 22),
    new Employee("Rohan", 23), new Employee("Ashish", 30),
    new Employee("Mohd", 29),new Employee("Nitesh", 28))


  def deptEmpSize():Int = emp.size

  def elder(): List[Any] = {
    var yo = 0
    var nam = ""
    emp.map(x=> {
      val z=x.getAge
      if(z>yo){
        yo=z
        nam = x.getName
      }
    }
    )
   List(nam,yo)
    }


  def younger(): List[Any] = {
    var yo = 200
    var nam = ""
    emp.map(x => {
      val z = x.getAge
      if (z < yo) {
        yo = z
        nam = x.getName
      }
    }
    )
   List(nam, yo)
  }

  def collectiveAge(): Int = {
    var sum = 0
    emp.map(x =>
      sum = sum + x.getAge
    )
    sum
  }

  def averageAge(): Double = {
    var sum = 0
    var avg = 0.0
    emp.map(x =>
      sum = sum + x.getAge
    )
    avg = sum / deptEmpSize()
    avg
  }

  def vacancies(): Int = {
    var vac = 0
    if (deptEmpSize() < 6) {
      vac = 6 - deptEmpSize()
    }
    vac
  }

  def accommodateAndPromotion(): List[String] = {
    var str:List[String] = List()
   for(emp1<-emp){
     if(emp1.getAge<21){
      str = str :+ s"${emp1.getName} you are not eligible for Accommodate your age less then 21"
     }
     if(emp1.getAge>40){
      str = str :+ s"${emp1.getName} you are eligible for Board Of Director department your age is greater then 40"
     }
   }
    str
  }
}