package models
//import collection.mutable
case class BoardOfDirector() extends ITT{

  var emp= List(new Employee("Jeet",54),new Employee("Sandeep",50),
    new Employee("Vijaya",45),new Employee("Sunil",43),new  Employee("Rakesh",46))


  def deptEmpSize():Int = emp.size

  def elder(): List[Any] = {
    var yo = 0
    var nam = ""
    emp.map(x => {
      val z = x.getAge
      if (z > yo) {
        yo = z
        nam = x.getName
      }
    }
    )
     List(nam, yo)
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

  def averageAge():Double = {
    var sum = 0
    var avg = 0.0
    emp.map(x=>
       sum=sum+x.getAge
    )
    avg = sum/deptEmpSize()
     avg
  }

  def vacancies(): Int = {
    var vac = 0
    if(deptEmpSize()<6){
      vac = 6-deptEmpSize()
    }
    vac
  }

  def accommodateAndPromotion(): List[String] = {
    var str:List[String] = List("All member eligible for Accommodate And Promotion")

    str
  }
}