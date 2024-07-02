package Enum;


import lombok.Getter;


public enum RoomType {

    BIG(6,500000L),
    MEDIUM(4,800000L),

    SMALL(3,1000000L);

    @Getter
    private int type;

    @Getter
    private long amount;

    RoomType(int type, long amount) {
        this.type = type;
        this.amount = amount;
    }

}
