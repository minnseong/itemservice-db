package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // jpa 엔티티로 관리, 테이블과 매핑되어 관리
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // DB에서 값을 넣어줌, auto_increment
    private Long id;

    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    // JPA : public 또는 protected 의 기본 생성자가 필수!
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
