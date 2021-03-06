package com.techelevator.XX;

import com.techelevator.XX.XX_ComicDao;
import com.techelevator.model.Comic;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class
XX_JdbcComicDao implements XX_ComicDao {

    private JdbcTemplate jdbcTemplate;

    public XX_JdbcComicDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Comic getSingleComicById(long comicId) {

        Comic comic = null;

        String sql = "SELECT * " +
                     "FROM comics " +
                     "WHERE comic_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, comicId);
        if (results.next()) {
            comic = mapRowToComics(results);
        }
        return comic;
    }

    @Override
    public List <Comic> getAllComics() {
        List <Comic> comics = new ArrayList<>();

        String sql = "SELECT * FROM comics;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Comic comic = mapRowToComics(results);
            comics.add(comic);
        }
        return comics;
    }

//add to collection

    /*
    private Comic mapRowToComic(SqlRowSet rowset) {
        Comic comic = new Comic();
        comic.setId(rowset.getLong("comic_id"));

        return comic;
    }

     */

    private Comic mapRowToComics(SqlRowSet rowSet) {

        Comic comic = new Comic();

        comic.setComicId(rowSet.getLong("comic_id"));
        comic.setMarvelId(rowSet.getLong("marvel_id"));
        comic.setComicTitle(rowSet.getString("comic_title"));
        comic.setImgUrl(rowSet.getString("img_url"));

        return comic;
    }
}
