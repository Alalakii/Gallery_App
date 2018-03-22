package com.example.jacka.gfgallery;

/**
 * Created by JackA on 12/24/2017.
 */

public class Girl {
    private String name;
    private int girl_id;
    private String normal_id;
    private String damage_id;


    public Girl(String name, int girl_id, String normal_id, String damage_id) {
        this.name = name;
        this.girl_id = girl_id;
        this.normal_id = normal_id;
        this.damage_id = damage_id;
    }

    public String getName() {
        return name;
    }

    public int getGirl_id() {
        return girl_id;
    }

    public String getNormal_id() {
        return normal_id;
    }

    public String getDamage_id() {
        return damage_id;
    }
}
