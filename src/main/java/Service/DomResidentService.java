package Service;

import Entity.DomResident;

import java.util.List;

public interface DomResidentService {

    DomResident getById(Integer id);
    List<DomResident> getByRollId(String rollId);
}
