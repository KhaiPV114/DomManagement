package Mapper;

import Entity.DormResident;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DormResidentMap implements RowMapper<DormResident> {
    @Override
    public DormResident mapRow(ResultSet rs) {
        DormResident.DormResidentBuilder dom = DormResident.builder();
        try {
            dom.residentId(rs.getInt("residentId"))
                    .bedId(rs.getInt("bedId"))
                    .userId(rs.getInt("userId"))
                    .balance(rs.getLong("balance"))
                    .checkInDate(rs.getTimestamp("checkInDate"))
                    .checkOutDate(rs.getTimestamp("checkInDate"))
                    .termId(rs.getInt("termId"))
                    .roomName(rs.getString("roomName"))
                    .rollId(rs.getString("rollId"))
                    .floor(rs.getInt("floor"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dom.build();
    }
}
