package Enum;

public enum Grade {
    gioi("Giỏi"),
    kha("Khá"),
    tb("Trung bình"),
    yeu("Yếu"),
    kem("Kém");
    private String msg;
    Grade(String msg) {
        this.msg = msg;
    }

    public String des() {
        return this.msg;
    }
}


