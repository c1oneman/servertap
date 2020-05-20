package io.servertap.api.v1.models;

public class ItemStack {

    private Integer count = null;

    private Integer slot = null;

    private String id = null;

    public ItemStack slot(Integer slot) {
        this.slot = slot;
        return this;
    }

    public void setSlot(Integer slot){
        this.slot = slot;
    }

    public Integer getSlot(){
        return this.slot;
    }

    public ItemStack id(String id){
        this.id = id;
        return this;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public ItemStack count(Integer count){
        this.count = count;
        return this;
    }

    public void setCount(Integer count){
        this.count = count;
    }

    public Integer getCount(){
        return this.count;
    }
}