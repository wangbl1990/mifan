package com.mifan.guessing.exception;

public enum GuessingErrorCode {

    SUCCESS(10000, "成功"),
    FAIL(99999, "系统异常"),
    ;

    private int value;
    private String message;

    GuessingErrorCode(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public static GuessingErrorCode getErrorCode(int code){
        for(GuessingErrorCode obj : GuessingErrorCode.class.getEnumConstants()){
            if( obj.getValue() ==  code  ){
                return obj ;
            }
        }
        return null ;
    }
}
