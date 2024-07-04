/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import Entity.Request;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ADMIN
 */
public class RequestMap implements RowMapper<Request> {
    public Request mapRow(ResultSet rs) {
        Request.RequestBuilder request = Request.builder();
        try {
            request.requestDetail(rs.getString("requestDetail"))
                    .requestStatus(rs.getString("requestStatus"))
                    .requestType(rs.getString("requestType"))
                    .residentId(rs.getInt("residentId"))
                    .rollId(rs.getString("rollId"))
                    .domId(rs.getInt("domId"))
                    .floor(rs.getInt("floor"))
                    .roomName(rs.getString("roomName"))
                    .termId(rs.getInt("termId"));
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return request.build();
    }
}
