/**
 * create: 19/07/2018
 */
package filmRankingSystem.film.adminFilm;
import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.dataRanking.*;;
/**
 * @author EEE
 */
public interface AdminFilm
{
	public void buscanombre( FilmDTO film );
	public boolean addfilm( RankingDTO FilmDTO_String );
	public boolean eliminarfilm( int delate_Film);
}
 