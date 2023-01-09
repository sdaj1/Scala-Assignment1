package controllers

import javax.inject._

import play.api.mvc._

import models._



@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {


  def index = Action {
    Ok(views.html.index("Welcome to In Time Tec application."))
  }

  def addEmployeePageClick = Action {
    Ok(views.html.addemployee())
  }

  def addEmployeeFormValue(name:String,age:Int,dept:Int) = Action {
    if (dept < 1 || dept > 4) {
      Ok(s"Enter Department Not Available")
    } else {
      Ok(ITTEmployee.addEmp(name, age, dept))
    }
  }

  def getElderEmployee(dept:Int) = Action{
    if(dept<1 || dept>4){
      Ok(s"Enter Department Not Available")
    }else {
      val elder = ITTEmployee.getElderEmployee(dept)

      Ok(s"${elder.head} is the elder in Department His age is ${elder.tail.head}")
    }
  }

  def getYoungerEmployee(dept: Int) = Action {
    if (dept < 1 || dept > 4) {
      Ok(s"Enter Department Not Available")
    } else {
      val younger = ITTEmployee.getYoungerEmployee(dept)

      Ok(s"${younger.head} is the younger in Department His age is ${younger.tail.head}")
    }
  }

  def getDeptCollectiveAge(dept: Int) = Action{
    if (dept < 1 || dept > 4) {
      Ok(s"Enter Department Not Available")
    } else {
      val collective = ITTEmployee.getDeptCollectiveAge(dept)

      Ok(s"The Collective age of the Department is ${collective}")
    }
  }

  def getDeptAverageAge(dept: Int) = Action{
    if (dept < 1 || dept > 4) {
      Ok(s"Enter Department Not Available")
    } else {
      val avg = ITTEmployee.getDeptAverageAge(dept)

      Ok(s"The Average age of the Department is ${avg}")
    }
  }

  def getDeptVacancies(dept: Int) = Action{
    if (dept < 1 || dept > 4) {
      Ok(s"Enter Department Not Available")
    } else {
      val vacancies = ITTEmployee.getDeptVacancies(dept)

      Ok(s"Number of Vacancies in Department is ${vacancies}")
    }
  }

  def getAccomPromDept(dept:Int) = Action{
    if (dept < 1 || dept > 4) {
      Ok(s"Enter Department Not Available")
    } else {
      val accomProm = ITTEmployee.getEmployeeAccommodateAndPromotion(dept)
      if(accomProm.isEmpty){
        Ok("In Department No Employee is Eligible for Accommodate and Promotion")
      }else {
        Ok(views.html.printlistitem(accomProm))
      }
    }
  }

  def getAverageAgeIntimeTecEmployee() = Action{
    val averageAgeInTimeTec = ITTEmployee.averageAgeInTimeTecEmployee()
    Ok(s"The Average age of the In-Time-Tec is ${averageAgeInTimeTec}")
  }

  def getCollectiveAgeInTimeTecEmployee() = Action{
    val collectiveAgeInTimeTec = ITTEmployee.collectiveAgeInTimeTecEmployee()
    Ok(s"The Collective age of the In-Time-Tec is ${collectiveAgeInTimeTec}")
  }

}
