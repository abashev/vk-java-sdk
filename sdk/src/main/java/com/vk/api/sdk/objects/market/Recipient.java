package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;

/**
 * Информация о покупателе
 *
 * @author <A href="mailto:alexey@abashev.ru">Alexey Abashev</A>
 */
public class Recipient {
    /** имя покупателя */
    @SerializedName("name")
    private String name;

    /** номер покупателя */
    @SerializedName("phone")
    private String phone;

    /** строковое представление информации о покупателе */
    @SerializedName("display_text")
    private String displayText;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    @Override
    public String toString() {
        return "Recipient{" +
            "name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", displayText='" + displayText + '\'' +
            '}';
    }
}
