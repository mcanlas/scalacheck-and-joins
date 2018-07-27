import cats.effect._

/**
 * Primary key collision errors aren't modeled because you shouldn't be able to induce collision over synthetic keys
 * created during insert.
 *
 * This doesn't apply to domain keys.
 */
class Storage[F[_] : Sync] {
  private var bookPk   : Int = _
  private var authorPk : Int = _

  private val books   = collection.mutable.Map.empty[Int, Book]
  private val authors = collection.mutable.Map.empty[Int, Author]

  def selectOneToMany(authorId: Int): F[List[(Author, Book)]] =
    Sync[F].delay {
      for {
        (aid, a) <- authors.toList
          (_, b) <- books.toList.filter(_._2.authorId == aid)
      } yield (a, b)
    }

  def addBook(book: Book): F[Unit] =
    Sync[F].delay {
      books(bookPk) = book
      bookPk += 1
    }

  def addAuthor(author: Author): F[Unit] =
    Sync[F].delay {
      authors(authorPk) = author
      authorPk += 1
    }
}
