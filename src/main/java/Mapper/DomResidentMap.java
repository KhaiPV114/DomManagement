package Mapper;

import Entity.DomResident;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DomResidentMap implements RowMapper<DomResident>{
    @Override
    public DomResident mapRow(ResultSet rs) {
        DomResident.DomResidentBuilder dom = DomResident.builder();
        try {
            dom.residentId(rs.getInt("residentId"));
            dom.bedId(rs.getInt("bedId"));
            dom.userId(rs.getInt("userId"));
            dom.balance(rs.getLong("balance"));
            dom.checkInDate(rs.getTimestamp("checkInDate"));
            dom.checkOutDate(rs.getTimestamp("checkInDate"));
            dom.termId(rs.getInt("termId"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dom.build();
    }
}
