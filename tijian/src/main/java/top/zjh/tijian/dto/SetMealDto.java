package top.zjh.tijian.dto;

import top.zjh.tijian.pojo.CheckItem;

import java.util.List;

public class SetMealDto {
    private Integer smId;
    private String name;
    private Integer type;
    private Integer price;
    private List<CheckItem> checkItems;


    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<CheckItem> getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(List<CheckItem> checkItems) {
        this.checkItems = checkItems;
    }


}
