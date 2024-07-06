package Controller.General;

import Dto.FloorAndFreeBed;
import Entity.Bed;
import Enum.RoomType;
import Enum.BedStatus;
import Service.BedService;
import Service.Impl.BedServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@WebServlet("/student/detail-book-room")
public class GetDetailBookRoom extends HttpServlet {
    private final BedService bedService = new BedServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dom = req.getParameter("dom");
        int floor = Integer.valueOf(req.getParameter("floor"));
        String roomTypeName = req.getParameter("roomType");
        Set<Integer> floors = new HashSet<>();

        RoomType room = RoomType.valueOf(roomTypeName);

        List<Bed> beds = bedService.getByRoomType(String.valueOf(room.getType()));

        long freeBed = beds.stream()
                .peek(x -> {
                    String key = x.getRoomName().substring(0, 1);
                    if (key.equals(dom)) {
                        floors.add(x.getFloor());
                    }
                })
                .filter(x -> BedStatus.NOTAVAILABLE.equals(x.getBedStatus())
                        && x.getFloor().equals(floors.size() < floor ? 1 : floor))
                .count();

        FloorAndFreeBed floorAndFreeBed = FloorAndFreeBed.builder()
                .freeBed(freeBed)
                .floors(floors)
                .build();
        Gson gson = new Gson();
        String jsonResponse = gson.toJson(floorAndFreeBed);
        resp.getWriter().write(jsonResponse);

    }
}



