package com.demo.inventoryservice.controller;

import com.demo.inventoryservice.dto.InventoryResponse;
import com.demo.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
    // http://localhost:8082/api/inventory/ihpone-13,ihpone13-red

    // http://localhost:8082/api/inventory?skuCode=ihpone-13&skuCode=ihpone13-red
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
