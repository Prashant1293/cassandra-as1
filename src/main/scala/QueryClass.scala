import com.datastax.driver.core.Cluster

class QueryClass {

  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()

  val session = cluster.connect("kip")

  def userByEmail(email:String) = {

    val res = session.execute(s"SELECT * FROM User where email='$email'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByName(name:String) = {

    val res = session.execute(s"SELECT * FROM VideoByName where video_name='$name'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByUseridYear(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM VideoByUserIdnYear where userid=$id AND year>$year")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByUseridYearDesc(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM VideoByUserIdnYear where userid=$id AND year>$year ORDER BY year DESC")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
    cluster.close()
  }
}
