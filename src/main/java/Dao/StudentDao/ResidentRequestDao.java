/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.StudentDao;

import Dao.GenericDao.GenericDao;
import Entity.Request;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ResidentRequestDao  extends GenericDao<Request>{
    long createNewRequest(Request request);
    Request findById(Integer id);

    void update (Request request);

    List<Request> findAll();
}
