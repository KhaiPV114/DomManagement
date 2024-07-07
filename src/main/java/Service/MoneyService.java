package Service;

import Entity.Money;

import java.util.List;

public interface MoneyService {
    List<Money> getAll();
    List<Money> getByMoneyType(String type);
    Money getByMoneyTypeAndRoomType(String moneyType, String roomType);
}
