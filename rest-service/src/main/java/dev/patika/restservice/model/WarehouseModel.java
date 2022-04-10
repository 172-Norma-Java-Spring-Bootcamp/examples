package dev.patika.restservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@Builder(builderMethodName = "of")
public class WarehouseModel {

    @NotBlank(message = "İsim alanı boş olamaz.")
    private String name;
    @NotNull(message = "Tipi alanı boş olamaz..")
    private WarehouseType type;
    private String address;
    @Min(value = 51, message = "Deponun yüz ölçümü 50'den küçük olamaz.")
    private BigDecimal area; // 50m2'den büyük olmak zorunda.
    private BigDecimal latitude;
    private BigDecimal longitude;


    public enum WarehouseType {
        HOT, COLD
    }

    @Override
    public String toString() {
        return "WarehouseModel{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
