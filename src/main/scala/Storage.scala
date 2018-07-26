import cats.effect._

class Storage[F[_] : Sync] {
  def selectJoin: F[Nothing] = ???

  def addBook: F[Nothing] = ???

  def addAuthor: F[Nothing] = ???
}
