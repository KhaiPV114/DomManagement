package Mapper;

import Entity.PaymentHistory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PaymentMap implements RowMapper<PaymentHistory>{
    @Override
    public PaymentHistory mapRow(ResultSet rs) {
        PaymentHistory.PaymentHistoryBuilder payment = PaymentHistory.builder();
        try{
            payment.paymentId(rs.getInt("paymentId"))
                    .createDate(rs.getTimestamp("createDate"))
                    .roomName(rs.getString("roomName"))
                    .status(rs.getString("status"))
                    .totalAmount(rs.getLong("totalAmount"))
                    .totalAmountPaid(rs.getLong("totalAmountRaid"))
                    .totalAmountRemain(rs.getLong("totalAmountRemain"))
                    .description(rs.getString("description"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return payment.build();
    }
}
