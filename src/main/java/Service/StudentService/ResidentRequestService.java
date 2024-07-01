/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.StudentService;

import Entity.DomResident;

/**
 *
 * @author ADMIN
 */
public interface ResidentRequestService {
    DomResident findById(Integer id);

    long save(DomResident dom);
}
