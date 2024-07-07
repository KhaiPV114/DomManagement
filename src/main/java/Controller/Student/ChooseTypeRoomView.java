package Controller.Student;

import Controller.General.Common;
import Dto.RoomTypeDto;
import Enum.RoomType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/student/choose-room")
public class ChooseTypeRoomView extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<RoomType> roomTypes = Arrays.stream(RoomType.values()).toList();
        List<RoomTypeDto> roomTypeDtoList = roomTypes.stream().map(x -> {
                    String amount = new Common().convertAmount(x.getAmount());
                    return RoomTypeDto.builder()
                            .bed(x.getType())
                            .key(x.name())
                            .amount(amount)
                            .build();
                }
        ).toList();
        req.setAttribute("roomTypes", roomTypeDtoList);
        req.getRequestDispatcher("/views/student/choose-type-room.jsp").forward(req, resp);
    }
}
