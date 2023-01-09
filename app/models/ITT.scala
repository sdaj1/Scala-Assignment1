package models

trait ITT{
  var emp:List[Employee]
  def deptEmpSize():Int
  def elderEmployee():List[Any]
  def youngerEmployee():List[Any]
  def collectiveAge():Int
  def averageAge():Double
  def departmentVacancies():Int
  def accommodateAndPromotion():List[String]
}



