/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.StudentDao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.StudentDao.DormDao;
import Dao.StudentDao.ResidentRequestDao;
import Entity.Dorm;
import Entity.Request;
import Mapper.DormMap;
import Mapper.RequestMap;

import java.util.List;


/**
 * @author ADMIN
 */
public class DormDaoImpl extends GenericDaoImpl<Dorm> implements DormDao {


    @Override
    public Dorm findById(Integer id) {
        String sql = "SELECT * FROM Dom WHERE domId = ?";
        return query(sql, new DormMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(Dorm dorm) {

    }

    @Override
    public List<Dorm> findAll() {
        String sql = "SELECT * FROM Dom";
        return query(sql, new DormMap());
    }
}
