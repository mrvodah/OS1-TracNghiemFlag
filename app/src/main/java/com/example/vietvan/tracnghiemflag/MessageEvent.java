package com.example.vietvan.tracnghiemflag;

import java.util.List;

/**
 * Created by VietVan on 04/05/2018.
 */

public class MessageEvent {

    public List<FlagResponse> list;

    public MessageEvent(List<FlagResponse> list) {
        this.list = list;
    }
}
