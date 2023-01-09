package models

import scala.util.control.Breaks
import scala.util.control.Breaks.break


object ITTEmployee extends App{


  def addEmp(name: String, age: Int, dept: Int): String = dept match {
    case 1
    => {
      val boardDirector = new BoardOfDirector()
      val emp1 = new Employee(name, age)
      boardDirector.emp = boardDirector.emp :+ emp1
      "Employee added in BoardOfDirector Department Successfully"
    }
    case 2
    => {
      val engDepartment = new EngineeringDepartment()
      val emp1 = new Employee(name, age)
      engDepartment.emp = engDepartment.emp :+ emp1
      "Employee added in Engineering Department Successfully"
    }
    case 3
    => {
      val operationDepartment = new Operations()
      val emp1 = new Employee(name, age)
      operationDepartment.emp = operationDepartment.emp :+ emp1
      "Employee added in Operations Department Successfully"
    }
    case 4 => {
      val serviceDepartment = new Services()
      val emp1 = new Employee(name, age)
      serviceDepartment.emp = serviceDepartment.emp :+ emp1
      "Employee added in Services Department Successfully"
    }

  }


  def averageAgeInTimeTecEmployee(): Double = {
    var sum = 0.0

    val boardDirector = BoardOfDirector().averageAge()
    val engDepartment = EngineeringDepartment().averageAge()
    val operationDepartment = Operations().averageAge()
    val serviceDepartment = Services().averageAge()
    sum = boardDirector + engDepartment + operationDepartment + serviceDepartment
    val avg = sum / 4
     avg
  }

  def collectiveAgeInTimeTecEmployee(): Int = {

    val boardDirector = BoardOfDirector().collectiveAge()
    val engDepartment = EngineeringDepartment().collectiveAge()
    val operationDepartment = Operations().collectiveAge()
    val serviceDepartment = Services().collectiveAge()

    val sum = boardDirector + engDepartment + operationDepartment + serviceDepartment
    sum
  }

  def getElderEmployee(dept:Int):List[Any] = {
    if(dept==1){
      val boardDirector = BoardOfDirector()
      boardDirector.elderEmployee()
    }else if(dept==2){
      val engDepartment = EngineeringDepartment()
      engDepartment.elderEmployee()
    }else if(dept==3){
      val  operationDepartment = Operations()
      operationDepartment.elderEmployee()
    }else{
      val serviceDepartment = Services()
      serviceDepartment.elderEmployee()
    }
  }

  def getYoungerEmployee(dept: Int): List[Any] = {
    if (dept == 1) {
      val boardDirector = BoardOfDirector()
      boardDirector.youngerEmployee()
    } else if (dept == 2) {
      val engDepartment = EngineeringDepartment()
      engDepartment.youngerEmployee()
    } else if (dept == 3) {
      val operationDepartment = Operations()
      operationDepartment.youngerEmployee()
    } else {
      val serviceDepartment = Services()
      serviceDepartment.youngerEmployee()
    }
  }

  def getDeptCollectiveAge(dept: Int): Int = {
    if (dept == 1) {
      val boardDirector = BoardOfDirector()
      boardDirector.collectiveAge()
    } else if (dept == 2) {
      val engDepartment = EngineeringDepartment()
      engDepartment.collectiveAge()
    } else if (dept == 3) {
      val operationDepartment = Operations()
      operationDepartment.collectiveAge()
    } else {
      val serviceDepartment = Services()
      serviceDepartment.collectiveAge()
    }
  }

  def getDeptAverageAge(dept: Int): Double = {
    if (dept == 1) {
      val boardDirector = BoardOfDirector()
      boardDirector.averageAge()
    } else if (dept == 2) {
      val engDepartment = EngineeringDepartment()
      engDepartment.averageAge()
    } else if (dept == 3) {
      val operationDepartment = Operations()
      operationDepartment.averageAge()
    } else {
      val serviceDepartment = Services()
      serviceDepartment.averageAge()
    }
  }

  def getDeptVacancies(dept: Int): Int = {
    if (dept == 1) {
      val boardDirector =  BoardOfDirector()
      boardDirector.departmentVacancies()
    } else if (dept == 2) {
      val engDepartment =  EngineeringDepartment()
      engDepartment.departmentVacancies()
    } else if (dept == 3) {
      val operationDepartment =  Operations()
      operationDepartment.departmentVacancies()
    } else {
      val serviceDepartment =  Services()
      serviceDepartment.departmentVacancies()
    }
  }

  def getEmployeeAccommodateAndPromotion(dept: Int):List[String] = {
    if (dept == 1) {
      val boardDirector = new BoardOfDirector()
      boardDirector.accommodateAndPromotion()
    } else if (dept == 2) {
      val engDepartment = new EngineeringDepartment()
      engDepartment.accommodateAndPromotion()
    } else if (dept == 3) {
      val operationDepartment = new Operations()
      operationDepartment.accommodateAndPromotion()
    } else {
      val serviceDepartment = new Services()
      serviceDepartment.accommodateAndPromotion()
    }
  }


}