/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.Impl;

import Dao.GenericDao.Impl.GenericDaoImpl;
import Dao.ResidentRequestDao;
import Entity.Request;
import Mapper.RequestMap;

import java.util.List;


/**
 *
 * @author ADMIN
 */
public class ResidentRequestDaoImpl extends GenericDaoImpl<Request> implements ResidentRequestDao   {


    @Override
    public Request findById(Integer id) {
        String sql = "SELECT * FROM Request WHERE requestId = ?";
        return query(sql, new RequestMap(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void update(Request request) {
        String sql = "UPDATE Request SET requestStatus= ?, requestDetail = ?, residentId = ?, rollId = ?, requestType = ?, domId = ?, floor = ?, roomName = ?, termId = ?";
        update(sql, request.getRequestStatus(), request.getRequestDetail(), request.getResidentId(), request.getRollId(), request.getRequestType(), request.getDomId(), request.getFloor(),
                request.getRoomName(), request.getTermId());
    }

    @Override
    public List<Request> findAll() {
        String sql = "SELECT * FROM Request";
        return query(sql, new RequestMap()).stream().toList();
    }

    @Override
    public long createNewRequest(Request request) {
     StringBuilder sql = new StringBuilder("INSERT INTO Request (requestStatus, requestDetail, residentId, rollId, requestType, domId, floor, roomName, termId) ");
        sql.append(" VALUES(?,?,?,?,?,?) ");

        return insert(sql.toString(), request.getRequestStatus(), request.getRequestDetail(), request.getResidentId(), request.getRollId(), request.getRequestType(), request.getDomId(), request.getFloor(), request.getRoomName(), request.getTermId());
     }


}
