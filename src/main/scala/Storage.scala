import cats.effect._

/**
  * Primary key collision errors aren't modeled because you shouldn't be able to induce collision over synthetic keys
  * created during insert.
  *
  * This doesn't apply to domain keys.
  */
class Storage[F[_]: Sync] {
  private var bookPk: Int   = _
  private var authorPk: Int = _

  private val books   = collection.mutable.Map.empty[Int, Book]
  private val authors = collection.mutable.Map.empty[Int, Author]

  /**
    * Remove FKs from child objects so that their linkage to their parents can happen more intentionally rather than
    * randomly. This is the separation between real data and synthetic data (Fks)
    *
    * Entity[A] // A is given primary key
    * HasForeignKey[A] // A is given foreign key, to what? maybe extend with second type parameter
    * A References B == References[A, B] A is "under" B, either 1 to 1 or children of B
    *
    * --
    *
    * There must be an orchestration type to signify a relationship between two types, to differentiate it from a tuple.
    * Orchestrated[A, B] vs (A, B)
    *
    * --
    *
    * (K, Option[A}), List[(K, A)]
    *
    * Where none the second part specifically does not satisfy for the `K` given in the first part.
    *
    * Where all the A can be stacked monadically
    *
    * --
    *
    * If there are no domain keys/uniqueness, all `A` are independent. The only thing that needs orchestration is the `K` that are generated, which should probably demand some sort of `Equality`.
    * @return
    */
  def selectOne = ???

  /**
    * type Grp = (A, List[B])
    *
    * (K, Grp), List[(K, Grp))
    */
  def selectOneToMany(authorId: Int): F[List[(Author, Book)]] =
    Sync[F].delay {
      for {
        (aid, a) <- authors.toList
        (_, b)   <- books.toList.filter(_._2.authorId == aid)
      } yield (a, b)
    }

  def selectManyToMany = ???

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
