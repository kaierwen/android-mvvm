package com.kaierwen.android.mvvm.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.kaierwen.android.mvvm.model.Product;

/**
 * @author kaiyuan.zhang
 * @since 2019/4/26 15:22
 */
@Entity(tableName = "products")
public class ProductEntity implements Product {

    @PrimaryKey
    private int id;
    private String name;
    private String description;
    private int price;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
