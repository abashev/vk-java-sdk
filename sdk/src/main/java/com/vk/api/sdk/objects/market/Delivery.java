package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

/**
 * Информация о доставке.
 *
 * @author <A href="mailto:alexey@abashev.ru">Alexey Abashev</A>
 */
public class Delivery {
    /** адрес доставки */
    @SerializedName("address")
    private String address;

    /** тип доставки */
    @SerializedName("type")
    private String type;

    /** трек-номер для отслеживания заказа */
    @SerializedName("track_number")
    private String trackNumber;

    /** ссылка для отслеживания заказа по трек-номеру */
    @SerializedName("track_link")
    private String trackLink;

    /**
     * информация о пункте выдачи
     * delivery_point":{"id":9477,"external_id":"MSK2219","outpost_only":true,"cash_only":false,"address":{"id":82467,"additional_address":"Почтомат Халва. Войти в магазин Ароматный мир через центральный вход, на 1 этаже около входа расположен почтомат.","address":"117393, Москва, ул. Академика Пилюгина, 18","city_id":1,"country_id":1,"city":{"id":1,"title":"Москва"},"country":{"id":1,"title":"Россия"},"latitude":55.668452,"longitude":37.533840,"timetable":{"fri":{"close_time":1350,"open_time":570,"break_close_time":0,"break_open_time":0},"mon":{"close_time":1350,"open_time":570,"break_close_time":0,"break_open_time":0},"sat":{"close_time":1350,"open_time":570,"break_close_time":0,"break_open_time":0},"sun":{"close_time":1320,"open_time":600,"break_close_time":0,"break_open_time":0},"thu":{"close_time":1350,"open_time":570,"break_close_time":0,"break_open_time":0},"tue":{"close_time":1350,"open_time":570,"break_close_time":0,"break_open_time":0},"wed":{"close_time":1350,"open_time":570,"break_close_time":0,"break_open_time":0}},"title":"3406 Постамат Халва","work_info_status":"timetable"},"display_title":"СДЭК","service_id":3}}
     * */
    @SerializedName("delivery_point")
    private String deliveryPoint;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackLink() {
        return trackLink;
    }

    public void setTrackLink(String trackLink) {
        this.trackLink = trackLink;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    @Override
    public String toString() {
        return "Delivery{" +
            "address='" + address + '\'' +
            ", type='" + type + '\'' +
            ", trackNumber='" + trackNumber + '\'' +
            ", trackLink='" + trackLink + '\'' +
            ", deliveryPoint='" + deliveryPoint + '\'' +
            '}';
    }
}
