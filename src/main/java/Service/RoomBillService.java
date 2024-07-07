package Service;

import Entity.RoomBill;

public interface RoomBillService {
    RoomBill getById(Integer id);

    RoomBill getByRollNameAndTermAndYear(String rollName, String term, int year);
}
