package com.example.gelateria.mapper;

import com.example.gelateria.entity.IceCreamTaste;
import com.example.gelateria.model.IceCreamDto;

/**
 * Conversione tra IceCreamTaste (entity) e IceCreamTasteEnum (DTO)
 * Perchè? ---> i due enum sono distinti e non compatibili direttamente
 * --> evita errori di tipo o valori nulli
 */

public class TasteMapping {

    public static IceCreamDto.IceCreamTasteEnum toDtoEnum(IceCreamTaste taste) {
        if (taste == null) return null;
        return IceCreamDto.IceCreamTasteEnum.valueOf(taste.name());
    }

    public static IceCreamTaste toEntityEnum(IceCreamDto.IceCreamTasteEnum dtoEnum) {
        if (dtoEnum == null) return null;
        return IceCreamTaste.valueOf(dtoEnum.name());
    }
}



