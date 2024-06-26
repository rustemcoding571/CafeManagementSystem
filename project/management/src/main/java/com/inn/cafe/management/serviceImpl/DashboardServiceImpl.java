package com.inn.cafe.management.serviceImpl;

import com.inn.cafe.management.dao.BillDao;
import com.inn.cafe.management.dao.CategoryDao;
import com.inn.cafe.management.dao.ProductDao;
import com.inn.cafe.management.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {

    private final CategoryDao categoryDao;

    private final ProductDao productDao;

    private final BillDao billDao;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        Map<String,Object> map = new HashMap<>();
        map.put("category",categoryDao.count());
        map.put("product",productDao.count());
        map.put("bill",billDao.count());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
