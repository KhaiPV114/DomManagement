package Service;

import Entity.DomResident;

import java.util.List;

public interface DomResidentService {

    DomResident getById(Integer id);
    List<DomResident> getByRollId(String rollId);

    DomResident getByRollIdAndSemester(String rollId, String semester);

    int countUserInRoomAndTermAndYear(String room, String term, int year);
}
