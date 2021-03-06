package com.techelevator.XX;

import com.techelevator.model.Series;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class XX_JdbcSeriesDao implements XX_SeriesDao {

    private JdbcTemplate jdbcTemplate;

    public XX_JdbcSeriesDao(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate;}

    @Override
    public Series getSingleSeriesByID(long series_id) {

        Series series = null;

        String sql = "SELECT * " +
                     "FROM series " +
                     "WHERE series_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, series_id);
        if (results.next()) {
            series = mapRowToSeries(results);
        }
        return series;
    }

    private Series mapRowToSeries(SqlRowSet rowSet) {
        Series series = new Series();

        series.setSeriesId(rowSet.getLong("series_id"));
        series.setSeriesTitle(rowSet.getString("series_title"));

        return series;
    }

}
