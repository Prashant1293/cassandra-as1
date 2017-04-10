
object QueryObject extends App {

  val queryClass = new QueryClass
  queryClass.userByEmail("ps@ps.com")
  queryClass.videoByName("Bahubali2")
  queryClass.videoByUseridYear(7, 1993)
  queryClass.videoByUseridYearDesc(7, 1993)

}
