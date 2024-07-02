/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.StudentDao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.StudentDao.ResidentRequestDao;
import Entity.DomResident;
import Mapper.DomResidentMap;

/**
 *
 * @author ADMIN
 */
public class ResidentRequestDaoImpl extends GenericDaoImpl<DomResident> implements ResidentRequestDao   {

    @Override
    public long save(DomResident domResident) {
        StringBuilder sql = new StringBuilder("INSERT INTO DomResident (balance, checkInDate, checkOutDate , userId, bedId, termId) ");
        sql.append(" VALUES(?,?,?,?,?,?) ");

        return insert(sql.toString(), domResident.getBalance(), domResident.getCheckInDate(),
                domResident.getCheckOutDate(), domResident.getUserId(), domResident.getBedId(), domResident.getTermId());
    }

    @Override
    public DomResident findById(Integer id) {
        String sql = "SELECT * FROM DomResident WHERE residentId = ?";
        return query(sql, new DomResidentMap(), id).stream().findFirst().orElse(null);
    }

}
