package Dao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.RoomBillDao;
import Entity.RoomBill;
import Mapper.RoomBillMap;

import java.util.List;

public class RoomBillDaoImpl extends GenericDaoImpl<RoomBill> implements RoomBillDao {
    @Override
    public RoomBill findById(Integer id) {
        String sql = "SELECT * FROM RoomBill WHERE billId = ?";
        return query(sql, new RoomBillMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(RoomBill roomBill) {
        String sql = "UPDATE RoomBill SET electricMoney =?, waterMoney = ?, roomName = ?, billStatus = ? , totalAmount = ?, description = ?, dayCreate = ? WHERE billId = ?";
        update(sql, roomBill.getElectricMoney(), roomBill.getWaterMoney(), roomBill.getRoomName(),
                roomBill.getBillStatus(), roomBill.getTotalAmount(), roomBill.getDescription(), roomBill.getBillId());
    }

    @Override
    public List<RoomBill> findAll() {
        String sql = "SELECT * FROM RoomBill";
        return query(sql, new RoomBillMap());
    }
}
