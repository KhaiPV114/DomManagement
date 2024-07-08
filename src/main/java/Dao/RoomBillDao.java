package Dao;

import Dao.GenericDao.GenericDao;
import Entity.RoomBill;

import java.util.List;

public interface RoomBillDao extends GenericDao<RoomBill> {
    RoomBill findById(Integer id);

    void update(RoomBill RoomBill);

    List<RoomBill> findAll();

    RoomBill getByRollNameAndTermAndYear(String rollName, String term, int year);

    List<RoomBill> getByTermAndYear(String term, int year);

}
