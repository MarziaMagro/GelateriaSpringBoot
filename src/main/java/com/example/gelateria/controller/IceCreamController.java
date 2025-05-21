package com.example.gelateria.controller;

import com.example.gelateria.api.GelatoApi;
import com.example.gelateria.model.IceCreamDto;
import com.example.gelateria.model.SellIceCreamRequestDto;
import com.example.gelateria.service.IceCreamService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class IceCreamController implements GelatoApi {
    private final IceCreamService iceCreamService;


    public IceCreamController(IceCreamService iceCreamService) {
        this.iceCreamService = iceCreamService;

    }

    @Override
    public ResponseEntity<IceCreamDto> createIceCream(IceCreamDto iceCreamDto) {
        return ResponseEntity.ok(iceCreamService.createIceCream(iceCreamDto));
    }

    @Override
    public ResponseEntity<List<IceCreamDto>> getAllIceCreams() {
        return ResponseEntity.ok(iceCreamService.getAll());
    }

    @Override
    public ResponseEntity<IceCreamDto> getIceCreamById(Integer id) {
        IceCreamDto byId = iceCreamService.getIceCreamById(id);
        return ResponseEntity.ok(byId);
    }

    @Override
    public ResponseEntity<IceCreamDto> sellIceCream(Integer id, SellIceCreamRequestDto request) {
        IceCreamDto updated = iceCreamService.sellIceCream(id, request.getQuantity());
        return ResponseEntity.ok(updated);
    }

}
