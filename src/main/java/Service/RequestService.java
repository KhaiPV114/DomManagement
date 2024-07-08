package Service;


import Entity.Request;

import java.util.List;

public interface RequestService {
    List<Request> getAll();
    Request getById(Integer id);

    void updateStatus(Request request);
}
