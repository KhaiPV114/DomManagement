package Mapper;

import Entity.RoomBill;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomBillMap implements RowMapper<RoomBill>{
    @Override
    public RoomBill mapRow(ResultSet rs) {
        RoomBill.RoomBillBuilder roomBill = RoomBill.builder();
        try {
            roomBill.billId(rs.getInt("billId"))
                    .roomName(rs.getString("roomName"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return roomBill.build();
    }
}
