package com.airmart.itemservice.itemquery.dto;

import com.airmart.itemservice.itemquery.domain.ItemEntryVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class ItemQueryDTO {
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response{
        List<ItemEntryVO> itemList;
    }
}
