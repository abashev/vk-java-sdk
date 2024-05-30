package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

/**
 * Информация о статусе платежа.
 *
 * "payment":{"status":"Оплачено","payment_status":"paid"}
 *
 * @author <A href="mailto:alexey@abashev.ru">Alexey Abashev</A>
 */
public class Payment {

    @SerializedName("status")
    private String status;

    /** {@link EditOrderPaymentStatus} */
    @SerializedName("payment_status")
    private String paymentStatus;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
            "status='" + status + '\'' +
            ", paymentStatus='" + paymentStatus + '\'' +
            '}';
    }
}
