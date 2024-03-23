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

    /** информация о пункте выдачи */
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
