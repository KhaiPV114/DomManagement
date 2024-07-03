/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.StudentService;

import Entity.Request;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ResidentRequestService {
   
    Request findById(Integer id);
    
    long createNewRequest(Request request);

    void update(Request request);

    List<Request> findAll();
}
