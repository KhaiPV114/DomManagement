package Dao;

import Dao.GenericDao.GenericDao;
import Entity.Bed;
import Entity.Money;

import java.util.List;

public interface MoneyDao extends GenericDao<Money> {
    Money getById(String moneyId);

    void update(Money money);

    List<Money> findAll();

    List<Money> getByType(String type);

    Money getByMoneyTypeAndRoomType(String moneyType, String roomType);
}