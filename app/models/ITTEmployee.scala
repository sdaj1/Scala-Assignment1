package models

import scala.util.control.Breaks
import scala.util.control.Breaks.break


object ITTEmployee extends App{


  def addEmp(name: String, age: Int, dept: Int): String = dept match {
    case 1
    => {
      val bodD = new BoardOfDirector()
      val emp1 = new Employee(name, age)
      bodD.emp = bodD.emp :+ emp1
      "Employee added in BoardOfDirector Department Successfully"
    }
    case 2
    => {
      val engD = new EngineeringDepartment()
      val emp1 = new Employee(name, age)
      engD.emp = engD.emp :+ emp1
      "Employee added in Engineering Department Successfully"
    }
    case 3
    => {
      val opD = new Operations()
      val emp1 = new Employee(name, age)
      opD.emp = opD.emp :+ emp1
      "Employee added in Operations Department Successfully"
    }
    case 4 => {
      val serD = new Services()
      val emp1 = new Employee(name, age)
      serD.emp = serD.emp :+ emp1
      "Employee added in Services Department Successfully"
    }

  }


  def averageAgeInTimeTecEmployee(): Double = {
    var sum = 0.0

    val bod = BoardOfDirector().averageAge()
    val ed = EngineeringDepartment().averageAge()
    val od = Operations().averageAge()
    val sd = Services().averageAge()
    sum = bod + ed + od + sd
    val avg = sum / 4
     avg
  }

  def collectiveAgeInTimeTecEmployee(): Int = {

    val bod = BoardOfDirector().collectiveAge()
    val ed = EngineeringDepartment().collectiveAge()
    val od = Operations().collectiveAge()
    val sd = Services().collectiveAge()

    val sum = bod + ed + od + sd
    sum
  }

  def getElderEmployee(dept:Int):List[Any] = {
    if(dept==1){
      val bodD = BoardOfDirector()
      bodD.elder()
    }else if(dept==2){
      val engD = EngineeringDepartment()
      engD.elder()
    }else if(dept==3){
      val  oprD = Operations()
      oprD.elder()
    }else{
      val servD = Services()
      servD.elder()
    }
  }

  def getYoungerEmployee(dept: Int): List[Any] = {
    if (dept == 1) {
      val bodD = BoardOfDirector()
      bodD.younger()
    } else if (dept == 2) {
      val engD = EngineeringDepartment()
      engD.younger()
    } else if (dept == 3) {
      val oprD = Operations()
      oprD.younger()
    } else {
      val servD = Services()
      servD.younger()
    }
  }

  def getDeptCollectiveAge(dept: Int): Int = {
    if (dept == 1) {
      val bodD = BoardOfDirector()
      bodD.collectiveAge()
    } else if (dept == 2) {
      val engD = EngineeringDepartment()
      engD.collectiveAge()
    } else if (dept == 3) {
      val oprD = Operations()
      oprD.collectiveAge()
    } else {
      val servD = Services()
      servD.collectiveAge()
    }
  }

  def getDeptAverageAge(dept: Int): Double = {
    if (dept == 1) {
      val bodD = BoardOfDirector()
      bodD.averageAge()
    } else if (dept == 2) {
      val engD = EngineeringDepartment()
      engD.averageAge()
    } else if (dept == 3) {
      val oprD = Operations()
      oprD.averageAge()
    } else {
      val servD = Services()
      servD.averageAge()
    }
  }

  def getDeptVacancies(dept: Int): Int = {
    if (dept == 1) {
      val bodD =  BoardOfDirector()
      bodD.vacancies()
    } else if (dept == 2) {
      val engD =  EngineeringDepartment()
      engD.vacancies()
    } else if (dept == 3) {
      val oprD =  Operations()
      oprD.vacancies()
    } else {
      val servD =  Services()
      servD.vacancies()
    }
  }

  def getEmployeeAccommodateAndPromotion(dept: Int):List[String] = {
    if (dept == 1) {
      val bodD = new BoardOfDirector()
      bodD.accommodateAndPromotion()
    } else if (dept == 2) {
      val engD = new EngineeringDepartment()
      engD.accommodateAndPromotion()
    } else if (dept == 3) {
      val oprD = new Operations()
      oprD.accommodateAndPromotion()
    } else {
      val servD = new Services()
      servD.accommodateAndPromotion()
    }
  }


}