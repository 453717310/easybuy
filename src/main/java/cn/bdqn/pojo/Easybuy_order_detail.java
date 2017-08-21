package cn.bdqn.pojo;

/**
 * Created by dll on 2017/8/17.
 * 订单与详情的关联表
 */
public class Easybuy_order_detail {
    private Integer id;//关联表id
    private Integer orderId;//订单主键
    private Integer productId;//商品主键
    private Integer quantity;//数量
    private Float cost;//消费

    public Easybuy_order_detail(Integer id, Integer orderId, Integer productId, Integer quantity, Float cost) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Easybuy_order_detail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Easybuy_order_detail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
