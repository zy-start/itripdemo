package com.itrip.biz.service.hotel;

import com.itrip.beans.pojo.Hotel;

import java.util.List;

public interface HotelService {

    /**
     * 展示旅店集合数据
     * @return
     */
    List<Hotel> getHotels();
}
