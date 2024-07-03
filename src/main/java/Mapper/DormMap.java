package Mapper;

import Entity.Dorm;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DormMap implements RowMapper<Dorm> {
    @Override
    public Dorm mapRow(ResultSet rs) {
        Dorm.DormBuilder dorm = Dorm.builder();
        try {
            dorm.domId(rs.getInt("domId"));
            dorm.domName(rs.getString("domName"));
            dorm.numberOfFloor(rs.getInt("numberOfFloor"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dorm.build();
    }
}
