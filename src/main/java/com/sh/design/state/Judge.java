package com.sh.design.state;

public enum Judge {

    ADD("add", new Add()),
    SUBTRACT("subtract", new Subtract());

    private String code;
    private Computer value;
    Judge(String code, Computer value) {
        this.code = code;
        this.value = value;
    }

    public static Computer getByCode(String code) {
        for (Judge judge : Judge.values()) {
            if (judge.code.equals(code)) {
                return judge.value;
            }
        }
        return null;
    }

}
