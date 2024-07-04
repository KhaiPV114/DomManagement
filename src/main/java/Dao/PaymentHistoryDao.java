package Dao;

import Dao.GenericDao.GenericDao;
import Entity.News;
import Entity.PaymentHistory;

import java.util.List;

public interface PaymentHistoryDao extends GenericDao<PaymentHistory> {
    PaymentHistory findById(Integer id);

    void update(PaymentHistory paymentHistory);

    List<PaymentHistory> findAll();
}
