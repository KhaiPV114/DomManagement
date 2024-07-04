package Dao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.PaymentHistoryDao;
import Entity.PaymentHistory;
import Mapper.PaymentMap;

import java.util.List;

public class PaymentHistoryDaoImpl extends GenericDaoImpl<PaymentHistory> implements PaymentHistoryDao {
    @Override
    public PaymentHistory findById(Integer id) {
        String sql = "SELECT * FROM PaymentHistory WHERE paymentId = ?";
        return query(sql, new PaymentMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(PaymentHistory payment) {
        String sql = "UPDATE PaymentHistory SET roomName = ?, totalAmount = ?, totalAmountPaid = ?, totalAmountRemain = ?, status = ?, description = ?, createDate = ? WHERE paymentId = ? ";
        update(sql, payment.getRoomName(), payment.getTotalAmount(), payment.getTotalAmountPaid(), payment.getTotalAmountRemain(),
                payment.getStatus(), payment.getDescription(), payment.getCreateDate(), payment.getPaymentId());
    }

    @Override
    public List<PaymentHistory> findAll() {
        String sql = "SELECT * FROM PaymentHistory";
        return query(sql, new PaymentMap());
    }
}
