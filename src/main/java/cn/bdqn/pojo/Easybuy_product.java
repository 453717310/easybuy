package cn.bdqn.pojo;

/**
 * Created by dll on 2017/8/17.
 * 产品类
 */
public class Easybuy_product {
    private Integer id;//商品id
    private String name;//商品名称
    private String description;//商品描述
    private Float price;//商品价格
    private Integer stock;//商品库存
    private Integer categoryLevel1Id;//商品分类一
    private Integer categoryLevel2Id;//商品分类二
    private Integer categoryLevel3Id;//商品分类三
    private String fileName;//文件名称
    private Integer isDelete;//是否删除(1：删除 0：未删除)

    public Easybuy_product() {
    }

    public Easybuy_product(Integer id, String name, String description, Float price, Integer stock, Integer categoryLevel1Id, Integer categoryLevel2Id, Integer categoryLevel3Id, String fileName, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryLevel1Id = categoryLevel1Id;
        this.categoryLevel2Id = categoryLevel2Id;
        this.categoryLevel3Id = categoryLevel3Id;
        this.fileName = fileName;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoryLevel1Id() {
        return categoryLevel1Id;
    }

    public void setCategoryLevel1Id(Integer categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }

    public Integer getCategoryLevel2Id() {
        return categoryLevel2Id;
    }

    public void setCategoryLevel2Id(Integer categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }

    public Integer getCategoryLevel3Id() {
        return categoryLevel3Id;
    }

    public void setCategoryLevel3Id(Integer categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Easybuy_product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", categoryLevel1Id=" + categoryLevel1Id +
                ", categoryLevel2Id=" + categoryLevel2Id +
                ", categoryLevel3Id=" + categoryLevel3Id +
                ", fileName='" + fileName + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
