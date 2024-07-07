package Service.Impl;

import Dao.Impl.RoomBillDaoImpl;
import Dao.RoomBillDao;
import Entity.RoomBill;
import Service.RoomBillService;

public class RoomBillServiceImpl implements RoomBillService {
    private final RoomBillDao roomBillDao = new RoomBillDaoImpl();
    @Override
    public RoomBill getById(Integer id) {
        return roomBillDao.findById(id);
    }

    @Override
    public RoomBill getByRollNameAndTermAndYear(String rollName, String term, int year) {
        return roomBillDao.getByRollNameAndTermAndYear(rollName, term, year);
    }
}
