package models

trait ITT{
  var emp:List[Employee]
  def deptEmpSize():Int
  def elder():List[Any]
  def younger():List[Any]
  def collectiveAge():Int
  def averageAge():Double
  def vacancies():Int
  def accommodateAndPromotion():List[String]
}



