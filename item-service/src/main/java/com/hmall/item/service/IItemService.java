package com.hmall.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.item.pojo.Item;

public interface IItemService extends IService<Item> {
    void updateStatus(Long id, Integer status);

    void deductStock(Long itemId, Integer num);
}
