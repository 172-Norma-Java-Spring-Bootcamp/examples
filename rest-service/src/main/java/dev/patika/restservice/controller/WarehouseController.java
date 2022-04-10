package dev.patika.restservice.controller;

import dev.patika.restservice.model.WarehouseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.Arrays;
import java.util.Objects;

@RestController
@RequestMapping(path = "/api")
@Slf4j
@Validated
public class WarehouseController {

    // POST api/warehouses
    // GET api/warehouses
    // GET api/warehouses/{id} ->
    // PUT api/warehouses/{id} -> PathVariable
    // DELETE api/warehouses/{id}
    // GET api/warehouse/search?name=X&id=1&type=HOT -> RequestParameter
    // POST -> createWarehouse -> RequestBody

    @PostMapping(path = "/warehouses")
    public ResponseEntity<?> createWarehouse(@RequestBody @Valid WarehouseModel warehouseModel) {


        // Traditional or old way of validation.

        /*
        if (Objects.isNull(warehouseModel)) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        if (!(StringUtils.hasLength(warehouseModel.getName()))) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Deponun ismi olmalı");
        }
        if (Objects.isNull(warehouseModel.getType())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Deponun tipi boş olamaz..");
        }
        if (warehouseModel.getArea() <= 50) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Yüç ölçümü 50'den küçük olamaz.");
        }*/
        log.info("{}", warehouseModel);
        log.info("Warehouse created");
        // createWarehouseService.create(warehouseModel);
        return ResponseEntity.ok().build();
    }


    @GetMapping(path = "/warehouses")
    public ResponseEntity<?> getWarehouses() {
        log.info("Warehouse fetched");

        return ResponseEntity.ok().body(Arrays.asList(WarehouseModel
                .of()
                .name("Istanbul Avrupa Yakasi")
                .address("Avurpa Yakası")
                .type(WarehouseModel.WarehouseType.HOT)
                .build(), WarehouseModel
                .of()
                .name("Istanbul Avrupa Yakasi")
                .address("Avurpa Yakası")
                .type(WarehouseModel.WarehouseType.HOT)
                .build(), WarehouseModel
                .of()
                .name("Istanbul Avrupa Yakasi")
                .address("Avurpa Yakası")
                .type(WarehouseModel.WarehouseType.HOT)
                .build(), WarehouseModel
                .of()
                .name("Istanbul Avrupa Yakasi")
                .address("Avurpa Yakası")
                .type(WarehouseModel.WarehouseType.HOT)
                .build()));
    }


    @GetMapping(path = "/warehouses/{warehouseId}")
    public ResponseEntity<?> getWarehouse(@PathVariable @Min(value = 20, message = "Depo UId 20'den küçük olamaz") Integer warehouseId) {
        log.info("Warehouse {} fetched", warehouseId);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/warehouses/search")
    public ResponseEntity<?> search(@RequestParam("id") Integer id,
                                    @RequestParam("type") WarehouseModel.WarehouseType type,
                                    @RequestParam(value = "name", required = false) String name) {
        if (id < 0) {
            return ResponseEntity.badRequest().body("ID alani 0'dan küçük olamaz.");
        }
        if (!Objects.isNull(name) && name.length() <= 3) {
            return ResponseEntity.badRequest().body("Depo ismi en az üç karalter içermelidir.");
        }
        log.info("ID -> {}, Type -> {}, Name -> {}", id, type, name);
        return ResponseEntity.ok().build();
    }


    @PutMapping(path = "/warehouses/{warehouseId}") // sadece rakamlar gelsin..
    public ResponseEntity<?> updateWarehouse(@PathVariable Integer warehouseId,
                                             @RequestBody WarehouseModel warehouseModel) {
        log.info("Warehouse ID -> {} with {} updated", warehouseId, warehouseModel);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/warehouses/{warehouseId}")
    public ResponseEntity<?> deleteMapping(@PathVariable(name = "warehouseId") Integer warehouseId) {
        log.info("Warehouse ID -> {} deleted ", warehouseId);
        return ResponseEntity.ok().build();
    }


}
