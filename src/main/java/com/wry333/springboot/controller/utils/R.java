package com.wry333.springboot.controller.utils;


import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(boolean flag) {
        this.flag = flag;
    }

    public R() {
    }

}
