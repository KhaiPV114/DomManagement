/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.StudentDao;

import Dao.GenericDao.GenericDao;
import Entity.DomResident;

/**
 *
 * @author ADMIN
 */
public interface ResidentRequestDao  extends GenericDao<DomResident>{
    long save(DomResident domResident);
    DomResident findById(Integer id);
}
