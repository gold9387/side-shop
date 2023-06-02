package com.side.shop.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaladForm {

    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    private String main;
}
