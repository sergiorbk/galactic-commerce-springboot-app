package com.sergosoft.intergalacticmarketplace.service.impl;

import com.sergosoft.intergalacticmarketplace.repository.ProductRepository;

import com.sergosoft.intergalacticmarketplace.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
}
