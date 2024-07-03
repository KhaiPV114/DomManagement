/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import Entity.Request;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class RequestMap implements RowMapper<Request>{
    public Request mapRow(ResultSet rs) {
    Request.RequestBuilder request = Request.builder();
    try{
        request.requestDetail(rs.getString("requestDetail"));
        request.requestStatus(rs.getString("requestStatus"));
        request.requestType(rs.getString("requestType"));
        request.residentId(rs.getInt("residentId"));
        request.rollId(rs.getString("rollId"));
        request.domId(rs.getInt("domId"));
        request.floor(rs.getInt("floor"));
        request.roomName(rs.getString("roomName"));
        request.termId(rs.getInt("termId"));
    }catch(SQLException e){
        throw new RuntimeException();
    }
    return request.build();
}
}
