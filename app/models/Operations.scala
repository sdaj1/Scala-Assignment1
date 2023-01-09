package models

case class Operations() extends ITT {

  var emp = List(new Employee("Tapish", 35), new Employee("Ayush", 34),
    new Employee("Surendara", 45), new Employee("Ashi", 43), new Employee("Vikash", 39))


  def deptEmpSize(): Int = emp.size

  def elderEmployee(): List[Any] = {
    var minValue = 0
    var name = ""
    emp.map(x => {
      val employeeAge = x.getAge
      if (employeeAge > minValue) {
        minValue = employeeAge
        name = x.getName
      }
    }
    )
    List(name, minValue)
  }

  def youngerEmployee(): List[Any] = {
    var maxValue = 200
    var name = ""
    emp.map(x => {
      val employeeAge = x.getAge
      if (employeeAge < maxValue) {
        maxValue = employeeAge
        name = x.getName
      }
    }
    )
    List(name, maxValue)
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

  def departmentVacancies(): Int = {
    var vacancy = 0
    if (deptEmpSize() < 6) {
      vacancy = 6 - deptEmpSize()
    }
    vacancy
  }

  def accommodateAndPromotion(): List[String] = {
    var str:List[String] = List()
    for (emp1 <- emp) {
      if (emp1.getAge < 21) {
        str = str :+ s"${emp1.getName} you are not eligible for Accommodate your age less then 21"
      }
      if (emp1.getAge > 40) {
        str = str :+ s"${emp1.getName} you are eligible for Board Of Director department your age is greater then 40"
      }
    }
    str
  }
}